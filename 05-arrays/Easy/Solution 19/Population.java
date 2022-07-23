public class Population {
    static public int maximumPopulation(int[][] logs) {
        int[] pop = new int[2051];

        for (int i = 0; i < logs.length; i++) {
            ++pop[logs[i][0]];
            --pop[logs[i][1]];
        }

        int maxYear = 1950;
        int yearIndex = pop[1950];
        for (int i = 1951; i < pop.length; i++) {
            pop[i] = pop[i] + pop[i - 1];
            if (pop[i] > yearIndex) {
                yearIndex = pop[i];
                maxYear = i;
            }
        }
        return maxYear;
    }

    public static void main(String[] args) {
        int[][] logs = { { 1993, 1999 }, { 2000, 2010 } };
        System.out.println(maximumPopulation(logs));
    }
}