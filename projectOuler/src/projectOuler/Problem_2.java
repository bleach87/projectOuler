package projectOuler;

public class Problem_2 {

	public static void main(String[] args) {
		// 피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
		//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
		//짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
		
		System.out.println(":::::problem_2:::::");
		int n1 = 1;
		int n2 = 2;
		int n3 = n1+n2;
		int total = n2;
		
		while(n3 < 4000000){
			if(n3%2 == 0){
				total += n3;
			}
			
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
		
		System.out.println("total : "+total);
	}

}
