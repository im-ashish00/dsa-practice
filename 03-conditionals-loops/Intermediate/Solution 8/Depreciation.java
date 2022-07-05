import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        // Cost Per Hour = kWh x Unit Price
        Scanner input = new Scanner(System.in);
        System.out.print("Enter depreciable cost and asset's lifespan: ");
        int depreciableCost = input.nextInt();
        int assetLifespan = input.nextInt();
        System.out.println("Depreciation cost per year: " + depreciableCost / assetLifespan);
    }
}
