package mvc.vo;

public class OrderMenuVO {
	private int orderNo;
	private int menuNo;
	private int menuprice;
	private int menucount;
	
	public OrderMenuVO(int orderNo, int menuNo, int menuprice, int menucount) {
		this.orderNo = orderNo;
		this.menuNo = menuNo;
		this.menuprice = menuprice;
		this.menucount = menucount;
	}
	
	public int getMenuNo() {
		return menuNo;
	}
	public void setMenuName(int menuNo) {
		this.menuNo = menuNo;
	}
	public int getMenuprice() {
		return menuprice;
	}
	public void setMenuprice(int menuprice) {
		this.menuprice = menuprice;
	}
	public int getMenucount() {
		return menucount;
	}
	public void setMenucount(int menucount) {
		this.menucount = menucount;
	}
	public int getOrderNo() {
		return orderNo;
	}

	
	
}
