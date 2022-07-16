import java.util.Arrays;

public class Match {
    static public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] target = { nums[0] }; // first element is always at index 0
        for (int i = 1; i < len; i++) {
            int targetlen = target.length;
            int newnum = nums[i]; // number to insert in target
            int position = index[i]; // position of new element(newnum) in array
            target = insert(targetlen, newnum, target, position); // insert new element in target
        }
        return target;
    }

    static public int[] insert(int len, int num, int[] nums, int pos) {
        int newarrlen = len + 1;
        int newarr[] = new int[newarrlen];
        for (int i = 0; i < newarrlen; i++) {
            if (i < pos) // copy all elements (before pos) in new array
                newarr[i] = nums[i];
            else if (i == pos) // copy new element in new array
                newarr[i] = num;
            else
                newarr[i] = nums[i - 1]; // copy remaining elements to new array after pos(index)

        }
        return newarr; // return new array with new element at pos
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}
