package koreait.test;

// ����
public class ProductTest {

	public static void main(String[] args) {

		//[13] mian �޼ҵ忡 Product �迭(ũ��� 10) cart�� ����
		Product[] cart = new Product[10];

		//[13] cart �迭�� ������ ���� ��ü�� ���������� �����ϵ��� �մϴ�.
		cart[0]= new Bike(123000,"MTB",25);
		cart[3]= new Bike(99000,"��õ��",15);
		cart[1]= new Electronics(35000,"USB");
		cart[5]= new Electronics(1170000,"ipad");
		cart[7]= new Electronics(2250000,"lg �����");

		//�׽�Ʈ
		Bike bike = new Bike();  System.out.println(bike.sell(20));
		Electronics tv = new Electronics(); System.out.println(tv.sell("�����"));

		//[14] �� 13���� ������ cart �迭�� 7�� �ε��� kwh �ʵ尪�� 0.9�� �Ͽ� power() �޼ҵ� �������� ���
		Electronics elec = (Electronics)cart[7];
		elec.setKwh(0.9);
		System.out.println(elec.power());
		System.out.println(cart[7]);

		//[15] �� 13���� ������ cart �迭�� ��ǰ �� ������ 10���� �̻��� ���� ���
		//����� 12������ �ۼ��� �������� �մϴ�.
		for(Product temp : cart) {
			if(temp != null && temp.price >= 100000 )
				System.out.println(temp);
		}

		//[16] �� 13���� ������ cart �迭 ��ǰ �� �����Ÿ� ride() �޼ҵ� ���� ����� ���
		for(Product temp : cart) {
			if(temp != null && temp instanceof Bike ) {
				Bike bik = (Bike)temp;
				System.out.println(bik.ride());
			}

		}

	}

}

class Electronics extends Product{

	//[8] Electronics Ŭ�������� double kwh �ʵ带 ���� ������ private���� ����
	//private boolean automatic;
	private double kwh;

	//[9] Electronics Ŭ������ �����ڰ� 2��
	//����Ʈ ������
	public Electronics() {

	}

	//[9] price, prdName �ʵ带 �ʱ�ȭ�ϴ� Ŀ���� ������
	public Electronics(int price, String prdName) {
		this.prdName=prdName;
		this.price=price;
	}

	//[5] Electronics Ŭ������ sell �޼ҵ� ������
	//������ ���� Object�� ���޹޾� "���� ��ǰ - %s (1set)"�� ���ڿ��� ����
	//String.format() Ȱ��
	@Override
	public String sell(Object object) {
		return String.format("������ǰ - %s (1set)", object);
	}

	//[12] Electronics Ŭ������ �ʵ尪�� ����ϵ��� toString �޼ҵ带 ������
	//��ӹ��� �ʵ嵵 ����
	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}

	//[11] Electronics Ŭ������ power() �޼ҵ带 public �����ڷ� ����
	//������ kwh �ʵ尪(�ð��� ���¼Ҹ�)���� 1�� 24�ð� ���¼Ҹ��� �Ǽ��� ����Ͽ� ����
	public double power() {
		return 24*kwh;
	}

	//[8] getter, setter �޼ҵ带 �ۼ�
	public double getKwh() {
		return kwh;
	}

	//[8]
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

//	public boolean isAutomatic() {
//		return automatic;
//	}
//
//	public void setAutomatic(boolean automatic) {
//		this.automatic = automatic;
//	}

}