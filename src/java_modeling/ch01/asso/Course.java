package java_modeling.ch01.asso;

public class Course { // 단방향. Student는 Course를 알지만 반대는 아님. 
	// 필드 
	private String name; // 과목명
	
	// 생성자 
	public Course(String name) {
		this.name = name;
	}
	
	// 메소드 (과목명! private니까 게터 함수 생성)
	public String getName() {
		return name; 
	}
}
