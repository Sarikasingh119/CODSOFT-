import java.util.Scanner;
public class ATMInterface {
	double balance = 5000;
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println(" Deposite Successfully.");
	}
	void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Please collect your cash.");
		} else {
			System.out.println("Insufficient");
		}
	}
	void checkBalance() {
		System.out.println("Current Balance is: " + balance);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATMInterface atm = new ATMInterface();
		int choice;
		do {
			System.out.println("\n------ ATM MENU ------");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter amount to deposit: ");
				double depAmount = sc.nextDouble();
				atm.deposit(depAmount);
				break;

			case 2:
				System.out.print("Enter amount to withdraw: ");
				double withAmount = sc.nextDouble();
				atm.withdraw(withAmount);
				break;

			case 3:
				atm.checkBalance();
				break;

			case 4:
				System.out.println("Thank you for using ATM.");
				break;

			default:
				System.out.println("Invalid Choice.");
			}

		} while (choice != 4);

		sc.close();
	}
