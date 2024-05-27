package kr.happyjob.study.employ.service;

import java.util.List;
import java.util.Map;

import kr.happyjob.study.employ.model.EmploymentModel;

public interface EmploymentService {

	/* 취업 목록 조회 */
	public List<EmploymentModel> empInfo(Map<String, Object> paramMap) throws Exception;

	public int emp_Total(Map<String, Object> paramMap)throws Exception;

	/* 취업 정보 등록(학생 리스트 조회)*/
	public List<EmploymentModel> stdList(Map<String, Object> paramMap)throws Exception;

	public int std_Total(Map<String, Object> paramMap)throws Exception;

	public List<EmploymentModel> std_info(Map<String, Object> paramMap)throws Exception;

	public int lec_count(Map<String, Object> paramMap)throws Exception;

	public List<EmploymentModel> std_detail(Map<String, Object> paramMap)throws Exception;

	public int stdemploy(Map<String, Object> paramMap)throws Exception;

	public List<EmploymentModel> compinfo(Map<String, Object> paramMap)throws Exception;

	public EmploymentModel stdinfo(Map<String, Object> paramMap)throws Exception;

	public int update_emp(Map<String, Object> paramMap)throws Exception;

	public int delEmploy(Map<String, Object> paramMap)throws Exception;



}
