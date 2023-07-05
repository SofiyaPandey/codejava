package Controlstatement;

public class Nestediftest {
	public static void main(String[] args) {
		String citizen="nepali";
		int age=35;
		if (citizen.equals("nepali")) {
			if(age>=18) {
				System.out.println("you can vote");
			}else {
				System.out.println("you are under age");
			}
			
		}else {
			System.out.println("invalid citizenship");
		}
	}

}
