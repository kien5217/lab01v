package lab01;

import java.util.Scanner;
public class Addmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        double[][] a = new double[n][m];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
         System.out.printf("a[%d][%d] = ", i,j);
       	 a[i][j] = sc.nextDouble();
       }
	}
        double[][] b = new double[n][m];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
         System.out.printf("b[%d][%d] = ", i,j);
       	 b[i][j] = sc.nextDouble();
       }
	}
        double[][] c = new double[n][m];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
                c[i][j]= a[i][j] + b[i][j];
        		System.out.printf("c[%d][%d] = %f", i,j,c[i][j]);
        		System.out.println();
       	 
       }
	}
        System.exit(0);
	}
}
