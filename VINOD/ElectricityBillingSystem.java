import java.util.Scanner;

class Customer {
    String name;
    int meterNumber;
    double unitsConsumed;
    double billAmount;

    void calculateBill() {
        double rate;
        if (unitsConsumed <= 100) {
            rate = 1.5;
        } else if (unitsConsumed <= 300) {
            rate = 2.5;
        } else if (unitsConsumed <= 500) {
            rate = 4.0;
        } else {
            rate = 5.5;
        }
        billAmount = unitsConsumed * rate;
    }

    void displayBill() {
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Customer Name  : " + name);
        System.out.println("Meter Number   : " + meterNumber);
        System.out.println("Units Consumed : " + unitsConsumed);
        System.out.println("Total Bill     : ₹" + billAmount);
    }
}

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.print("Enter Customer Name: ");
        customer.name = scanner.nextLine();

        System.out.print("Enter Meter Number: ");
        customer.meterNumber = scanner.nextInt();

        System.out.print("Enter Units Consumed: ");
        customer.unitsConsumed = scanner.nextDouble();

        customer.calculateBill();
        customer.displayBill();
    }
}