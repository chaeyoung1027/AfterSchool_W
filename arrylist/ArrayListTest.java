package test.arrylist;

//ArrayList는 java.util 패키지의 클래스이다.
import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String args[]) {
		//배열은 제한된 개수의 저장공간을 사용(배열객체 생성할 때 개수 정하기 때문에
		//ArrayList는 개수 제한 없이 필요한 만큼 저장공간을 추가(add)해서 사용할 수 있다.
		//ArrayList는 개수 제한 없이 필요한 만큼 저장공간을 삭제(remove)할 수 있다.
		
		//ArrayList 객체 생성 : GenericType(저장될 요소의 자료형)
		//<안에는 저장할 데이터의 자료형>
		ArraytList<String> arrList = new ArrayList<String>();
		//ArrayList에 데이터를 추가한다.
		arrList.add("김윤서");
		arrList.add("배서연");
		arrList.add("백지민");
		arrList.add("민경주");
		arrList.add("양다연");
		arrList.add("이예진");
		arrList.add("유현주");
		arrList.add("이주완");
		
		arrList.remove(6);
		arrList.remove("민경주");
		arrList.add("인소리");

		for(int i = 0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
	}

}
