package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int width;
		int height;
		int box_area;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("사각형의 가로 길이를 입력하세요. -> ");
		width = sc.nextInt();
		System.out.println("사각형의 세로 길이를 입력하세요. -> ");
		height = sc.nextInt();
		
		box_area = width * height;
				
		System.out.println("사각형의 가로 길이는 " + width + "㎝입니다.");
		System.out.println("사각형의 세로 길이는 " + height + "㎝입니다.");
		System.out.printf("사각형의 넓이를 구했습니다. -> %d㎠\n", width * height);
		
		System.out.println("------------------------------------------------");
		
		double half;
		final double PI = 3.14;
		double round;
		double circle_area;
		
		System.out.println("[[원 도형과 넓비와 둘레 구하기]]");
		System.out.println("원 도형의 반지름을 입력하세요. -> ");
		half = sc.nextDouble();
		
		round = 2 * PI * half;
		circle_area = 3.14 * half * half;
		
		System.out.printf("원 도형의 반지름은  %.3f㎝입니다.\n", half);
		System.out.printf("둘레를 구했습니다. : %.3f㎝\n", 2 * PI * half);
		System.out.printf("넓이를 구했습니다. : %.3f㎠", 3.14 * half * half);
		
		sc.close();
		
		
		

	}

}
