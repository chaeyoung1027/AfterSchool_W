package mvc.controler;
import java.util.ArrayList;
import java.util.Scanner;

import mvc.view.kioskView;
import mvc.vo.OrderMenuVO;

public class KioskController {
	private static int[] price = {3000,5000,3500,5000,4000};
	
	public static void selectMenuPrint() {
		System.out.println("******************���� �޴� ����****************");
		System.out.println("1.������ \t 2.�̸� \t 3.���� \t 4.Ƣ�� \t 5.���");
		System.out.println("*******************************************");
	}
	
	public static void main(String args[]) {
		ArrayList<OrderMenuVO> orderMenuArrList = new ArrayList<OrderMenuVO>();
		Scanner s1 = new Scanner(System.in);//���ڿ� �Է¿�
		Scanner s2 = new Scanner(System.in);//���� �Է¿�;
		
		selectMenuPrint();
		int orderNo = 1;
		
		while(true) {
			System.out.print("* ������ �޴��� ��ȣ�� �Է����ּ��� : ");
			int menuNo = s2.nextInt();
			System.out.print("* ������ �޴��� ������ �Է����ּ��� : ");
			int menucount = s2.nextInt();
			
			OrderMenuVO om = new OrderMenuVO(orderNo, menuNo, price[menuNo-1], menucount);
			orderMenuArrList.add(om);
			System.out.println("* �޴��� ��� �����Ͻðڽ��ϱ�?(y/n)");
			String msg = s1.nextLine();
			if(msg.equals("n")||msg.equals("no"))
				break;
			
		}
		//��ü �ֹ� ���� ���
		kioskView view = new kioskView(orderMenuArrList);
		view.print();
		System.out.println();
		
		//���� �� �Ϸ� ȭ�� ���
		System.out.println("*********************************");
		System.out.println(orderNo +" ������ ���� �� �ֹ��� �Ϸ�Ǿ����ϴ�.");
		System.out.println("*********************************");
		s1.close();
		s2.close();
	}
}
