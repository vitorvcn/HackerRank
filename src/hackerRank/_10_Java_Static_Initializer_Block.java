package hackerRank;

import java.util.Scanner;

public class _10_Java_Static_Initializer_Block {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int h = sc.nextInt();
		int area;
		
		if(b <= 0 || h <= 0 ) {
			System.out.println("java.lang.Exception: Breadth and height msut be positive");
		}else {
			area = h * b;
			System.out.println(area);
		}
		
		sc.close();
		
		
	}
}



