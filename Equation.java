/**
 * 
 */
package lab01;

import java.util.Scanner;
public class Equation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int k = keyboard.nextInt();
        switch(k) {
        case 1 :
        	double a = keyboard.nextDouble();
        	double b = keyboard.nextDouble();
        	if((a == 0) && (b==0)) {
        		System.out.println("Infinite solution");
        	}
        	else if((a == 0) && (b!=0)) {
        		System.out.println("No solution");
        	}
        	else {
        		double x;
        	    x = (-b)/a;
        	    
        	    System.out.println(x);
        }
        break;
        case 2:
        	double c,d,e,f,g,h;
        	c = keyboard.nextDouble();
        	d = keyboard.nextDouble();
        	e = keyboard.nextDouble();
        	f = keyboard.nextDouble();
        	g = keyboard.nextDouble();
        	h = keyboard.nextDouble();
        	if(((c/e)==(d/f)) && ((c/e)==(g/h))) {
        		System.out.println("Infinite solution");
        	}
        	else if(((c/e)==(d/f)) && ((c/e)!=(g/h))) {
        		System.out.println("No solution");
        	}
        	else {
        		double y,t;
        		t = ((h*c)-(g*e))/((f*c)-(d*e));
        		y = ((h*d)-(g*f))/((e*d)-(f*c));
        		 System.out.println(y);
        		 System.out.println(t);
        	}
        	break;
        case 3:
        	double a1,b1,c1;
        	a1 = keyboard.nextDouble();
        	b1 = keyboard.nextDouble();
        	c1 = keyboard.nextDouble();
        	if (a1==0) {
        		if((b1 == 0) && (c1 == 0)) {
            		System.out.println("Infinite solution");
            	}
            	else if((b1 == 0) && (c1 !=0)) {
            		System.out.println("No solution");
            	}
            	else {
            		double x;
            	    x = (-c1)/b1;
            	    
            	    System.out.println(x);
        	}
        	}
        	else {
        		double delta;
        		delta = b1*b1 - 4*a1*c1;
        		if(delta < 0) {
        			System.out.println("No solution");
        		}
        		else if (delta == 0) {
        			double r ;
        			r= (-b1)/(2*a1);
        			System.out.println("One solution: " + r );
        		}
        		else {
        			double r1,r2;
        			r1 = (-b1-delta)/(2*a1);
        			r2 = (-b1+delta)/(2*a1);
        			System.out.println("Two solution: " + r1 + "and" + r2 );
        		}
        	}
        	break;
        	
     } 
        System.exit(0);	
}
}
