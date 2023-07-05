package Controlstatement;

public class fortest2 {
public static void main(String[] args) {
	int es=0;
	int os=0;
	int s=0;
	for(int i=1; i<100; i++) {
		if (i%2==0) {
			es=es+1;
		}else {
			os=os+1;
		}
		
		System.out.println(i);
		s=s+1;
	}
	System.out.println("sum of even nos="+es);
	System.out.println("sum of odd nos="+os);
	System.out.println("==================");
	System.out.println("Total="+(es+os));
}
}
