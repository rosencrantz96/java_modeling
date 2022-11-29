package java_modeling.ch01.gip;

// 합성관계 
public class Computer { // Main에서 Computer 객체를 생성할 때 아래 클래스들도 생성되는 것임 
	private MainBoard mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;
	
	public Computer() { // 객체를 생성할 때 각각 필드에서도 같이 생성된다? 
		this.mb = new MainBoard();
		this.c = new CPU();
		this.m = new Memory();
		this.ps = new PowerSupply();
	}
}
