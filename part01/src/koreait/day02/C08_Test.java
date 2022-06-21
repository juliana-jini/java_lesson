package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		
		//ㄹ + 한자 => 단위 단축키
		
		System.out.println("my test-------------------------------");
		int a = 23;
		int b = 19;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.printf("가로 : %d㎝\n", a);
		System.out.printf("세로 : %d㎝\n", b);
		System.out.printf("사각형의 넓이를 구했습니다. -> %d㎠\n", a*b);
		
		System.out.println("--------------------------------------");
		
		double r = 23.230;
		double pi = 3.14;
		double c = 2 * pi * r;
		double z = pi * r * r;
		
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.printf("반지름 : %.3f㎝\n", r);
		System.out.printf("둘레를 구했습니다. : %.3f㎝\n", c);
		System.out.printf("넓이를 구했습니다. : %.3f㎠\n", z);
		
		System.out.println("-------------------------------my test");

		System.out.println("[[사각형 도형의 넓이 구하기]]");
		
		int width = 23;			//사용자가 입력할 값
		int height = 19;		//사용자가 입력할 값
		int box_area = width*height;
		
		System.out.println("가로 : " + width + "㎝");
		System.out.println("세로 : " + height + "㎝");
		System.out.println("넓이를 구했습니다. : " + box_area + "㎠");
		
		System.out.println("\n[[원 도형과 넓비와 둘레 구하기]]");
		final double PI = 3.14;
		double half = 23.230;						//사용자가 입력할 값
		double round = 2 * PI * half;				//둘레
		double circle_area = 3.14 * half * half;	//넓이
		
		System.out.printf("반지름 : %.3f㎝\n", half);
		System.out.printf("둘레를 구했습니다. : %.3f㎝\n", round);
		System.out.printf("넓이를 구했습니다. : %.3f㎠\n", circle_area);
		
		
		//final 테스트
		//		변수선언 앞에 final 키워드르 붙이면 값을 변경하지 못합니다.
		
		final int test = 123;		//값을 변경 못하는 상수입니다.
		System.out.println("test =" + test);
	
		//test = 456;				//오류 : final로 선언됨.

	}

}
