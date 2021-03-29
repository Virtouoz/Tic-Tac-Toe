import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array;
        array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int result = 0;
        int result2 = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] <= array[i]) {
                result++;
            } else if (result > result2) {
                result2 = result;
                result = 0;
            }
        }
        if (result > result2) {
            result2 = result;
        }
        System.out.println(result2 + 1);
    }
}