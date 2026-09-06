import java.util.Scanner;

public class PermutationCombination {

    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input.");
            return;
        }

        long permutation = factorial(n) / factorial(n - r);
        long combination = factorial(n) /
                (factorial(r) * factorial(n - r));

        System.out.println("Permutation (nPr) = " + permutation);
        System.out.println("Combination (nCr) = " + combination);
    }
}
