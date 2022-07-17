public class Matrix {
    static public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        for (int[] ind : indices) {
            row[ind[0]]++;
            col[ind[1]]++;
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int m = 2, n = 2;
        int[][] indices = { { 1, 1 }, { 0, 0 } };
        System.out.println(oddCells(m, n, indices));
    }
}
