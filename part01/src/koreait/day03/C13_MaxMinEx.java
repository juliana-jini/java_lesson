package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		//���� : 3���� ���� �Է� �� �߿��� ���� ū ���� ����մϴ�. �񱳿� ����
		
		//�ۼ��� : ������
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3;
		int max;
		
		System.out.println("n1�� ���� �Է��ϼ���. : ");	
		n1 = sc.nextInt();
		
		System.out.println("n2�� ���� �Է��ϼ���. : ");	
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println(max = n1);
		}else { 
			System.out.println(max = n2);
		}
		
		System.out.println("n3�� ���� �Է��ϼ���. : ");	
		n3 = sc.nextInt();

		if(max < n3)  
			System.out.println(max = n3);
		
		
		System.out.println("�ִ밪 : " + max);
		
		
	

	}

}
