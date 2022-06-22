package koreait.test;

// ����
public class Bike extends Product {
	
	//[6] Bike Ŭ�������� int speed �ʵ带 ���������� private�� ����
	private int speed; 
	
	//[7] Bike Ŭ������ public �����ڰ� 2��
	//[7] ����Ʈ ������
	public Bike() { 
		
	}
	
	//[7] price, prdName, speed �ʵ带 �ʱ�ȭ�ϴ� Ŀ���� ������
	public Bike(int price, String prdName, int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//[4] Bike Ŭ������ sell �޼ҵ带 ������
	//������ ���� Object�� ���޹޾� "�߰� ���� ��� - %d%% ����"�� ���ڿ��� �����մϴ�. String format() Ȱ��
	@Override
	public String sell(Object object) {
		return String.format("�߰� ���� ��� - %d%% ����", object);
	}
	
	//[12] Bike Ŭ������ �ʵ尪�� ����ϵ��� toString �޼ҵ带 ������
	//��ӹ��� �ʵ嵵 ����
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	//[10] Bike Ŭ������ ride() �޼ҵ带 public �����ڷ� ����
	//������ "����� �̰��� �ü� 20km�� Ż �� �ֽ��ϴ�."�� ���� speed �ʵ尪�� �̿��Ͽ� ���ڿ��� ����
	public String ride() {
		return "����� �̰��� �ü� " + speed + "km�� Ż �� �ֽ��ϴ�.";
	}
	
	//[6] getter, setter �޼ҵ带 public���� �ۼ�
	public int getSpeed() {
		return speed;
	}
	
	//[6]
	public void setSpeed(int speed) {
		this.speed = speed;
	}
		
}
