package Controlstatement;

public class LadderTest {
	public static void main(String[] args) {
		int age=40;
		if(age>=80) {
			System.out.println("You are too old");
		}
		else if(age >=60) {
			System.out.println("you are old");
		}
		else if(age>=40) {
			System.out.println("you are adult");
		}
		else if(age>=20){
			System.out.println("you are bachelor");
		}
		else if(age>=13) {
			System.out.println("you are teenager");
		}
		else {
			System.out.println("you are child");
		}
	}
	

}

