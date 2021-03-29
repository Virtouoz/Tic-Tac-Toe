import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number;
        int result;
        number = scanner.nextInt();
        result = number % 10 + (number % 100) / 10 + number / 100;
        System.out.println(result);
    }
}