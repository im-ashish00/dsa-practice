import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = nums.length / 2;
        int[] answer = new int[2 * n];

        for (int i = 0; i < n; i++) {
            answer[i * 2] = nums[i];
            answer[i * 2 + 1] = nums[i + n];
        }
        System.out.println(Arrays.toString(answer));
    }
}
