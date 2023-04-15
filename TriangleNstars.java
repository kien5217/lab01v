package lab01;
import java.util.Scanner;
public class TriangleNstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int i;
		for(i=1;i<=n;i++) {
			int j;
			for(j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
