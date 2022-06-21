package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  //키보드 입력시 nextLine() 과 nextInt() 등을 같이 쓰면 입력이 정상 실행 안됩니다.
		List<Word> mywords = new ArrayList<>();	//***mydic를 mywords로 바꿔서 구현해보기***
		
		String sel, eng, kor;
		int level;
		System.out.println("선택 기능 👉   1. 단어저장     2. 단어검색     3. 전체보기    4. 레벨로 검색    5. 프로그램 끝내기");
		boolean run = true;
		while (run) {
			System.out.print("선택 ✏->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":
				System.out.print("English -> ");
				eng = sc.nextLine();    //sc.nextInt();
				System.out.print("한글 뜻 -> ");
				kor = sc.nextLine();
				System.out.println("레벨 -> ");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new Word(eng, kor);
				temp.setLevel(level);
				mywords.add(temp);
				break;
			case "2":
				System.out.print("검색 단어 English -> ");
				eng = sc.nextLine();
				for(Word w : mywords)
					if(w.getEnglish().equals(eng))
						System.out.println("단어장 검색했습니다. 결과 =>" + w);
				break;
			case "3":
//				System.out.println("단어장 전체보기 :" + mywords);
				all(mywords);		//정렬하고 출력하기
				break;
			case "4":
				System.out.println("검색할 레벨 입력(1~3) -> ");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords, no);
				break;
			case "5":
				run=false;	
				break;
			default:
				System.out.println("👁‍🗨잘못 입력된 선택입니다.1~4 입력입니다.");
				break;
			}
		}	//while end
		System.out.println("::::  너의 단어장 종료합니다. ::::");
		
	}   

	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel() == no)
				System.out.println(w);
		
	}

	private static void all(List<Word> mywords) {	//mywords의 참조값 전달받아 동일한 객체를 가리킵니다.
		mywords.sort(new Comparator<Word>() {
			
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s %-10s", "English", "Korean", "Level"));
		System.out.println("-----------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s %-10d", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
	
	}	

}
