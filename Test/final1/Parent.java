package Test.final1;

public class Parent {
//final 필드는 초기화된 값만 사용할 수 있고 변경이 불가하다.(필드 값 변경 금지)
	final int restTime = 10;
	
	public void rest() {
//		restTime = 10;
		System.out.println(restTime + "10분간 휴식을 한다.");
	}

}
