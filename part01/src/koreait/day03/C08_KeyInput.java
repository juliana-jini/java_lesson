package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int width;
		int height;
		int box_area;
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.println("�簢���� ���� ���̸� �Է��ϼ���. -> ");
		width = sc.nextInt();
		System.out.println("�簢���� ���� ���̸� �Է��ϼ���. -> ");
		height = sc.nextInt();
		
		box_area = width * height;
				
		System.out.println("�簢���� ���� ���̴� " + width + "���Դϴ�.");
		System.out.println("�簢���� ���� ���̴� " + height + "���Դϴ�.");
		System.out.printf("�簢���� ���̸� ���߽��ϴ�. -> %d��\n", width * height);
		
		System.out.println("------------------------------------------------");
		
		double half;
		final double PI = 3.14;
		double round;
		double circle_area;
		
		System.out.println("[[�� ������ �к�� �ѷ� ���ϱ�]]");
		System.out.println("�� ������ �������� �Է��ϼ���. -> ");
		half = sc.nextDouble();
		
		round = 2 * PI * half;
		circle_area = 3.14 * half * half;
		
		System.out.printf("�� ������ ��������  %.3f���Դϴ�.\n", half);
		System.out.printf("�ѷ��� ���߽��ϴ�. : %.3f��\n", 2 * PI * half);
		System.out.printf("���̸� ���߽��ϴ�. : %.3f��", 3.14 * half * half);
		
		sc.close();
		
		
		

	}

}
