public class Batting {
    public static void main(String[] args) {
        int totalruns = 200, innings = 5, notout = 1;
        double avg = totalruns / (innings - notout);
        System.out.println("batting average=" + avg);
    }
}