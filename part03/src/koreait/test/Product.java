package koreait.test;

// ����
public abstract class Product { //[3] Product Ŭ������ �߻�Ŭ������ ����

	//[2] Product Ŭ������ �ʵ� ���� �����ڸ� protected
	protected int price;
	
	//[1] Product Ŭ������ ���ڿ� Ÿ�� '��ǰ��'�ʵ带 ����. �ʵ���� prdName.
	//[2] Product Ŭ������ �ʵ� ���� �����ڸ� protected
	protected String prdName;
	
	//[3] sell�̶�� �߻�޼ҵ带 public���� ���� : �޼ҵ��� ����Ÿ���� String, ���ڴ� Object 1��
	public abstract String sell(Object object);

	
	
	
	
}
