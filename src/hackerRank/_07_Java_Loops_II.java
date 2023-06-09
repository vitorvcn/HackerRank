package hackerRank;

import java.util.*;

public class _07_Java_Loops_II {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		int[] n = new int[t];
		int result = 0;
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < t; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			n[i] = in.nextInt();
			
		}
		
		for (int i = 0; i < t; i++) {
						
				for (int j = 0; j < n[i]; j++) {
					
					if (j == 0) {
						result = (a[i] + (((int) Math.pow(2, j)) * b[i]));
					} else {
						result = result + (((int) Math.pow(2, j)) * b[i]);
					}
					list.add(result);	
				}
					
		}
		int count=0;
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < n[i]; j++) {
				if(i==0) {
					System.out.print(list.get(count) + " ");
				}else {
					System.out.print(list.get(count) + " ");
				}
			count++;	
			}
			System.out.println();
		}
		in.close();
	}
}
