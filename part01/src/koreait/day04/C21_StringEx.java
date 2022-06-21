package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
//�ۼ��� : ������ -> �ҽ� �Ϸ��ϸ� DM���� ���� �����ּ���.
	public static void main(String[] args) {
		
		/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
		 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
		 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
		 *  
		 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
		 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ������ substring ������ ���ڿ��� equals ��
		 *  
		 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
		 *  
		 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		 *  		�� 3���� ���ڿ��� length() �� 6���� ��
		 *  
		 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
		 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
		 */

		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = true;
		
		System.out.println("����� �̸��� �Է��ϼ���. >>> ");
		email = sc.nextLine();				//Ű���� �Է��� ���ڿ��� ó���մϴ�.
		
//�Է��� email�� ó������ 1, 2, 4, 5�� �ش����� ������ �޽��� ����ϰ� isValid ������ false�� �մϴ�.
		
		
		int idx = email.indexOf('@');	//'@'�� ��ġ
		
		if(idx != -1 && idx == email.lastIndexOf('@')) {
			String account = email.substring(0, idx); //'@' ���� ����
			String domain = email.substring(idx+1);	//'@'�� ���� ������ �̸�
			if(domain.contentEquals("gmail.com")) {
				int len = account.length();
				if(len>=6) {
					if(!(account.indexOf('$') == -1 && account.indexOf('%') == -1)) {
						System.out.println("���� : $,%�� ����� �� ���� ��ȣ�Դϴ�.");
						isValid=false;
					}
				}else {
					System.out.println("���� �̸��� 6���� �̻� �����մϴ�.");
					isValid=false;
				}
			}else {
				System.out.println("������ �̸��� Ʋ���ϴ�.");
				isValid=false;
			}
		}else {
			System.out.println("�ùٸ� �̸��� ������ �ƴմϴ�.");
			isValid=false;
		}
		System.out.println(isValid);

		
		
			
		
	}

}
