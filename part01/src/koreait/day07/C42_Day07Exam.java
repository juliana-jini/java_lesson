package koreait.day07;

import java.util.Random;
import java.util.Scanner;

//5�� 25�б��� ���� ����
public class C42_Day07Exam {
//�ۼ��� : ������
	public static void main(String[] args) {
	/*	
		ó������
		1. ���� ������ ���ڸ� �����Դϴ�.
		2. ������ ������ ����ϴ�.
		3. �׽�Ʈ�Ҷ��� ������ 5���� �ٿ��� �ϼ���.
		4. Ŭ���� Ȱ��ƴϰ� int �� �迭�θ� �ϼ���.
		5. ù��° �ǿ����� �迭 �ι�° �ǿ����� �迭 ����� �Է� �������� �迭
	
		��繮�� 10���� ����? or Ʋ�������� ����?
	*/			
		System.out.println("------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("------------------------");
		
		int[] x = new int[5];	//ù��° �ǿ�����
		int[] y = new int[5];	//�ι�° �ǿ�����
		int[] z = new int[5];	//����ڰ� �Է��� ��
		int[] t = new int[5];	//�Է��� �� �� ����
		int[] f = new int[5];	//�Է��� �� �� ����
		
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����մϴ�.");
		
		for(int i=0;i<x.length;i++) 
			x[i] = r.nextInt(90)+10; //n���� ũ�ų� ���� m���� ���� ���� ���� : r.nextInt(m-n)+n
		
		for(int i=0;i<y.length;i++) 
			y[i] = r.nextInt(90)+10;
		
		for(int i=0;i<5;i++) {
			System.out.printf("\n���� %d.\t%d + %d = �� �Է� -> ", (i+1), x[i], y[i]);
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
		System.out.printf("ä���մϴ�. ���� ���� %d (%d��)", count, count*20);
		System.out.println("\n:::: Ʋ�� ���� ���� ���� ::::");
		
		for(int i=0;i<5;i++) {
			if(x[i] + y[i] != z[i])
				System.out.printf("\n���� %d.\t%d + %d = %d", (i+1), x[i], y[i], f[i]);
		}


		
	}

}
