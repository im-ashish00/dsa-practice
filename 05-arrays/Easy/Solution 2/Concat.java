import java.util.Arrays;

public class Concat {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int numberOfElements = nums.length;
        int[] ans = new int[numberOfElements * 2];
        for (int i = 0; i < numberOfElements; i++) {
            ans[i] = nums[i];
            ans[i + numberOfElements] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
