public class Q3CoinChange {


    // Array of Pakistani currency denominations
    private static final int[] DENOMINATIONS = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

    // Method to find the minimum denominations
    public static void findMinDenominations(int amount) {
        int[] count = new int[DENOMINATIONS.length];

        // Calculate the count of each denomination required
        for (int x = 0; x < DENOMINATIONS.length; x++) {
            if (amount >= DENOMINATIONS[x]) {
                count[x] = amount / DENOMINATIONS[x];
                amount = amount % DENOMINATIONS[x];
            }
        }

        // Print the OUTPUT
        System.out.printf("\nALVIN RICHARD 2212209");
        System.out.println("\nThe Currency count for Rs. 1988:");
        for (int y = 0; y < DENOMINATIONS.length; y++) {
            if (count[y] != 0) {
                System.out.println(DENOMINATIONS[y] + " : " + count[y]);
            }
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int amount = 1988;
        findMinDenominations(amount);
    }
}