package bankapplication;
import java.util.*;
class BankApplication {

	public static void main(String[] args) {
		operation ob = new operation();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			int id = sc.nextInt();
			String name = sc.next();
			int bal = sc.nextInt();
			ob.createAccount(id,name,bal);
		}
		int n;
		do {	
			System.out.print("1 for withdraw\n2 for deposit\n3 for display\n4 for quit");
			n = sc.nextInt();
			System.out.println("enter ur id\n");
			int id = sc.nextInt();
			switch(n) {
			case 1:
				int amt = sc.nextInt();
				ob.withdraw(id,amt);
				break;
			case 2:
				amt = sc.nextInt();
				ob.deposit(id,amt);
				break;
			case 3:
				ob.display(id);
				break;	
			}
		}while(n!=4);

	}

}
