package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		
		//�� + ���� => ���� ����Ű
		
		System.out.println("my test-------------------------------");
		int a = 23;
		int b = 19;
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.printf("���� : %d��\n", a);
		System.out.printf("���� : %d��\n", b);
		System.out.printf("�簢���� ���̸� ���߽��ϴ�. -> %d��\n", a*b);
		
		System.out.println("--------------------------------------");
		
		double r = 23.230;
		double pi = 3.14;
		double c = 2 * pi * r;
		double z = pi * r * r;
		
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.printf("������ : %.3f��\n", r);
		System.out.printf("�ѷ��� ���߽��ϴ�. : %.3f��\n", c);
		System.out.printf("���̸� ���߽��ϴ�. : %.3f��\n", z);
		
		System.out.println("-------------------------------my test");

		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		
		int width = 23;			//����ڰ� �Է��� ��
		int height = 19;		//����ڰ� �Է��� ��
		int box_area = width*height;
		
		System.out.println("���� : " + width + "��");
		System.out.println("���� : " + height + "��");
		System.out.println("���̸� ���߽��ϴ�. : " + box_area + "��");
		
		System.out.println("\n[[�� ������ �к�� �ѷ� ���ϱ�]]");
		final double PI = 3.14;
		double half = 23.230;						//����ڰ� �Է��� ��
		double round = 2 * PI * half;				//�ѷ�
		double circle_area = 3.14 * half * half;	//����
		
		System.out.printf("������ : %.3f��\n", half);
		System.out.printf("�ѷ��� ���߽��ϴ�. : %.3f��\n", round);
		System.out.printf("���̸� ���߽��ϴ�. : %.3f��\n", circle_area);
		
		
		//final �׽�Ʈ
		//		�������� �տ� final Ű���帣 ���̸� ���� �������� ���մϴ�.
		
		final int test = 123;		//���� ���� ���ϴ� ����Դϴ�.
		System.out.println("test =" + test);
	
		//test = 456;				//���� : final�� �����.

	}

}
