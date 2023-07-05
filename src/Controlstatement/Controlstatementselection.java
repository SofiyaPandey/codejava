package Controlstatement;

import java.util.Scanner;

public class Controlstatementselection {
	public static void main(String[] args) {
		int salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		salary=sc.nextInt();
		if(salary<30000) {
			salary= salary + 9000;
		}
		
		System.out.println("Your total Salary="+salary);
	}

}
