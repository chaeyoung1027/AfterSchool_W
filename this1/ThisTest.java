package Test.this1;

public class ThisTest {
	
	private int n;
	public void power(int n) {
		this.n = n * n;
		System.out.printf("%d�� �������� %d�̴�.", n, this.n);
	}
	
	public int power(int x, int y) {
		n = 1;
		for(int i = 0; i<y; i++) {
			n*= x;
		}
		return n;
	}
	
}