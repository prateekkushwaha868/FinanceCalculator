package Finance;
import java.util.*;
public class x1 {
	public static void main(String[] args) {
		System.out.println("This Project has been Developed and Refined by Prateek Kushwaha");
		int a = 1;
		while(a>0) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.println("___Financial Calculator___ ");
		System.out.println("1. Currency Converion");
		System.out.println("2. GST [%]");
		System.out.println("3. Loan ");
		System.out.println("4. TVM [Time Value Money]");
		System.out.println("5. Exit");
		System.out.println("Enter the choice from above:");
		int choice = scanner.nextInt();
		if(choice==1) {
			System.out.println("Currency Conversions");
			  // Currency names
	        String[] currencies = {"USD [United States Dollar]", "EUR [Euro - European Union]", "GBP[British Pound]", "INR [Indian Rupees]", "JPY [Japanese Ven]", "CAD [Canadian Dollar]", "AUD [Austrlian Dollar]", "CHF [Switzerland franc]", "CNY [China Yuan]", "SGD [Singapore Dollar]"};
	       
	        // Exchange rates relative to 1 USD
	        // Rates are hypothetical and need to be updated for real-time use
	        double[] exchangeRates = {1.0, 0.9, 0.78, 83.0, 147.0, 1.34, 1.5, 0.88, 7.3, 1.37};
	       	       
	        System.out.println("Welcome to the Currency Converter!");
	        System.out.println("Supported currencies:");
	        for (int i = 0; i < currencies.length; i++) {
	            System.out.println((i + 1) + ". " + currencies[i]);
	        }
	       
	        System.out.print("\nEnter the number corresponding to the currency you want to convert FROM: ");
	        int fromCurrency = scanner.nextInt() - 1;
	       
	        System.out.print("Enter the number corresponding to the currency you want to convert TO: ");
	        int toCurrency = scanner.nextInt() - 1;
	       
	        System.out.print("Enter the amount in " + currencies[fromCurrency] + ": ");
	        double amount = scanner.nextDouble();
	       
	        // Conversion rate from the selected currency to the target currency
	        double conversionRate = exchangeRates[toCurrency] / exchangeRates[fromCurrency];
	        double convertedAmount = amount * conversionRate;
	       
	        System.out.printf("\n%.2f %s is equal to %.2f %s\n",
	                amount, currencies[fromCurrency], convertedAmount, currencies[toCurrency]);
	       
	        System.out.println("\nThank you for using the Currency Converter!");
	        System.out.println("");
			System.out.println("");
			
			
		}
		if(choice==2) {
			System.out.println("---GST Calculator Started---");
			 // GST rates for selected countries (in percentage)
	        String[] countries = {"India (18%)", "United States (10%)", "United Kingdom (20%)", "Australia (10%)"};
	        double[] gstRates = {18.0, 10.0, 20.0, 10.0};
	     	       
	        System.out.println("Welcome to the GST Calculator!");
	        System.out.println("Select a country:");
	        for (int i = 0; i < countries.length; i++) {
	            System.out.println((i + 1) + ". " + countries[i]);
	        }
	       
	        System.out.print("\nEnter the number corresponding to your country: ");
	        int countryIndex = scanner.nextInt() - 1;
	       
	        double gstRate = gstRates[countryIndex];
	        System.out.printf("You selected %s with a GST rate of %.2f%%.\n", countries[countryIndex], gstRate);
	       
	        System.out.println("\nChoose an option:");
	        System.out.println("1. Add GST to an amount");
	        System.out.println("2. Calculate GST from an inclusive amount");
	        int option = scanner.nextInt();
	       
	        System.out.print("Enter the amount: ");
	        double amount = scanner.nextDouble();
	       
	        double gstAmount, totalAmount, originalAmount;
	       
	        if (option == 1) {
	            // Add GST
	            gstAmount = (amount * gstRate) / 100;
	            totalAmount = amount + gstAmount;
	            System.out.printf("\nOriginal Amount: %.2f\nGST (%.2f%%): %.2f\nTotal Amount: %.2f\n",
	                    amount, gstRate, gstAmount, totalAmount);
	            System.out.println("");
				System.out.println("");
	        } else if (option == 2) {
	            // Calculate GST from an inclusive amount
	            gstAmount = amount - (amount / (1 + gstRate / 100));
	            originalAmount = amount - gstAmount;
	            System.out.printf("\nTotal Inclusive Amount: %.2f\nGST (%.2f%%): %.2f\nOriginal Amount: %.2f\n",
	                    amount, gstRate, gstAmount, originalAmount);
	            System.out.println("");
				System.out.println("");
	        } else {
	            System.out.println("Invalid option selected. Restarting the program.");
	            System.out.println("");
				System.out.println("");
	        }
	       
	        System.out.println("\nThank you for using the GST Calculator!");

		}
		if(choice==3) {
			System.out.println("Loan Calculator Started");
		        System.out.println("Welcome to the Loan Calculator!");

		        // Input loan details
		        System.out.print("Enter the principal loan amount (in ₹): ");
		        double principal = scanner.nextDouble();

		        System.out.print("Enter the annual interest rate (in %): ");
		        double annualInterestRate = scanner.nextDouble();

		        System.out.print("Enter the loan tenure (in years): ");
		        int tenureYears = scanner.nextInt();

		        double monthlyInterestRate = annualInterestRate / 12 / 100;
		        int totalMonths = tenureYears * 12;

		        //EMI using the formula
		        double emi = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalMonths))
		                / (Math.pow(1 + monthlyInterestRate, totalMonths) - 1);

