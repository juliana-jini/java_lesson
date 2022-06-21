package koreait.day08;

//�ۼ���: ������
public class Member {

	private String name;
	private String email;
	private int age;
	private int level;

	
	//Ŀ���� ������ : name, email �ʵ� �ʱ�ȭ
	public Member(String name, String email) {	//() �ȿ��� ������ �� ���޹��� ����
		this.name=name;
		this.email=email;
	}
	
	
	/*
	 * public Member(String name) {		//������ �޼ҵ� : Ÿ�԰� ���ڰ����� ������ ������ �Ǿ�� �޼ҵ� �����ε�
	 * 		this.name=name;
	 * }
	 * 
	 * public Member(String email) {	//���� ���� : ���� �����ڿ� 2�� ���ÿ� ���ǵ� �� �����ϴ�.
	 * 		this.name=name;
	 * }
	 */
	
	
	//�⺻(default) ������ : ��¹� �߰�
	public Member() {
		System.out.println("name, email, age, level �ʵ�� �⺻���Դϴ�.");
		System.out.println("name = " + this.name);	//this�� �޼ҵ带 �����ϴ� ��ü
		System.out.println("age = " + this.age);
	}
	
	
	//setter
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//getter
	public int getAge() {
		return age;
	}
	
	public int getLevel() {
		return level;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	
	
	
}
