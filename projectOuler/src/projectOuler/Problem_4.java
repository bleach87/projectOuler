package projectOuler;

public class Problem_4 {

	public static void main(String[] args) {
//		앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
//		두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
//		세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
		
		System.out.println(":::::problem_4:::::");
		
		int num;
		int result = 0;
		
		StringBuffer tt = new StringBuffer("test");
		String str = tt.toString();
		
		StringBuffer t1 = new StringBuffer(tt.reverse());
		String str2 = t1.toString();
		
		for(int x=100; x<1000; x++){
			for(int y=100; y<x; y++){
				num = x*y;
				String strNum = String.valueOf(num);
				StringBuffer sNum = new StringBuffer(strNum);
				String str_1 = sNum.toString();
				
				StringBuffer rNum = sNum.reverse();
				String str_2 = rNum.toString();
				
				if( (result < num) && ( str_1.equals(str_2) ) ){
					result = num;
					
					System.out.println(str_1+" / "+str_2);	
				}
			}
		}
		
	}

}
