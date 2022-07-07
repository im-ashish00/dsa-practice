public class Richest {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int maximumAmount = 0;
        for (int i = 0; i < accounts.length; i++) {
            int amountforCurrentPerson = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                amountforCurrentPerson += accounts[i][j];
            }
            if (maximumAmount < amountforCurrentPerson) {
                maximumAmount = amountforCurrentPerson;
            }
        }
        System.out.println("Maximum Amount: " + maximumAmount);
    }
}
