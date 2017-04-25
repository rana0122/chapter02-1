package chapter02;

public class Goods {
	static int countOfGoods;

	public Goods(){
//		Goods.countOfGoods = Goods.countOfGoods + 1;
		countOfGoods = countOfGoods + 1;
	}
	
	String name;
	int price;
	int countStock;
	int countSold;
	
}
