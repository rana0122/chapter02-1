package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.setName( "nikkon" );
		goods.setPrice( 200000 );
		goods.setCountSold( -10 );
		goods.setCountStock( 30 );

		goods.printInfo();
		System.out.println( goods.getName() );
		System.out.println( goods.calcDiscountPrice( 20 ) );
		
		Goods goods1 = new Goods();
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		System.out.println( Goods.countOfGoods );
		double i = 3 * Math.PI;
		int a = 10; //변수
		a = 20;
		final int B = 20; //상수(값대입은 여기서 끝)
		//b = 30; // 에러
	}

}
