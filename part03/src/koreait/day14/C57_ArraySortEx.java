package koreait.day14;

import java.util.Arrays;

//�ۼ��� : ������
public class C57_ArraySortEx {

	//�迭�� ����� �� �����ϱ� ���� �����ϼ���.
	public static void main(String[] args) {
		
		int nums[] = {34, 77, 19, 56, 45, 9};
		
		int temp, a, b;
		
		System.out.println("���� �� = " + Arrays.toString(nums));
		
		for(int i=0; i<nums.length-1; i++) {
			a=i;
			for(int k=i+1; k<nums.length; k++) {
				b=k;
				if(nums[a] > nums[b]) {
					temp=nums[a];
					nums[a]=nums[b];
					nums[b]=temp;
				}
			}
		}
		
		System.out.println("���� �� = " + Arrays.toString(nums));
		

	}

}
