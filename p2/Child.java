package p2;

import p1.Parent;

public class Child extends Parent {
	
	
	public void testProtected() {
		System.out.println("Parent¿« Protected field num1 : "+num1);
	}
	
	public static void main(String args[]) {
		Child c = new Child();
		c.testProtected();
	}

}
