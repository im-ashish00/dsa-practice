public class GoodPairs {
    public static void main(String[] args) {
        // Time complexity: O(n2)
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length)
                break;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
