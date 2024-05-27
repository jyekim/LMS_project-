package kr.happyjob.study.std.model;

import java.util.Date;

public class LectureModel {

	private int lec_id; // 강의ID
	private String tutor_id; // 강사ID
	private int lecrm_id; // 강의실ID
	private String lec_name; // 강의명
	private String lecrm_name; // 강의실 이름
	private int max_pnum; // 최대 인원
	private int pre_pnum; // 수강 인원
	private Date start_date; // 개강일
	private Date end_date; // 종강일
	private String lec_goal; // 수업목표
	private int test_id; // 시험ID
	private String test_start; // 시험시작일
	private String test_end; // 시험마감일
	private int lec_type_id; // 강의분류ID
	private String lec_type_name; // 강의분류명
	private String lec_sort; // 수강대상
	
	private String name;
	private String tel;
	private String mail;
	
	private String week; // 주차
	private String learn_goal; // 학습 목표
	private String learn_con; // 학습내용
	
	public int getLec_id() {
		return lec_id;
	}
	public void setLec_id(int lec_id) {
		this.lec_id = lec_id;
	}
	public String getTutor_id() {
		return tutor_id;
	}
	public void setTutor_id(String tutor_id) {
		this.tutor_id = tutor_id;
	}
	public int getLecrm_id() {
		return lecrm_id;
	}
	public void setLecrm_id(int lecrm_id) {
		this.lecrm_id = lecrm_id;
	}
	public String getLec_name() {
		return lec_name;
	}
	public void setLec_name(String lec_name) {
		this.lec_name = lec_name;
	}
	public String getLecrm_name() {
		return lecrm_name;
	}
	public void setLecrm_name(String lecrm_name) {
		this.lecrm_name = lecrm_name;
	}
	public int getMax_pnum() {
		return max_pnum;
	}
	public void setMax_pnum(int max_pnum) {
		this.max_pnum = max_pnum;
	}
	public int getPre_pnum() {
		return pre_pnum;
	}
	public void setPre_pnum(int pre_pnum) {
		this.pre_pnum = pre_pnum;
	}

	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getLec_goal() {
		return lec_goal;
	}
	public void setLec_goal(String lec_goal) {
		this.lec_goal = lec_goal;
	}
	public int getTest_id() {
		return test_id;
	}
	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}
	public String getTest_start() {
		return test_start;
	}
	public void setTest_start(String test_start) {
		this.test_start = test_start;
	}
	public String getTest_end() {
		return test_end;
	}
	public void setTest_end(String test_end) {
		this.test_end = test_end;
	}
	public int getLec_type_id() {
		return lec_type_id;
	}
	public void setLec_type_id(int lec_type_id) {
		this.lec_type_id = lec_type_id;
	}
	public String getLec_type_name() {
		return lec_type_name;
	}
	public void setLec_type_name(String lec_type_name) {
		this.lec_type_name = lec_type_name;
	}
	public String getLec_sort() {
		return lec_sort;
	}
	public void setLec_sort(String lec_sort) {
		this.lec_sort = lec_sort;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getLearn_goal() {
		return learn_goal;
	}
	public void setLearn_goal(String learn_goal) {
		this.learn_goal = learn_goal;
	}
	public String getLearn_con() {
		return learn_con;
	}
	public void setLearn_con(String learn_con) {
		this.learn_con = learn_con;
	}
	
}
