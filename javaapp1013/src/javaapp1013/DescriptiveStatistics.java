package javaapp1013;

public class DescriptiveStatistics {

	public static void main(String[] args) {
		//이름 배열
//		String [] name = {"아현","이대","신촌","홍대","합정","당산"};
		//정수 배열
		int [] nums = {76,41,52,12,85,37};
		
		//50점이 넘는 데이터의 합계와 개수 그리고 평균 구하기
		//평균은 소수 첫째자리까지 구하기 - 소수두째자리에서 반올림
		
		//합계를 저장할 변수와 개수를 구할 변수를 생성
		int sum = 0;
		int cnt = 0;
		
		for (int a=0; a<=nums.length; a=a+1) {
			if (nums[a]>50) {
				sum=sum+nums[a];
				cnt=cnt+1;
			}
		}
		
		System.out.printf("50점이 넘은 수의 합계 : %d\n", sum);
		System.out.printf("50이 넘는 개수 : %d\n", cnt);
		
		if(cnt==0) {
			System.out.println("조건에 맞는 데이터가 없습니다.");
		} else {
			double avg = (double)sum/cnt;
			System.out.printf("평균 : %.1f", avg);
		}
		
		//최대값과 최소값 구하기
		//최대값을 저장할 변수를 생성 - 아주 작은 값이나 배열의 첫번째 값으로 초기화
		int max = 0;
		//최소값을 저장할 변수를 생성 - 아주 큰 값이나 배열의 첫번째 값으로 초기화
		int min = 100;
		//배열을 순회하면서 max나 min보다 큰 값이나 작은 값을 만나면 그 값으로 교체
		for(int num : nums) {
			if(max<num) {
				max = num;
			}
			if(min>num) {
				min = num;
			}
		}
		System.out.printf("최대값:%d\n",max);
		System.out.printf("최소값:%d\n",min);
		
	}

}
