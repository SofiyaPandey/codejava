package codejava6am;

import java.util.Scanner;

public class interest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T;
		int P;
		int R;
	
		System.out.println("enter the value of P");
		P= sc.nextInt();
		System.out.println("Enter the value of T");
		T= sc.nextInt();
		System.out.println("Enter the value of R");
		R= sc.nextInt();
		int I= (P*T*R)/100;
		System.out.println("simple interest ="+I);
		
	}

}
