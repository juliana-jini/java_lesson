package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int korean;
		int english;
		int science;
		
		System.out.println("[[성적 집계 : 평점과 총점 구하기]]");
		System.out.println("성적 입력하세요.");
		System.out.println("국어 -> ");
		korean = sc.nextInt();
		System.out.println("영어 -> ");
		english = sc.nextInt();
		System.out.println("과학 -> ");
		science = sc.nextInt();
		
		int total = (korean + english + science);
		int average = (total/3);
		double avg = (total/3);
		int subject_no = 3;
		
		System.out.println("처리되었습니다.");
		System.out.printf("총점 : %d", total);
		System.out.printf("평균 : %d(%.2f), 과목 수 : %d", average, avg, subject_no);
		
		System.out.println("-----------------------------------------------------");
		
		String best;		//특기 과목명 참조할 변수

		if(korean > english) {
			best = "국어";
			if(korean < science) {
				best = "과학";
			}
		}else {
			best = "영어";
			if(english < science) {
				best = "과학";
			}
		}
		
		
		System.out.printf("이 학생의 특기과목은 . %s . 입니다.", best);	//3개의 점수 중 가장 높은 점수의 과목 출력
		
		
		
		
		

	}

}
