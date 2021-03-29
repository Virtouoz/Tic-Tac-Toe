import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array;
        int result = 0;
        array = new int[len];
        int number = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (number < array[i]) {
                number = array[i];
                result = i;
            }
        }
        System.out.println(result);
    }
}