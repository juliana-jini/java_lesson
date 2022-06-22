package koreait.test;

// 정답
public abstract class Product { //[3] Product 클래스를 추상클래스로 변경

	//[2] Product 클래스의 필드 접근 한정자를 protected
	protected int price;
	
	//[1] Product 클래스에 문자열 타입 '상품명'필드를 선언. 필드명은 prdName.
	//[2] Product 클래스의 필드 접근 한정자를 protected
	protected String prdName;
	
	//[3] sell이라는 추상메소드를 public으로 선언 : 메소드의 리턴타입은 String, 인자는 Object 1개
	public abstract String sell(Object object);

	
	
	
	
}
