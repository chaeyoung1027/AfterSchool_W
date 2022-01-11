package test.abstract1;

public class RunWeapon {

	public static void main(String[] args) {
		Soldier s = new Soldier();
		Tank t = new Tank();
		Fighter f = new Fighter();
		
		s.fire();
		s.walk();
		
		t.messege();
		t.fire();
		t.forwalk();
		
		f.fire();
		f.fly();
		
	}

}