		        // Total amount payable and total interest
		        double totalPayment = emi * totalMonths;
		        double totalInterest = totalPayment - principal;

		        System.out.printf("\nMonthly EMI: ₹%.2f\n", emi);
		        System.out.printf("Total Payment (Principal + Interest): ₹%.2f\n", totalPayment);
		        System.out.printf("Total Interest Payable: ₹%.2f\n", totalInterest);

		        System.out.println("\nThank you for using the Loan Calculator!");
		        System.out.println("");
				System.out.println("");
		}
		if(choice==4) {
	        System.out.println("Welcome to the TVM Calculator!");
	        
			System.out.println("Time Value Money Calculator Started");
			System.out.println("1. Find Future Value of Money from Present value");
			System.out.println("2. Find Present Value of Money from Future value");
			System.out.println("Enter the number corresponding to your choice:");

			int choose = scanner.nextInt();
			if(choose==1) {
				double FV;
				System.out.println("Enter Present Value (in ₹)");
				double PV = scanner.nextDouble();
				System.out.println("Enter the Annual Interest Rate(R)");
				double rate = scanner.nextDouble();
				double R = rate/100;
				System.out.println("Enter number of Compounding per Year");
				double n = scanner.nextDouble();
				System.out.println("Enter Time in Years");
				int T = scanner.nextInt();
				FV =  PV*(Math.pow(1+(R/n),n*T));	
				System.out.printf("The Future Value of Current amount [₹%.2f] is = ₹%.2f",PV,FV);
				System.out.println("");
				System.out.println("");
			}
			else if(choose == 2) {
				double PV;
				System.out.println("Enter Future Value (in ₹)");
				double FV = scanner.nextDouble();
				System.out.println("Enter the Annual Interest Rate(R)");
				double rate = scanner.nextDouble();
				double R = rate/100;
				System.out.println("Enter Number of Compounding per Year");
				double n = scanner.nextDouble();
				System.out.println("Enter Time in Years");
				int T = scanner.nextInt();
				PV =  FV/(Math.pow(1+(R/n),(n*T)));
				System.out.printf("The Present Value of Future amount [₹%.2f] is = ₹%.2f",FV,PV);
				System.out.println("");
				System.out.println("");
			}
		}
		if(choice==5){
			System.out.println("***Program Exited With No Run Case***");
			a--;
			System.out.println("");
		}
		if(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 ) {
		System.out.println("->Please Select a valid Option to Proceed ");
		System.out.println("->Again Starting the Pogram");
		}
		
		}
	}
}
