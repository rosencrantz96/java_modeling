package java_modeling.ch01.asso3;

public class Transcript { // 수강신청
	// 연관관계에 의해 참조하는 속성(필드) 
	private Student student;
	private Course course;
	
	// Transcript 자체의 속성(필드) 
	private String date; // 성적 날짜
	private String grade; // 점수 
	
	// 생성자 
	public Transcript(Student student, Course course) {
		this.student = student;
		this.course = course;
		// Transcript 객체를 넘겨준다 (생성자가 실행되는 순간 Student와 Course에 쌓아줍니당)
		this.student.addTranscript(this); // 메소드 바로 실행 (수강신청 추가)
		this.course.addTranscript(this); // (수강포기 제거)
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
