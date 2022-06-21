package koreait.day05;

import java.util.Scanner;

//작성자 : 조윤진
public class C28_IntArrayEx {

		/*	1. int 배열 크기 5를 선언하세요. 이름은 nums
		 * 	2. 배열 요소의 값은 사용자 입력으로 저장합니다.
		 *  ↓
		 * 	3. 입력된 값의 합계, 평균을 구합니다.
		 *  ↓ 
		 * 	4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
		 * 			ㄴ maxOfArray, minOfArray : 인자는 int 배열, 반환값 형식 int
		 */
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int sum = 0;
			int[] nums = new int[5];
			int total = 0;
			double avg = 0;
			
			System.out.println("정수 5개 입력 >>> ");
			
			for(int i=0;i<nums.length;i++) {
				sum = sc.nextInt();
				nums[i] = sum;

				String t = String.format("nums[%d] = %d", i, nums[i]);
				System.out.println(t);
				
				total += sum;
				avg=total/nums.length;
			}
			
			System.out.println("합계 : " + total + " 평균 : " + avg);
			
			int max = maxOfArray(nums);
			System.out.println("배열 nums 최대값 max = " + max);
			int min = minOfArray(nums);
			System.out.println("배열 nums 최소값 min = " + min);
			
			
		}

	
		// 1. max, min 변수를 각각 배열의 0번 요소값으로 초기화 합니다.
		// 2. 배열 요소 1번부터 마지막 요소까지 max, min과 순서대로 비교해서
		// 3. max가 그 값보다 작으면 (min이 그 값보다 크면) max(min) 값을 배열 요소값으로 변경합니다.
		// 4. -> 비교가 끝나면 최종 max, min 결정이 됩니다.

		public static int maxOfArray(int[] array) {
			int max = array[0];	//1. 					***위의 main 메소드의 nums 주소값을 maxOfArray 메소드의 array에 전달 ==> max = array[0](nums[0])
			for(int i=1;i<array.length;i++) {	//2.	***max에 nums[0]의 값을 대입했기 때문에 i는 1부터 시작
				if(max < array[i])	//비교값이 max보다 크다면
					max = array[i];
					
			}
			
			//권장: 출력은 main에서 실행시킬 때 원하는 형식으로 하도록 합니다.
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
