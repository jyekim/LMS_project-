package kr.happyjob.study.std.dao;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.std.model.MyLecInfoVo;
import kr.happyjob.study.std.model.SurveyInfoVo;


public interface MyLecInfoDao {

	/** 나의 수강목록 조회 */
	public List<MyLecInfoVo> myLecList(Map<String, Object> paramMap) throws Exception;
	
	/** 나의 수강목록 카운트 조회 */
	public int myLecListCnt(Map<String, Object> paramMap) throws Exception;

	/** 나의 수강목록 상세보기 */
	public List<MyLecInfoVo> myLecDetail(Map<String, Object> paramMap) throws Exception;
	
	/** 나의 수강목록 상세보기 카운트 조회 */
	public int myLecDetailCnt(Map<String, Object> paramMap) throws Exception;
	
	/** 설문조사 문항 조회 */
	public List<SurveyInfoVo> surveyItemList(Map<String, Object> paramMap) throws Exception;
	
	/** 설문조사 문항 카운트 조회 */
	public int surveyItemListCnt(Map<String, Object> paramMap) throws Exception;
	
	/** 설문조사 제출 */	
	public int submitSurvey(Map<String, Object> paramMap) throws Exception;
	
	/** 설문조사 응답 등록  */	
	public int registerSurveyResponse(Map<String, Object> paramMap) throws Exception;
	
	/** 설문조사 여부 컬럼 업데이트 */	
	public int updateLecStdInfoSrvyYn(Map<String, Object> paramMap) throws Exception;
}