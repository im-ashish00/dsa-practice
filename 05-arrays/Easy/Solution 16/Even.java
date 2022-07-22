public class Even {

    static public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numberOfDigits = (int) Math.log10(nums[i]) + 1;
            if (numberOfDigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 234, 24 };
        System.out.println(findNumbers(nums));
    }
}
