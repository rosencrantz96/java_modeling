package java_modeling.ch01.asso3;

import java.util.Vector;

public class Student {
	// 필드
	private String name;
	private Vector<Transcript> transcripts; // 수강신청 리스트를(객체) 미리 저장 
		
	// 생성자
	public Student(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>(); // 우선 생성이 됩니당 
	}
	
	// 메소드 
	public void addTranscript(Transcript transcript) { // 성적 추가 
		transcripts.add(transcript); // 수강 신청한 객체가 하나씩 들어온다
	}
}
