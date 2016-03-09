package projectOuler;

public class Problem_3 {

	public static void main(String[] args) {
		// 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
		// 예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
		// 600851475143의 소인수 중에서 가장 큰 수를 구하세요. 
		
		System.out.println(":::::problem_3:::::");
		
		
		long num = 600851475143L;
		long devNum=num;
		
		for(long i=2; i<num; i++){
			if(devNum%i == 0){
				devNum = devNum/i;
				System.out.println("num : "+i+":::"+devNum);
			}
		}
		
		
		
	}

}
