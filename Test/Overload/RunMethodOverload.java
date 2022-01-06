package Test.Overload;

import java.util.Scanner;

public class RunMethodOverload {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MethodOverloadTest ot = new MethodOverloadTest();
	
		System.out.println("====두 수의 덧셈 ====");
		System.out.println("정수값 2개 입력 : ");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		System.out.printf("%d + %d = %d\n",n1,n2,ot.calc(n1,n2));
		
		System.out.println("====두 수의 곱셈====");
		System.out.println("실수값 2개 입력 : ");
		double n3=scan.nextDouble();
		double n4=scan.nextDouble();
		System.out.printf("%.1f * %.1f = %.3f\n",n3,n4,ot.calc(n3, n4));

	}

}
