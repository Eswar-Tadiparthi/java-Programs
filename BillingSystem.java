import java.util.Scanner;

public class BillingSystem {
    // Instance variables
    byte quantity;
    int unitPrice;
    float taxRate;
    double usdPaid;
    float conversionRate;

    float baseAmount;
    float totalAmount;
    float convertedInr;
    float difference;

    // Method to accept user input
    void acceptInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity of items purchased (byte): ");
        quantity = sc.nextByte();

        System.out.print("Enter unit price  per item (int): ");
        unitPrice = sc.nextInt();

        System.out.print("Enter applicable tax rate in % (float): ");
        taxRate = sc.nextFloat();

        System.out.print("Enter amount paid in USD (double): ");
        usdPaid = sc.nextDouble();

        System.out.print("Enter USD to INR conversion rate (float): ");
        conversionRate = sc.nextFloat();
    }

    // Method to calculate base and total amounts
    void calculateTotal() {
        baseAmount = quantity * unitPrice;  // byte * int → int promoted to float
        float taxAmount = (baseAmount * taxRate) / 100;
        totalAmount = baseAmount + taxAmount;  // implicit type promotion (int → float)
    }

    // Method to convert USD to INR with explicit type casting
    void convertUsdToInr() {
        convertedInr = (float)(usdPaid * conversionRate);  // double * float → double → cast to float
    }

    // Method to compare amounts and display billing summary
    void displaySummary() {
        System.out.println("\n===== Billing Summary =====");
        System.out.println("Quantity Purchased       : " + quantity);
        System.out.println("Unit Price (INR)         : " + unitPrice);
        System.out.println("Base Amount (INR)        : " + baseAmount);
        System.out.println("Tax Rate (%)             : " + taxRate);
        System.out.println("Total Bill Amount (INR)  : " + totalAmount);

        System.out.println("\n===== Payment Details =====");
        System.out.println("Paid Amount (USD)        : " + usdPaid);
        System.out.println("Converted Amount (INR)   : " + convertedInr);

        System.out.println("\n===== Payment Status =====");
        if (convertedInr >= totalAmount) {
            difference = convertedInr - totalAmount;
            System.out.println("Payment Status           : Sufficient");
            System.out.println("Return/Change (INR)      : " + difference);
        } else {
            difference = totalAmount - convertedInr;
            System.out.println("Payment Status           : Insufficient");
            System.out.println("Remaining Amount (INR)   : " + difference);
        }
    }

    // Main method
    public static void main(String[] args) {
        BillingSystem bill = new BillingSystem();
        bill.acceptInput();
        bill.calculateTotal();
        bill.convertUsdToInr();
        bill.displaySummary();
    }
}