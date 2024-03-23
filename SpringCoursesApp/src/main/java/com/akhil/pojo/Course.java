package com.akhil.pojo;

public class Course {
	private Integer courseId;
	private String courseName;
	private Integer coursePrice;
	private String courseDescription;
	
	public Course() {
		super();
	}
	public Course(Integer courseId, String courseName, Integer coursePrice, String courseDescription) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.courseDescription = courseDescription;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(Integer coursePrice) {
		this.coursePrice = coursePrice;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice
				+ ", courseDescription=" + courseDescription + "]";
	}
	
	
}
