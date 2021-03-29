import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 0;
        if (a % n == 0 || b % n == 0) {
            ++result;
        } else if (a / n < b / n) {
            ++result;
        }
        result += (b - a) / n;
        System.out.println(result);
    }
}