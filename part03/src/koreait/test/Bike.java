package koreait.test;

// 정답
public class Bike extends Product {
	
	//[6] Bike 클래스에는 int speed 필드를 접근한정자 private로 선언
	private int speed; 
	
	//[7] Bike 클래스는 public 생성자가 2개
	//[7] 디폴트 생성자
	public Bike() { 
		
	}
	
	//[7] price, prdName, speed 필드를 초기화하는 커스텀 생성자
	public Bike(int price, String prdName, int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//[4] Bike 클래스에 sell 메소드를 재정의
	//실행은 인자 Object를 전달받아 "추가 할인 행사 - %d%% 인하"을 문자열로 리턴합니다. String format() 활용
	@Override
	public String sell(Object object) {
		return String.format("추가 할인 행사 - %d%% 인하", object);
	}
	
	//[12] Bike 클래스의 필드값을 출력하도록 toString 메소드를 재정의
	//상속받은 필드도 포함
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	//[10] Bike 클래스는 ride() 메소드를 public 한정자로 정의
	//실행은 "당신은 이것을 시속 20km로 탈 수 있습니다."와 같이 speed 필드값을 이용하여 문자열을 리턴
	public String ride() {
		return "당신은 이것을 시속 " + speed + "km로 탈 수 있습니다.";
	}
	
	//[6] getter, setter 메소드를 public으로 작성
	public int getSpeed() {
		return speed;
	}
	
	//[6]
	public void setSpeed(int speed) {
		this.speed = speed;
	}
		
}
