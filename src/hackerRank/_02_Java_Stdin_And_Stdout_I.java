package hackerRank;
import java.util.Scanner;
public class _02_Java_Stdin_And_Stdout_I {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
     scan.close();
    }
}
