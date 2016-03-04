package projectOuler;

public class Problem_3 {

	public static void main(String[] args) {
		// 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
		// 예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
		// 600851475143의 소인수 중에서 가장 큰 수를 구하세요. 
		
		System.out.println(":::::problem_3:::::");
		
		int i=2;
		int num = 13195;
		int result = 0;
		boolean isDev = true;
		int devNum;
		
		while( num > 0 ){
			for(int n=1; n<i; n++){
				if( (n != i) && (i%n == 0) ){
					isDev = false;
					break;
				}
				continue;
			}
			System.out.println("test::::::");
			if( isDev == true ){
				num = num/i;
				System.out.println("devNum : "+num);	
			}
			++i;
		}
		
	}

}
