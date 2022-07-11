import java.util.ArrayList;
import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        int max = 0;
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
        for (int candy : candies) max = Math.max(candy, max);
        for (int candy : candies) result.add(candy + extraCandies >= max);
        System.out.println(result);
    }
}
