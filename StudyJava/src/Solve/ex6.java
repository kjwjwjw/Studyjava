package Solve;

import java.util.Arrays;

public class ex6 {
	 public String solution(String[] participant, String[] completion) {

	        Arrays.sort(participant); 
	        Arrays.sort(completion);

	        int i = 0; 


	        for(i=0;i<completion.length;i++) {
	            if(!participant[i].equals(completion[i])) {


	                return participant[i];
	            }
	          }
	        return participant[participant.length-1];

	   }

}
