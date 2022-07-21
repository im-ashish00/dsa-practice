public class Diagonal {
    static public int diagonalSum(int[][] mat) {
        int totalSum = 0, n = mat.length;
        for (int i = 0; i < n; i++) {
            totalSum += mat[i][i];
            totalSum += mat[i][n - 1 - i];
        }
        return totalSum - (n % 2 == 0 ? 0 : mat[n / 2][n / 2]);
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalSum(matrix));
    }
}
