import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input: number of terms to print
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci No up to " + n + " Terms is:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // ✅ print current term as b hold the next term  ..
            int c = a + b;             // calculate next term
            a = b;                     // move forward
            b = c;                     // move forward
        }
    }
}
