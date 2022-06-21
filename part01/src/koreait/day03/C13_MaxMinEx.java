package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		//문제 : 3개의 정수 입력 값 중에서 가장 큰 값을 출력합니다. 비교와 결정
		
		//작성자 : 조윤진
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3;
		int max;
		
		System.out.println("n1의 값을 입력하세요. : ");	
		n1 = sc.nextInt();
		
		System.out.println("n2의 값을 입력하세요. : ");	
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println(max = n1);
		}else { 
			System.out.println(max = n2);
		}
		
		System.out.println("n3의 값을 입력하세요. : ");	
		n3 = sc.nextInt();

		if(max < n3)  
			System.out.println(max = n3);
		
		
		System.out.println("최대값 : " + max);
		
		
	

	}

}
