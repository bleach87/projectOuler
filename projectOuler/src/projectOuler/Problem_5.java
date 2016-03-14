package projectOuler;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Problem_5 {

	public static void main(String[] args) {
//		1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//		그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
		
		System.out.println(":::::problem_5:::::");
		
		int result = 11;
		ArrayList arrNum = new ArrayList();
		
		
		for(int i=1; i<21;i++) {
			arrNum.add(i);
		}
		
		while(result>0){
			boolean isCheck = true;
			for(int i=0; i<arrNum.size(); i++){
				if(result%(int)arrNum.get(i) != 0){
					isCheck = false;
					continue;
				}
			}
			
			if(isCheck){
				System.out.println("result : "+ result );
				break;
			}
			result++;
		}
		
	}

}
