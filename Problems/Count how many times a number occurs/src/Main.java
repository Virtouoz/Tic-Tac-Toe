import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int len;
        int n;
        int result = 0;
        len = scanner.nextInt();
        array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        for (int var : array) {
            if (var == n) {
                result++;
            }
        }
        System.out.println(result);
    }
}