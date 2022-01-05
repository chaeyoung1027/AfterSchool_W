package Test.overload1;

public class RunOverLoadTest1 {

	public static void main(String[] args) {
		OverloadTest1 ot1 = new OverloadTest1();
		ot1.calc(100, 200);
		ot1.calc(10, 20, 50);
		
		System.out.println("ot1.calc(100, 200) 경과 : "+ot1.getResult1());
		System.out.println("ot1.calc(10, 20, 50) 경과 : "+ot1.getResult2());
	}

}
