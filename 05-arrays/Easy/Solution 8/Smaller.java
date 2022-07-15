import java.util.Arrays;

public class Smaller {
    public static void main(String[] args) {
        int[] nums = { 5, 0, 10, 0, 10, 6 };
        // Time complexity: O(N2)
        // int[] result = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        // int count = 0;
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[j] < nums[i]) count++;
        // }
        // result[i] = count;
        // }
        // return result;

        // Time complexity: O(N)
        // Using bucket container
        int[] count = new int[101]; // because nums[i] <= 100
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i] - 1];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
