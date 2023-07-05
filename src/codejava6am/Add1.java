package codejava6am;

import java.util.Scanner;

public class Add1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter the value of a");
		a= sc.nextInt();
		System.out.println("enter the value of b");
		b=sc.nextInt();
		int c= a+b;
		System.out.println("Total="+c);
		
	}

}
