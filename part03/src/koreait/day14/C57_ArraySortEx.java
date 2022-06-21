package koreait.day14;

import java.util.Arrays;

//작성자 : 조윤진
public class C57_ArraySortEx {

	//배열에 저장된 값 정렬하기 직접 구현하세요.
	public static void main(String[] args) {
		
		int nums[] = {34, 77, 19, 56, 45, 9};
		
		int temp, a, b;
		
		System.out.println("정렬 전 = " + Arrays.toString(nums));
		
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
		
		System.out.println("정렬 후 = " + Arrays.toString(nums));
		

	}

}
