package koreait.day08;

public class Score {

	private int korean;
	private int english;
	private int science;
	private String grade;	//getter, setter 작성해보기
					//값 예시 : A+, A, B+, B....
	
	//기본 생성자가 숨어 있습니다. 어떤 코드일까요? 접근 한정자는 public
	public Score() {
		
	}
	
	void setScience(int science) {
		this.science = science;
	}
	
	int getScience() {
		return science;
	}
	
	void setKorean(int korean) {
		this.korean=korean;
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
		//this는 setKorean 메소드 실행객체
	}
	
	int getKorean() {
		return korean;
	}
	
	
	void setEnglish(int english) {
		this.english=english;
	}
	
	int getEnglish() {
		return english;
	}
	
	void setGrade(String grade) {
		this.grade=grade;
	}
	
	String getGrade() {
		return grade;
	}
	
	
}
