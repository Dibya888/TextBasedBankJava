import java.util.Scanner;
public class RhymeBank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int userInput;		
		int size = 0;
		double[] accountBalances = new double[250];
		String[] accountNames = new String[250];
		for(;true;) {
		System.out.println("Bank Admin Menu: ");
		System.out.println("Please enter a menu option: ");
		System.out.println("(1): Add Customer to the Bank: ");
		System.out.println("(2): Change Customer Name: ");
		System.out.println("(3): Check Account Balance: ");
		System.out.println("(4): Modify Account Balance: ");
		System.out.println("(5): Summary of Individual Accounts: ");
		System.out.println("(6): Summary of All Accounts: ");
		System.out.println("(-1): Quit");
		
		userInput = s.nextInt();
		if(userInput == 1) {
			System.out.println("Add Customer Menu");
			System.out.println("Please Enter an Account Balance: $");
			double balance = s.nextDouble();
			accountBalances[size] = balance;
			System.out.println("Please Enter Customer Name: ");
			s.nextLine(); //clean the buffer
			String name = s.nextLine();
			accountNames[size] = name;
			System.out.println("Customer ID: "+size);
			size = size + 1;
		}
		else if(userInput == 2) {
			System.out.println("Customer Name Change Menu: ");
			System.out.println("Enter a Valid Customer ID: ");
			int index = s.nextInt();
			System.out.println("Enter New Name of the Customer: ");
			s.nextLine();
			accountNames[index] = s.nextLine();
			System.out.println("Name Changed Succesfully.");
		}
		else if(userInput == 3) {
			System.out.println("Check Balance Menu");
			System.out.println("Enter a Valid Customer ID: ");
			int index = s.nextInt();
			double balance = accountBalances[index];
			System.out.println("Your Balance is: $"+balance);
		}
		else if(userInput == 4) {
			System.out.println("Balance Modify Menu: ");
			System.out.println("Enter a valid Customer ID: ");
			int index = s.nextInt();
			System.out.println("Modify The Balance: ");
			accountBalances[index] = s.nextDouble();
			System.out.println("Balance Modified Succesfully.");
		}
		else if(userInput == 5) {
			System.out.println("Customer Summary Menu:");
			System.out.println("Please Enter a Valid Customer ID: ");
			int index = s.nextInt();
			double balance = accountBalances[index];
			String name = accountNames[index];
			System.out.println("Customer Name: "+ name +"\n Remaining Balance: $"+balance);
		}
		else if(userInput == 6) {
			System.out.println("All Customer Summary Menu:");
			double total = 0;
			for(int i=0; i < size; i++) {
				total = total + accountBalances[i];
				System.out.println("Customer ID: "+i+"\nCustomer Name: "+accountNames[i]+"\nRemaining Balance: $"+accountBalances[i]);
			}
			System.out.println("Total Customer: "+size+"\nTotal Balance: $"+total);
		}
		else if (userInput == -1) {
			System.out.println("Exited from Program Succesfully...");
			System.exit(-1);
		}
		else {
			System.out.println("Please Enter a Valid Input.");
		}
		
	}
	}

}
