package Test.construct;

public class RunConstructorTest1 {

	public static void main(String[] args) {

		constructorTest1 ct1 = new constructorTest1(10);
		constructorTest1 ct2 = new constructorTest1(77);
		
		System.out.printf("ct1이 참조하는 객체의 필드 n = %d\n", ct1.getN());
		System.out.printf("ct2이 참조하는 객체의 필드 n = %d\n", ct2.getN());
		
		
	}

}
