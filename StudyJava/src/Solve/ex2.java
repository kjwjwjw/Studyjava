package Solve;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			
			if(a*b>0) {
				System.out.println(a*b-1);
			} else {
				System.out.println(1);
				
			}
			

	}

}
