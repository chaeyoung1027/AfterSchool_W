package test.overriding;

public class RunWeapon {

	public static void main(String[] args) {
		Boom b = new Boom();
		b.fire();
		laser l = new laser();
		l.fire();

	}

}
