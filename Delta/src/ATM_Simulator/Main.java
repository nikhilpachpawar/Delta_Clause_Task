package ATM_Simulator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Method m=new Method();
		
		System.out.println("\n****Welcome Atm Program****\n");
		while(true) {
	
		System.out.println("1.Deposite\n"
				+ "2.Withdraw\n"
				+ "3.balance\n"
				+ "4.Exist");
		System.out.println("Enter your Choice\n");
		int x=sc.nextInt();
		if(x==1) {m.Deposite();}
		else if(x==2) {m.Withdrow();}
		else if(x==3) {m.balence();}
		else if(x==4) {System.exit(0);}
		
		else {System.out.println("Please Enter Write Choice");}
				
		
	}
	}
	

}
