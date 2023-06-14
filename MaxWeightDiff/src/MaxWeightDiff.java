import java.util.Arrays;
import java.util.Scanner;

public class MaxWeightDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int no_weights = scanner.nextInt();
        int k = scanner.nextInt();

        int[] weight = new int[no_weights];
        for (int i = 0; i < no_weights; i++) {
            weight[i] = scanner.nextInt();
        }

        Arrays.sort(weight);

        int total = 0;
        int first = 0;
        int last = 0;

        for (int i = 0; i < no_weights; i++) {
            total += weight[i];

            if (i < k) {
                first += weight[i];
            }

            if (i >= no_weights - k) {
                last += weight[i];
            }
        }

        int difference_1 = Math.abs(first - (total - first));
        int difference_2 = Math.abs(last- (total - last));

        int max_difference = Math.max(difference_1, difference_2);
        System.out.println(max_difference);
    }
}
