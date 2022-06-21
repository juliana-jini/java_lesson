package koreait.day05;

import java.util.Scanner;

//�ۼ��� : ������
public class C28_IntArrayEx {

		/*	1. int �迭 ũ�� 5�� �����ϼ���. �̸��� nums
		 * 	2. �迭 ����� ���� ����� �Է����� �����մϴ�.
		 *  ��
		 * 	3. �Էµ� ���� �հ�, ����� ���մϴ�.
		 *  �� 
		 * 	4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
		 * 			�� maxOfArray, minOfArray : ���ڴ� int �迭, ��ȯ�� ���� int
		 */
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int sum = 0;
			int[] nums = new int[5];
			int total = 0;
			double avg = 0;
			
			System.out.println("���� 5�� �Է� >>> ");
			
			for(int i=0;i<nums.length;i++) {
				sum = sc.nextInt();
				nums[i] = sum;

				String t = String.format("nums[%d] = %d", i, nums[i]);
				System.out.println(t);
				
				total += sum;
				avg=total/nums.length;
			}
			
			System.out.println("�հ� : " + total + " ��� : " + avg);
			
			int max = maxOfArray(nums);
			System.out.println("�迭 nums �ִ밪 max = " + max);
			int min = minOfArray(nums);
			System.out.println("�迭 nums �ּҰ� min = " + min);
			
			
		}

	
		// 1. max, min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ �մϴ�.
		// 2. �迭 ��� 1������ ������ ��ұ��� max, min�� ������� ���ؼ�
		// 3. max�� �� ������ ������ (min�� �� ������ ũ��) max(min) ���� �迭 ��Ұ����� �����մϴ�.
		// 4. -> �񱳰� ������ ���� max, min ������ �˴ϴ�.

		public static int maxOfArray(int[] array) {
			int max = array[0];	//1. 					***���� main �޼ҵ��� nums �ּҰ��� maxOfArray �޼ҵ��� array�� ���� ==> max = array[0](nums[0])
			for(int i=1;i<array.length;i++) {	//2.	***max�� nums[0]�� ���� �����߱� ������ i�� 1���� ����
				if(max < array[i])	//�񱳰��� max���� ũ�ٸ�
					max = array[i];
					
			}
			
			//����: ����� main���� �����ų �� ���ϴ� �������� �ϵ��� �մϴ�.
			return max;			//4.
		}
		
		public static int minOfArray(int[] array) {
			int min = array[0];
			for(int i=1;i<array.length;i++) {
				if(min > array[i])
					min = array[i];
					
			}
			
			return min;
		}
		
		
		
}
