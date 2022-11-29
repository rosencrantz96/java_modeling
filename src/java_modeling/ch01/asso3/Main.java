package java_modeling.ch01.asso3;

public class Main {

	public static void main(String[] args) {
		// 학생 두 명 생성 
		Student s1 = new Student("강이지");
		Student s2 = new Student("김춘배");
		
		// 과목 생성
		Course jv = new Course("java");
		Course dp = new Course("Design Pattern");
			
		// 수강신청
		Transcript t1 = new Transcript(s1, jv); // 강이지는 java를 수강신청
		Transcript t2 = new Transcript(s1, dp); // 강이지는 Design Pattern을 수강신청 
		Transcript t3 = new Transcript(s2, dp); // 김춘배는 Design Pattern을 수강신청 
			
		t1.setDate("2022"); 
		t1.setGrade("B0"); // 강이지 2022년 java 성적이 B0다. 
		
		t2.setDate("2022");
		t2.setGrade("D+"); // 강이지의 2022년 Design Pattern 성적이 D+이다.
		
		t3.setDate("2023");
		t3.setGrade("C+"); // 김춘배의 2023년 Design Pattern 성적이 C+이다. 
		
	}

}
