package test.arrylist;

//ArrayList�� java.util ��Ű���� Ŭ�����̴�.
import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String args[]) {
		//�迭�� ���ѵ� ������ ��������� ���(�迭��ü ������ �� ���� ���ϱ� ������
		//ArrayList�� ���� ���� ���� �ʿ��� ��ŭ ��������� �߰�(add)�ؼ� ����� �� �ִ�.
		//ArrayList�� ���� ���� ���� �ʿ��� ��ŭ ��������� ����(remove)�� �� �ִ�.
		
		//ArrayList ��ü ���� : GenericType(����� ����� �ڷ���)
		//<�ȿ��� ������ �������� �ڷ���>
		ArraytList<String> arrList = new ArrayList<String>();
		//ArrayList�� �����͸� �߰��Ѵ�.
		arrList.add("������");
		arrList.add("�輭��");
		arrList.add("������");
		arrList.add("�ΰ���");
		arrList.add("��ٿ�");
		arrList.add("�̿���");
		arrList.add("������");
		arrList.add("���ֿ�");
		
		arrList.remove(6);
		arrList.remove("�ΰ���");
		arrList.add("�μҸ�");

		for(int i = 0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
	}

}
