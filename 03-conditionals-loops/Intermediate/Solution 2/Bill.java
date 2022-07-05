import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        // Cost Per Hour = kWh x Unit Price
        Scanner input = new Scanner(System.in);
        System.out.print("Enter consumption(in watts per hour) and per unit rate: ");
        int consumption = input.nextInt();
        int unitPrice = input.nextInt();
        int totalConsumptionPerMonth = consumption * 24 * 30;
        int consumedUnits = totalConsumptionPerMonth / 1000; // 1 unit = 1kw
        int bill = consumedUnits * unitPrice;
        System.out.println("Monthly Bill is: " + bill);
    }
}
