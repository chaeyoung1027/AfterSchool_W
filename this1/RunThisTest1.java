package Test.this1;

public class RunThisTest1 {

	public static void main(String[] args) {

		ThisTest t1 = new ThisTest();
		t1.power(5);
		
		int x = 3, y = 3;
		System.out.printf("%dÀÇ %d Á¦°ö½ÂÀº %dÀÌ´Ù. ", x, y, t1.power(x,y));
		
	}

}
