package Solve;

public class ex9 {

		   public int[] solution(int[] lottos, int[] win_nums) {
			   int maxCnt = 0;
			   int lowCnt = 0;
			   
			   int[] win = {3,5,6,8,9,30 };	
			   
			   int[] answer = new int[2];
			   
			   for(int i = 0 ; i<6 ; i++) {
				   	if(lottos[i] == 0) {
				   		maxCnt ++;
				   	}
				   
				   for(int j = 0 ;j<6 ; j++) {
					   if(lottos[i] == win_nums[j]) {
						   maxCnt++;
						   lowCnt++;
					   }
				   }
			   }
			   
			   answer[0] = win[maxCnt];
			   answer[1] = win[lowCnt];
			   
			   return answer;
		
		   }


}
