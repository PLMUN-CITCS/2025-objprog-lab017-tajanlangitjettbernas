import java.util.Scanner;

public class GradeCalculator {
//get the grade
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();
        return score;
    }

    public static String calculateGrade(double score) { //calculate grade
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    public static void main(String[] args) {
        double score = getStudentScore();
        String grade = calculateGrade(score);
        System.out.println("Your grade is: " + grade);
    }
}