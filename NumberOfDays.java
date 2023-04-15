package lab01;

import java.util.Scanner;

public class NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year = sc.nextInt();
		System.out.println("What do you choose: ");
		int choice;
		do {
            System.out.println("Choose 1 number (1/2/3/4): ");
            choice=sc.nextInt();
        } while ((choice < 1) || (choice>4));
		switch(choice) {
		case 1:
			System.out.println("please enter full name of the month: ");
			String str1= sc.nextLine();
			switch(str1){
			case "January":
			case "March":
			case "May":
			case "July":
			case "August":
			case "October":
			case "December":
				System.out.println("This month has 31 days");
				break;
			case "April" :
			case "June":
			case "November":
			case "September":
				System.out.println("This month has 30 days");
				break;
			case "Feberuary":
				if((year % 4 == 0)&&(year % 100 != 0)|| (year % 400 == 0)) {
					System.out.println("This month has 29 days");
				}
				else {
					System.out.println("This month has 28days");
				}
				break;
			}
			break;
		case 2:
			System.out.println("please enter aberivation: ");
			String str2=sc.nextLine();
			switch(str2) {
			case "Jan.":
			case "Mar." :
			case "May":
			case "July":
			case "Aug.":
			case "Oct.":
			case "Dec.":
				System.out.println("This month has 31 days");
				break;
			case "Apr.":
			case "June":
			case "Nov.":
			case "Sept.":
				System.out.println("This month has 30 days");
				break;
			case "Feb.":
				if((year % 4 == 0)&&(year % 100 != 0)|| (year % 400 == 0)) {
					System.out.println("This month has 29 days");
				}
				else {
					System.out.println("This month has 28days");
				}
				break;
			}
			break;
		case 3 :
			System.out.println("please enter in 3 letters: ");
			String str3=sc.nextLine();
			switch(str3) {
			case "Jan":
			case "Mar" :
			case "May":
			case "Jul":
			case "Aug":
			case "Oct":
			case "Dec":
				System.out.println("This month has 31 days");
				break;
			case "Apr":
			case "Jun":
			case "Nov":
			case "Sep":
				System.out.println("This month has 30 days");
				break;
			case "Feb":
				if((year % 4 == 0)&&(year % 100 != 0)|| (year % 400 == 0)) {
					System.out.println("This month has 29 days");
				}
				else {
					System.out.println("This month has 28days");
				}
				break;
			}
			break;
		case 4:
			System.out.println("please enter in number: ");
			int num=sc.nextInt();
			switch(num) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("This month has 31 days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("This month has 30 days");
				break;
			case 2:
				if((year % 4 == 0)&&(year % 100 != 0)|| (year % 400 == 0)) {
					System.out.println("This month has 29 days");
				}
				else {
					System.out.println("This month has 28days");
				}
				break;
			}
			break;
		}
		System.exit(0);
}
}
