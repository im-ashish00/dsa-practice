import java.util.Arrays;

public class Flipping {
    static public int[][] flipAndInvertImage(int[][] image) {
        int rowLength = image.length, colLength = image[0].length;
        int[][] result = new int[rowLength][colLength];
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                result[row][col] = image[row][colLength - 1 - col];
            }
            for (int col = 0; col < colLength; col++) {
                result[row][col] ^= 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        System.out.println(Arrays.deepToString(image));
    }
}
