import java.util.Scanner;

public class WeeklyIncomeTax {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // Prompt user for weekly income
        System.out.print("Please enter your weekly income: $");
        double income = scnr.nextDouble();
        
        double TaxRate;
        
        // Determine tax rate
        if (income < 500) {
            TaxRate = 0.10;
        } else if (income < 1500) {
            TaxRate = 0.15;
        } else if (income < 2500) {
            TaxRate = 0.20;
        } else {
            TaxRate = 0.30;
        }
        
        // Calculate tax
        double tax = (income * TaxRate);
        
        // Display results
        System.out.println("Tax Rate: " + TaxRate * 100 + "%");
        System.out.println("Tax Withholding: $" + tax);
        
    }
}
