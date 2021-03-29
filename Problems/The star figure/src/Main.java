import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] array;
        array = new char[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '.';
                if (i == j) {
                    array[i][j] = '*';
                }
                if (i == n - j - 1) {
                    array[i][j] = '*';
                }
                if (i == (n - 1) / 2) {
                    array[i][j] = '*';
                }
                if (j == (n - 1) / 2) {
                    array[i][j] = '*';
                }
            }
        }

        for (char[] chars : array) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }

    }
}