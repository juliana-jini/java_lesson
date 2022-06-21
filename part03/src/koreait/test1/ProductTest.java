package koreait.test1;

// ¿€º∫¿⁄ : ¡∂¿±¡¯
public class ProductTest {

	public static void main(String[] args) {
		
		//[13]
		Product[] cart = new Product[10];
		
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "ªÔ√µ∏Æ", 15);
		cart[1] = new Electronics(35000, "USB");
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg ≥√¿Â∞Ì");
		
		//[14]
		System.out.println(((Electronics) cart[7]).power(0.9));
		
		//[15]
		for(Product temp : cart) { 
			if(temp!=null && temp.price >= 100000)
				System.out.println(temp);
		}
		
		//[16]
		System.out.println(((Bike) cart[0]).ride(25));
		System.out.println(((Bike) cart[3]).ride(15));
		
	}
	
}

class Electronics extends Product {

	//[8]
	private double kwh;
	
	//[9]
	public Electronics() {
		
	}
	
	//[9]
	public Electronics(int price, String prdName) {
		this.price=price;
		this.prdName=prdName;
	}
	
	//[5]
	@Override
	public String sell(Object object) {
		return String.format("π≠¿Ω ªÛ«∞ - %s (1set)", object);
	}

	//[11]
	public double power(double kwh) {
		return kwh*24;
	}
	
	//[8]
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	
	//[8]
	public double getKwh() {
		return kwh;
	}

	//[12]
	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}

		
}


