import java.util.Scanner;

public class HouseholdWaterManagement {

    // 1c: Method to calculate total water consumption
    public static double calculateTotal(double morningUsage, double eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== HOUSEHOLD WATER MANAGEMENT SYSTEM ===\n");

        // --- PART 1a & 1c: Input Details ---
        System.out.print("Enter House Number (integer): ");
        int houseNumber = scanner.nextInt();

        System.out.print("Enter Number of Family Members (integer): ");
        int familyMembers = scanner.nextInt();

        System.out.print("Enter Morning Water Usage in litres (decimal): ");
        double morningUsage = scanner.nextDouble();

        System.out.print("Enter Evening Water Usage in litres (decimal): ");
        double eveningUsage = scanner.nextDouble();

        // 1c: Calling method to calculate total consumption
        double totalWaterConsumed = calculateTotal(morningUsage, eveningUsage);

        System.out.print("Enter Water Usage Status (single char, e.g., 'A' for Active, 'N' for Normal): ");
        char usageStatus = scanner.next().charAt(0);

        // --- PART 1b: Bill Calculation ---
        int bill;
        if (totalWaterConsumed <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        // --- Output Display (1a, 1b, 1c Summary) ---
        System.out.println("\n-------------------------------------------");
        System.out.println("            HOUSEHOLD SUMMARY DETAILS      ");
        System.out.println("-------------------------------------------");
        System.out.println("House Number           : " + houseNumber);
        System.out.println("Family Members         : " + familyMembers);
        System.out.println("Morning Usage          : " + morningUsage + " Litres");
        System.out.println("Evening Usage          : " + eveningUsage + " Litres");
        System.out.println("Total Water Consumed   : " + totalWaterConsumed + " Litres");
        System.out.println("Water Usage Status     : " + usageStatus);
        System.out.println("-------------------------------------------");
        System.out.println("Calculated Water Bill  : Rs. " + bill);
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}
   