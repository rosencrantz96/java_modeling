package java_modeling.ch01.asso3;

import java.util.Vector;

public class Course {
	// 필드 
	private String name; // 과목명
	private Vector<Transcript> transcripts; 
	
	// 생성자 
	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	// 메소드 (과목명! private니까 게터 함수 생성)
	public String getName() {
		return name; 
	}
	
	
	// 성적 추가
	public void addTranscript(Transcript transcript) { 
		transcripts.add(transcript);
	}
	
}
