package com.example.demo.dao;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	

	@Id
	private Integer StudentID;
	private String StudentName;
	private String Student_Branch;
	private Integer Student_Age;
	private String yearOfJoin;
	private String StudentEmailID;
	private Integer StudentPhoneNumber;
	
	public Student() {
		
		System.out.println("  Student constructor is running from the Student class .");
	}

	public Integer getStudentID() {
		return StudentID;
	}

	public void setStudentID(Integer studentID) {
		StudentID = studentID;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudent_Branch() {
		return Student_Branch;
	}

	public void setStudent_Branch(String student_Branch) {
		Student_Branch = student_Branch;
	}

	public Integer getStudent_Age() {
		return Student_Age;
	}

	public void setStudent_Age(Integer student_Age) {
		Student_Age = student_Age;
	}

	public String getYearOfJoin() {
		return yearOfJoin;
	}

	public void setYearOfJoin(String yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}

	public String getStudentEmailID() {
		return StudentEmailID;
	}

	public void setStudentEmailID(String studentEmailID) {
		StudentEmailID = studentEmailID;
	}

	public Integer getStudentPhoneNumber() {
		return StudentPhoneNumber;
	}

	public void setStudentPhoneNumber(Integer studentPhoneNumber) {
		StudentPhoneNumber = studentPhoneNumber;
	}

	public Student(Integer studentID, String studentName, String student_Branch, Integer student_Age, String yearOfJoin,
			String studentEmailID, Integer studentPhoneNumber) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		Student_Branch = student_Branch;
		Student_Age = student_Age;
		this.yearOfJoin = yearOfJoin;
		StudentEmailID = studentEmailID;
		StudentPhoneNumber = studentPhoneNumber;
	}

	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", StudentName=" + StudentName + ", Student_Branch=" + Student_Branch
				+ ", Student_Age=" + Student_Age + ", yearOfJoin=" + yearOfJoin + ", StudentEmailID=" + StudentEmailID
				+ ", StudentPhoneNumber=" + StudentPhoneNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(StudentEmailID, StudentID, StudentName, StudentPhoneNumber, Student_Age, Student_Branch,
				yearOfJoin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(StudentEmailID, other.StudentEmailID) && Objects.equals(StudentID, other.StudentID)
				&& Objects.equals(StudentName, other.StudentName)
				&& Objects.equals(StudentPhoneNumber, other.StudentPhoneNumber)
				&& Objects.equals(Student_Age, other.Student_Age)
				&& Objects.equals(Student_Branch, other.Student_Branch) && Objects.equals(yearOfJoin, other.yearOfJoin);
	}
	
	
	
}
