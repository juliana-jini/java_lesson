package koreait.day02;

public class C04_DoubleData {

	public static void main(String[] args) {
		
		System.out.println("Float 실수데이터--------------");
		System.out.println("메모리 크기 : " + Float.BYTES + " 바이트");
		System.out.println("Float 실수의 최소값 : " + Float.MIN_VALUE);
		//1.4E-45는 1.4 x 10의 -45승, 3.4028235E38는 10의 38승
		System.out.println("Float 실수의 최대값 : " + Float.MAX_VALUE);
		
		System.out.println("Double 실수데이터--------------");
		System.out.println("메모리 크기 : " + Double.BYTES + " 바이트");
		System.out.println("Double 실수의 최소값 : " + Double.MIN_VALUE);
		System.out.println("Double 실수의 최대값 : " + Double.MAX_VALUE);

	}

}

/*	실수 데이터는 컴퓨터 구조에서 부동소수점 형식으로 다룹니다.
 *	예들 들면 1.23 x 10의 23승에서 1.23(가수)과 23(지수)을 각각 어떤 크기만큼 할당하느냐에 따라
 *	값의 표현범위와 정밀도(float은 가수부 소수점 7자리, double은 16자리)가 결정됩니다.
 *	
 *	실수 데이터 기본 형식 : float, double (변수선언할 때 사용할 키워드) 
 *		Wrapper 클래스는 Float, Double
 *		★★  1.234 리터럴은 double 형식입니다. ★★
 */

