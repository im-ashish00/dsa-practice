import java.util.ArrayList;
import java.util.Collections;

public class ArrayForm {

    static public ArrayList<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = n - 1; i >= 0; i--) {
            res.add((num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.add(k % 10);
            k = k / 10;
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }
}