package hackerRank;
import java.util.Scanner;
public class _05_Java_Output_Formatting {

		public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String[] s = new String[3];
	        int[] x = new int[3];
	        
	        for(int i=0;i<3;i++)
	        {
	            s[i]=sc.next();
	            x[i]=sc.nextInt();
	            
	        }
	        System.out.println("================================");
	        for(int i=0;i<3;i++) {
	        	
	        	System.out.printf("%-14s %03d\n", s[i], x[i]);
	        	
	        }
	        
	        System.out.println("================================");

	        sc.close();
		}
		
}
