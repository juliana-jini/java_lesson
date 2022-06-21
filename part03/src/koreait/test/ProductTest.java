package koreait.test;

// 정답
public class ProductTest {

	public static void main(String[] args) {

		//[13]
		Product[] cart = new Product[10];

		cart[0]= new Bike(123000,"MTB",25);
		cart[3]= new Bike(99000,"삼천리",15);
		cart[1]= new Electronics(35000,"USB");
		cart[5]= new Electronics(1170000,"ipad");
		cart[7]= new Electronics(2250000,"lg 냉장고");

		//테스트
		Bike bike = new Bike();  System.out.println(bike.sell(20));
		Electronics tv = new Electronics(); System.out.println(tv.sell("사운드바"));

		//[14]
		Electronics elec = (Electronics)cart[7];
		elec.setKwh(0.9);
		System.out.println(elec.power());
		System.out.println(cart[7]);

		//[15]
		for(Product temp : cart) {
			if(temp != null && temp.price >= 100000 )
				System.out.println(temp);
		}

		//[16]
		for(Product temp : cart) {
			if(temp != null && temp instanceof Bike ) {
				Bike bik = (Bike)temp;
				System.out.println(bik.ride());
			}

		}

	}

}

class Electronics extends Product{

	//[8]
	//private boolean automatic;
	private double kwh;

	//[9]
	public Electronics() {

	}

	//[9]
	public Electronics(int price, String prdName) {
		this.prdName=prdName;
		this.price=price;
	}

	//[5]
	@Override
	public String sell(Object object) {
		return String.format("묶음상품 - %s (1set)", object);
	}

	//[12]
	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}

	//[11]
	public double power() {
		return 24*kwh;
	}

	//[8]
	public double getKwh() {
		return kwh;
	}

	//[8]
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

//	public boolean isAutomatic() {
//		return automatic;
//	}
//
//	public void setAutomatic(boolean automatic) {
//		this.automatic = automatic;
//	}

}