package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int korean;
		int english;
		int science;
		
		System.out.println("[[���� ���� : ������ ���� ���ϱ�]]");
		System.out.println("���� �Է��ϼ���.");
		System.out.println("���� -> ");
		korean = sc.nextInt();
		System.out.println("���� -> ");
		english = sc.nextInt();
		System.out.println("���� -> ");
		science = sc.nextInt();
		
		int total = (korean + english + science);
		int average = (total/3);
		double avg = (total/3);
		int subject_no = 3;
		
		System.out.println("ó���Ǿ����ϴ�.");
		System.out.printf("���� : %d", total);
		System.out.printf("��� : %d(%.2f), ���� �� : %d", average, avg, subject_no);
		
		System.out.println("-----------------------------------------------------");
		
		String best;		//Ư�� ����� ������ ����

		if(korean > english) {
			best = "����";
			if(korean < science) {
				best = "����";
			}
		}else {
			best = "����";
			if(english < science) {
				best = "����";
			}
		}
		
		
		System.out.printf("�� �л��� Ư������� . %s . �Դϴ�.", best);	//3���� ���� �� ���� ���� ������ ���� ���
		
		
		
		
		

	}

}
