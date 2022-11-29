package java_modeling.ch01.asso2;

import java.util.Vector;

public class Course {
	// 필드 
	private String name; // 과목명
	private Vector<Student> students; // 수강신청한 학생들
	
	// 생성자 
	public Course(String name) {
		this.name = name;
		students = new Vector<Student>();
	}
	
	// 메소드 (과목명! private니까 게터 함수 생성)
	public String getName() {
		return name; 
	}
	
	// 수강신청한 학생을 추가한다
	public void addStudent(Student student) {
		students.add(student);
	}
	
	// 수강취소한 학생 제거 
	public void removeStudent(Student student) {
		students.remove(student);
	}
}
