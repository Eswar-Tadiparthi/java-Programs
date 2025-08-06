import java.util.Scanner;

public class ExamStatistics {
    public static void main(String[] args) {
        int[] scores = new int[100];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student exam scores (0-100). Type -1 to stop:");

        while (count < 100) {
            int score = sc.nextInt();
            if (score == -1)
                break;
            if (score >= 0 && score <= 100) {
                scores[count] = score;
                count++;
            } else {
                System.out.println("Invalid score. Please enter 0–100.");
            }
        }

        if (count == 0) {
            System.out.println("No scores entered.");
            return;
        }

        // Calculate mean
        double sum = 0;
        for (int i = 0; i < count; i++) sum += scores[i];
        double mean = sum / count;

        // Calculate standard deviation
        double variance = 0;
        for (int i = 0; i < count; i++) {
            variance += Math.pow(scores[i] - mean, 2);
        }
        double stdDev = Math.sqrt(variance / count);

        // Calculate number of scores in each range
        int[] ranges = new int[10]; // 0: <10, 1: 10-19, ..., 9: ≥90
        for (int i = 0; i < count; i++) {
            int score = scores[i];
            if (score < 10)
                ranges[0]++;
            else if (score >= 90)
                ranges[9]++;
            else
                ranges[score / 10]++;
        }

        // Output: Basic range count summary
        System.out.println("\n========== Exam Statistics ==========");
        System.out.println("Total Students       : " + count);
        System.out.printf("Average (Mean) Score : %.2f\n", mean);
        System.out.printf("Standard Deviation   : %.2f\n", stdDev);
        System.out.printf("< 10 %d\n", ranges[0]);
        for (int i = 1; i <= 8; i++) {
            System.out.printf("%2d - %2d  %d\n", i * 10, i * 10 + 9, ranges[i]);
        }
        System.out.printf("90 and above %d\n", ranges[9]);
    }
}
