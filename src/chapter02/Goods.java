package chapter02;

public class Goods {
	static int countOfGoods;

	public Goods(){
//		Goods.countOfGoods = Goods.countOfGoods + 1;
		countOfGoods = countOfGoods + 1;
	}
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		if( countSold < 0 ) {
			countSold = 0;
		}
		this.countSold = countSold;
	}

	public int calcDiscountPrice( int percentage ) {
		int dicountPrice = price - price * percentage / 100;
		return dicountPrice;
	}
	
	public void printInfo() {
		System.out.println( 
				"이름:" + name +
				",가격:" + price +
				",재고:" + countStock +
				",판매:" + countSold );		
	}
}
