package Solve;

import java.util.Scanner;

public class count1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			String A = sc.nextLine();
			int Num = 0;
			if (A.equals("#")) {
				break;
			} else {
				for (int i = 0; i < A.length(); i++) {
			switch (A.charAt(i)) {
					case 'o': 
					case 'i': 
					case 'e': 
					case 'u': 
					case 'a':
								Num++;
					defalut:break;
					
					} 
			
				} 
				System.out.println(Num);
			} 
			
		} 
		
	}

}