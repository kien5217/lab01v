package lab01;
import java.util.Scanner;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
        	 a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double sum,avg;
        sum = 0;
        for(int i=0;i<n;i++) {
        	sum = sum+a[i];
        }
        avg = sum/n;
        System.out.println(sum + " "+avg);
        for(int i=0;i<n;i++) {
        	System.out.print(a[i] + " " );
        }
        System.exit(0);
	}

}
