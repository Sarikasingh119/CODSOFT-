import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double rate = 83;   // exchange rate
        char continueChoice;

        do {

            System.out.println("\n==== Currency Converter ====");
            System.out.println("1. INR to USD");
            System.out.println("2. USD to INR");
            System.out.print("Choose option: ");

            int option = sc.nextInt();

            System.out.print("Enter amount: ");
            double money = sc.nextDouble();

            if (money <= 0) {
                System.out.println("Invalid Amount! Please enter positive value.");
            } else {

                double convertedAmount = 0;

                switch (option) {

                    case 1:
                        convertedAmount = money / rate;
                        System.out.println("After Conversion:");
                        System.out.println("Total USD = " + convertedAmount);
                        break;

                    case 2:
                        convertedAmount = money * rate;
                        System.out.println("After Conversion:");
                        System.out.println("Total INR = " + convertedAmount);
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }
            }

            System.out.print("Do you want to convert again? (y/n): ");
            continueChoice = sc.next().charAt(0);

        } while (continueChoice == 'y' || continueChoice == 'Y');

        System.out.println("Thank you for using Currency Converter.");
        sc.close();
    }
}