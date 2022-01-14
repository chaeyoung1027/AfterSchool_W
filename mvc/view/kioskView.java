package mvc.view;

import java.util.ArrayList;

import mvc.vo.OrderMenuVO;
	
public class kioskView{
	private ArrayList<OrderMenuVO> orderMenuArrList;
	private int sum;
	
	public kioskView(ArrayList<OrderMenuVO> orderMenuList) {
		this.orderMenuArrList = orderMenuList;
	}
	
	public String getMenuName(int menuNo) {
		String menuName = "";
		switch(menuNo) {
		case 1 :
			menuName = "������";
			break;
		case 2: 
			menuName = "�̸�";
			break;
		case 3 :
			menuName = "����";
			break;
		case 4 :
			menuName = "Ƣ��";
			break;
		case 5 :
			menuName = "���";
			break;
		default :
			System.out.println("�߸��� �޴���ȣ�� �Է��Ͽ����ϴ�.");
		}
		return menuName;
	}
	
	public void print() {
		System.out.println("============== �ֹ� ���� ==============");
		for(int i = 0; i<orderMenuArrList.size(); i++) {
			//ArrayList�� ����� OrderMenuVO�� ��ü �������� ��ȯ �޾Ƽ� ���� ������ �����Ѵ�.
			OrderMenuVO om = orderMenuArrList.get(i);
			
			//OrderMenuVO ��ü�� ������ ��ȯ�޾Ƽ� �ֹ������� ����Ѵ�.(�ݺ�)
			int price = om.getMenuprice();
			int count = om.getMenucount();
			System.out.printf("%d. %s : �ֹ�����(%d) �հ� : %d\n",
					i+1, getMenuName(om.getMenuNo()), price ,count, price*count);
			sum += price * count;
		}
		System.out.printf("�����ݾ� : %d��",sum);
	}
}
	