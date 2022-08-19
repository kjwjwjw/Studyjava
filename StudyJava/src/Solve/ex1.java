package Solve;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

//		int pet ; // 웃는 표정,슬픈 표정, 만약 죽는다면 '드러눕습니다.'

		Scanner sc = new Scanner(System.in);

		int weight = 0;
		String a = " ";
 
		while (true) {
			char o = sc.next().charAt(0);
			int w = sc.nextInt();
			if (o >= 10 && w <= 1000) {
				if (o == 'E') {
					weight -= w;System.out.println(weight);
				} else if (o == 'F') {
					weight += w;System.out.println(weight);
				} else if (o == '#' && w == 0) {
					if (weight > o * 0.5 && weight < o * 2) {
						a += ":-)";
						o = 0;
						w = 0;
						continue;
					} else if (w <= 0) {
						a += ":(-";
						o = 0;
						w = 0;
						continue;
					} else {
						a += "RIP";
						o = 0;
						w = 0;
						continue;
					}
				} else if (o == 0 && w == 0) {
					System.out.println(a);
					break;

				}
			}
		}

	}

}
