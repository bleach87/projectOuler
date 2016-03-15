package projectOuler;

import java.util.ArrayList;

public class Problem_6 {

	public static void main(String[] args) {
//		1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).
//		12 + 22 + ... + 102 = 385
//		1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).
//		(1 + 2 + ... + 10)2 = 552 = 3025
//		따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.
//		그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
		
		System.out.println(":::::problem_6:::::");
		
		ArrayList numArr_1 = new ArrayList();
		int result_1 = 0; 
		int result_2 = 0;
		int result;
		
		for(int i=1; i<101; i++){
			numArr_1.add( (int)Math.pow(i, 2) );
			result_2 += i;
		}
		for(int i=0; i<numArr_1.size(); i++){
			result_1 += (int)numArr_1.get(i);
		}
		
		result_2 = (int)Math.pow(result_2, 2);
		result = result_2 - result_1;
		
		System.out.println(result);
	}

}
