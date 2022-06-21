package koreait.day07;

import java.util.Random;
import java.util.Scanner;

//5시 25분까지 파일 제출
public class C42_Day07Exam {
//작성자 : 조윤진
	public static void main(String[] args) {
	/*	
		처리조건
		1. 덧셈 문제는 두자리 덧셈입니다.
		2. 문제는 난수로 만듭니다.
		3. 테스트할때는 문제를 5개로 줄여서 하세요.
		4. 클래스 활용아니고 int 형 배열로만 하세요.
		5. 첫번째 피연산자 배열 두번째 피연산자 배열 사용자 입력 정답저장 배열
	
		모든문제 10개를 저장? or 틀린문제만 저장?
	*/			
		System.out.println("------------------------");
		System.out.println("빨간색 수학 2자리 덧셈 문제 풀기");
		System.out.println("------------------------");
		
		int[] x = new int[5];	//첫번째 피연산자
		int[] y = new int[5];	//두번째 피연산자
		int[] z = new int[5];	//사용자가 입력한 답
		int[] t = new int[5];	//입력한 답 중 정답
		int[] f = new int[5];	//입력한 답 중 오답
		
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작합니다.");
		
		for(int i=0;i<x.length;i++) 
			x[i] = r.nextInt(90)+10; //n보다 크거나 같고 m보다 작은 범위 난수 : r.nextInt(m-n)+n
		
		for(int i=0;i<y.length;i++) 
			y[i] = r.nextInt(90)+10;
		
		for(int i=0;i<5;i++) {
			System.out.printf("\n문제 %d.\t%d + %d = 답 입력 -> ", (i+1), x[i], y[i]);
			z[i] = sc.nextInt();
						
			if(x[i] + y[i] == z[i])
				t[i] = z[i];
			
			if(x[i] + y[i] != z[i])
				f[i] = z[i];			
		} 
		
		int count=0;
		
		for(int i=0;i<5;i++) {
			if(t[i] != 0)
				count+=1;
		}
				
		System.out.println("------------------------");
		System.out.printf("채점합니다. 맞은 갯수 %d (%d점)", count, count*20);
		System.out.println("\n:::: 틀린 문제 정답 보기 ::::");
		
		for(int i=0;i<5;i++) {
			if(x[i] + y[i] != z[i])
				System.out.printf("\n문제 %d.\t%d + %d = %d", (i+1), x[i], y[i], f[i]);
		}


		
	}

}
