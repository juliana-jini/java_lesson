package koreait.test;

// 정답
public class ProductTest {

	public static void main(String[] args) {

		//[13] mian 메소드에 Product 배열(크기는 10) cart를 선언
		Product[] cart = new Product[10];

		//[13] cart 배열이 다음과 같은 객체를 참조값으로 저장하도록 합니다.
		cart[0]= new Bike(123000,"MTB",25);
		cart[3]= new Bike(99000,"삼천리",15);
		cart[1]= new Electronics(35000,"USB");
		cart[5]= new Electronics(1170000,"ipad");
		cart[7]= new Electronics(2250000,"lg 냉장고");

		//테스트
		Bike bike = new Bike();  System.out.println(bike.sell(20));
		Electronics tv = new Electronics(); System.out.println(tv.sell("사운드바"));

		//[14] 위 13번에 생성된 cart 배열의 7번 인덱스 kwh 필드값을 0.9로 하여 power() 메소드 실행결과를 출력
		Electronics elec = (Electronics)cart[7];
		elec.setKwh(0.9);
		System.out.println(elec.power());
		System.out.println(cart[7]);

		//[15] 위 13번에 생성된 cart 배열의 상품 중 가격이 10만원 이상인 것을 출력
		//출력은 12번에서 작성한 형식으로 합니다.
		for(Product temp : cart) {
			if(temp != null && temp.price >= 100000 )
				System.out.println(temp);
		}

		//[16] 위 13번에 생성된 cart 배열 상품 중 자전거만 ride() 메소드 실행 결과를 출력
		for(Product temp : cart) {
			if(temp != null && temp instanceof Bike ) {
				Bike bik = (Bike)temp;
				System.out.println(bik.ride());
			}

		}

	}

}

class Electronics extends Product{

	//[8] Electronics 클래스에는 double kwh 필드를 접근 한정자 private으로 선언
	//private boolean automatic;
	private double kwh;

	//[9] Electronics 클래스는 생성자가 2개
	//디폴트 생성자
	public Electronics() {

	}

	//[9] price, prdName 필드를 초기화하는 커스텀 생성자
	public Electronics(int price, String prdName) {
		this.prdName=prdName;
		this.price=price;
	}

	//[5] Electronics 클래스에 sell 메소드 재정의
	//실행은 인자 Object를 전달받아 "묶음 상품 - %s (1set)"을 문자열로 리턴
	//String.format() 활용
	@Override
	public String sell(Object object) {
		return String.format("묶음상품 - %s (1set)", object);
	}

	//[12] Electronics 클래스의 필드값을 출력하도록 toString 메소드를 재정의
	//상속받은 필드도 포함
	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}

	//[11] Electronics 클래스는 power() 메소드를 public 한정자로 정의
	//실행은 kwh 필드값(시간당 전력소모량)으로 1일 24시간 전력소모량을 실수로 계산하여 리턴
	public double power() {
		return 24*kwh;
	}

	//[8] getter, setter 메소드를 작성
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