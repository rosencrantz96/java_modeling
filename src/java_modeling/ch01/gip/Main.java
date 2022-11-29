package java_modeling.ch01.gip;

public class Main {

	public static void main(String[] args) {
		// 1. 합성관계 
		// 컴퓨터만 생성해도 컴퓨터 부품들이 다 생성된다. 
		Computer com = new Computer();
		// 컴퓨터가 사라지면 컴퓨터 부품들도 다 사라진다. 
		com = null; // 이래버리면 부품들도 전부 사라진다. 이것이 합성 관계... 
		
		// 2. 집약관계 
		MainBoard mb = new MainBoard();
		CPU c = new CPU();
		Memory m = new Memory();
		PowerSupply ps = new PowerSupply();
		
		Computer2 c2 = new Computer2(mb, c, m, ps); // 객체 생성
		c2 = null; // 사라진다고 해도 부품은 남아있음 
	
	}

}
