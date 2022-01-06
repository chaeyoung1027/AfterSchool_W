package Test.construct;

public class constructorTest1 {
	private int n;
	
	public int getN() {
		return n;
	}
	
	public void setN() {
		this.n = n;
	}
	
	public constructorTest1(int n) {
		this.n = n;
		System.out.println("constructorTest("+n+") È£Ãâ");
	}
	
}
