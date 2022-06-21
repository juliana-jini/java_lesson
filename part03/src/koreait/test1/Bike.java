package koreait.test1;

// 작성자 : 조윤진
public class Bike extends Product {
	
	//[6]
	private int speed; 
	
	//[7]
	public Bike() { 
		
	}
	
	//[7]
	public Bike(int price, String prdName, int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//[4]
	@Override
	public String sell(Object object) {
		return String.format("추가 할인 행사 - %d %% 인하", object);
	}
	
	//[10]
	public String ride(int speed) {
		return "당신은 이것을 시속 " + speed + "km로 탈 수 있습니다.";
	}
	
	//[6]
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//[6]
	public int getSpeed() {
		return speed;
	}
	
	//[12]
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}

	
	
	
}
