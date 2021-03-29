import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // put your code here
        double a;
        double b;
        double c;
        double d;
        double result;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        result = a * 10.5 + b * 4.4 + (c + d) / 2.2;
        System.out.println(result);
    }
}