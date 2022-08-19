package Solve;

import java.util.Scanner;

public class sm1 {

	public static void main(String[] args) {
		// 연구소 문제
		// N(가로)x M(세로) 인 직사각형
		// 0은 빈칸 , 1은 벽 2는 바이러스가 있는 위치
		// 2의 개수는 2보다 크거나 같고, 10보다 작거나 같은 자연수.
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int M = sc.nextInt();
	
		
		if(N>= 3 && M <=8) {
		
		} else { 
			System.out.println("다시 입력");
		}
		
		int arr [][] = new int [N][M];
	
		
		
		
		
		for(int i = 0 ; i<N ; i++) {
			arr[0][i] = sc.nextInt();
			for(int j = 0 ; j<M ; j++) {
				arr[j][0] = sc.nextInt();
			}
		}
		System.out.println(arr[N][M]);
	}

}
