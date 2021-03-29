import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix;
        matrix = new int[n][m];
        int indexI = 0;
        int indexJ = 0;
        int number = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        number = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (number < matrix[i][j]) {
                    indexI = i;
                    indexJ = j;
                    number = matrix[i][j];
                }
            }
        }
        System.out.println(indexI + " " + indexJ);
    }
}