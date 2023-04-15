package lab01;
//exercise 2.2.5 
import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        Scanner keyboard = new Scanner(System.in);
        double num1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();
        double sum,difference,quotient,product;
        sum = num1 + num2;
        difference = num1-num2;
        quotient = num1/num2;
        product = num1*num2;
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(quotient);
        System.out.println(product);
        System.exit(0);
	}

}
