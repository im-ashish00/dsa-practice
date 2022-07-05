public class CGPA {
    public static void main(String[] args) {
        double[] marks = { 90, 80, 80, 80, 90 };
        int number = marks.length;
        double grade[] = new double[number];
        double cgpa, sum = 0;
        for (int i = 0; i < number; i++) {
            grade[i] = (marks[i] / 10);
        }

        for (int i = 0; i < number; i++) {
            sum += grade[i];
        }
        cgpa = sum / number;
        System.out.println("CGPA: " + cgpa);
    }
}
