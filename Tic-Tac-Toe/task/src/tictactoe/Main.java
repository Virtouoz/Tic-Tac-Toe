//package tictactoe;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        Scanner scanner = new Scanner(System.in);
//        String newStr = "         ";
//        String result = null;
//        printCells(newStr);
//        int a = 1;
//        int k = 0;
//
//        while (a==1) {
//
//            if (k < 9) {
//                k++;
//            } else {
//                System.out.println("Draw");
//            }
//
//            int x = 0;
//            int y = 0;
//            int coordinate;
//            int flag1 = 0;
//            int flag2 = 0;
//
//            do {
//                int reloop = 0;
//                do {
//                    try {
//                        System.out.println("Enter the coordinates: ");
//                        x = scanner.nextInt();
//                        y = scanner.nextInt();
//                        reloop++;
//                    } catch (Exception e) {
//                        System.out.println("You should enter numbers!");
//                        String str = scanner.nextLine();
//                    }
//                }
//                while (reloop == 0);
//
//                coordinate = (x - 1) * 3 + (y - 1);
//                if (x < 1 || x > 3 || y < 1 || y > 3) {
//                    System.out.println("Coordinates should be from 1 to 3!");
//                    flag1 = 1;
//                } else {
//                    if (newStr.charAt(coordinate) == ' ') {
//                        newStr = newStr.substring(0, coordinate) + 'X' + newStr.substring(coordinate + 1);
//                    } else {
//                        System.out.println("This cell is occupied! Choose another one!");
//                        flag1 = 1;
//                    }
//                }
//            } while (flag1 == 1);
//
//            printCells(newStr);
//            if (-1 == chek(newStr)) {
//                a = -1;
//            }
//
//            if (k < 9) {
//                k++;
//            } else {
//                System.out.println("Draw");
//            }
//
//            do {
//                int reloop = 0;
//                do {
//                    try {
//                        System.out.println("Enter the coordinates: ");
//                        x = scanner.nextInt();
//                        y = scanner.nextInt();
//                        reloop++;
//                    } catch (Exception e) {
//                        System.out.println("You should enter numbers!");
//                        String str = scanner.nextLine();
//                    }
//                }
//                while (reloop == 0);
//
//                coordinate = (x - 1) * 3 + (y - 1);
//                if (x < 1 || x > 3 || y < 1 || y > 3) {
//                    System.out.println("Coordinates should be from 1 to 3!");
//                    flag2 = 1;
//                } else {
//                    if (newStr.charAt(coordinate) == ' ') {
//                        newStr = newStr.substring(0, coordinate) + 'O' + newStr.substring(coordinate + 1);
//                    } else {
//                        System.out.println("This cell is occupied! Choose another one!");
//                        flag2 = 1;
//                    }
//                }
//            } while (flag2 == 1);
//
//            printCells(newStr);
//            if (-1 == chek(newStr)) {
//                a = -1;
//            }
//        }
//    }
//
//    public static boolean function(int a, int b, int c, String newStr) {
//        return newStr.charAt(a) == newStr.charAt(b) && newStr.charAt(a) == newStr.charAt(c);
//    }
//
//    public static void printCells(String newStr) {
//        System.out.println("---------");
//        for (int i = 0; i < 3; i++) {
//            System.out.println("| " + newStr.charAt(i * 3) +
//                    " " + newStr.charAt(i * 3 + 1) +
//                    " " + newStr.charAt(i * 3 + 2) + " |");
//        }
//        System.out.println("---------");
//    }
//
//    public static int chek(String newStr) {
//        String result = null;
//        int quantityX = 0;
//        int quantityO = 0;
//        int quantity_ = 0;
//        for (int i = 0; i < 9; i++) {
//            if (newStr.charAt(i) == 'X') {
//                quantityX++;
//            } else if (newStr.charAt(i) == 'O') {
//                quantityO++;
//            } else if (newStr.charAt(i) == '_') {
//                quantity_++;
//            }
//        }
//        if (quantityX - quantityO >= 2 || quantityO - quantityX >= 2) {
//            result = "Impossible";
//            System.out.println(result);
//            return -1;
//        }
//        int number = 0;
//        int quantityNumbers = -1;
//        if (function(0, 5, 8, newStr)) {
//            number = 1;
//            quantityNumbers = 0;
//        }
//        if (function(2, 4, 6, newStr)) {
//            if (quantityNumbers != -1 && newStr.charAt(quantityNumbers) != newStr.charAt(2)) {
//                result = "Impossible";
//                System.out.println(result);
//                return -1;
//            }
//            number = 2;
//            quantityNumbers = 2;
//        }
//        if (function(0, 1, 2, newStr)) {
//            if (quantityNumbers != -1 && newStr.charAt(quantityNumbers) != newStr.charAt(0)) {
//                result = "Impossible";
//                System.out.println(result);
//                return -1;
//            }
//            number = 3;
//            quantityNumbers = 2;
//        }
//        if (function(3, 4, 5, newStr)) {
//            if (quantityNumbers != -1 && newStr.charAt(quantityNumbers) != newStr.charAt(3)) {
//                result = "Impossible";
//                System.out.println(result);
//                return -1;
//            }
//            number = 4;
//            quantityNumbers = 3;
//        }
//        if (function(6, 7, 8, newStr)) {
//            if (quantityNumbers != -1 && newStr.charAt(quantityNumbers) != newStr.charAt(6)) {
//                result = "Impossible";
//                System.out.println(result);
//                return -1;
//            }
//            number = 5;
//            quantityNumbers = 6;
//        }
//        if (function(0, 3, 6, newStr)) {
//            if (quantityNumbers != -1 && newStr.charAt(quantityNumbers) != newStr.charAt(0)) {
//                result = "Impossible";
//                System.out.println(result);
//                return -1;
//            }
//            number = 6;
//            quantityNumbers = 0;
//        }
//        if (function(1, 4, 7, newStr)) {
//            if (quantityNumbers != -1 && newStr.charAt(quantityNumbers) != newStr.charAt(1)) {
//                result = "Impossible";
//                System.out.println(result);
//                return -1;
//            }
//            number = 7;
//            quantityNumbers = 1;
//        }
//        if (function(2, 5, 8, newStr)) {
//            if (quantityNumbers != -1 && newStr.charAt(quantityNumbers) != newStr.charAt(2)) {
//                result = "Impossible";
//                System.out.println(result);
//                return -1;
//            }
//            number = 8;
//        }
//
//        switch (number) {
//            case 0:
//                break;
//            case 1:
//            case 3:
//            case 6:
//                if (newStr.charAt(0) == 'X') {
//                    result = "X wins";
//                    System.out.println(result);
//                    return -1;
//                } else if (newStr.charAt(0) == 'O') {
//                    result = "O wins";
//                    System.out.println(result);
//                    return -1;
//                }
//                break;
//            case 2:
//            case 8:
//                if (newStr.charAt(2) == 'X') {
//                    result = "X wins";
//                    System.out.println(result);
//                    return -1;
//                } else if (newStr.charAt(2) == 'O') {
//                    result = "O wins";
//                    System.out.println(result);
//                    return -1;
//                }
//                break;
//            case 4:
//            case 7:
//                if (newStr.charAt(4) == 'X') {
//                    result = "X wins";
//                    System.out.println(result);
//                    return -1;
//                } else if (newStr.charAt(4) == 'O') {
//                    result = "O wins";
//                    System.out.println(result);
//                    return -1;
//                }
//                break;
//            case 5:
//                if (newStr.charAt(6) == 'X') {
//                    result = "X wins";
//                    System.out.println(result);
//                    return -1;
//                } else if (newStr.charAt(6) == 'O') {
//                    result = "O wins";
//                    System.out.println(result);
//                    return -1;
//                }
//                break;
//        }
//        return 1;
//    }
//}

package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[3][3];
        int[] xy = new int[2];
        xy[0] = 0;
        xy[1] = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = ' ';
            }
        }
        printCell(matrix);


        while (true) {
            while (true) {
                input(scanner, xy);
                if (cheakInput(xy, matrix) != null) {
                    System.out.println(cheakInput(xy, matrix));
                } else {
                    break;
                }
            }
            matrix[xy[0] - 1][xy[1] - 1] = 'X';
            if (cheakVictori(matrix) != null) {
                printCell(matrix);
                System.out.println(cheakVictori(matrix));
                break;
            }
            printCell(matrix);

            while (true) {
                input(scanner, xy);
                if (cheakInput(xy, matrix) != null) {
                    System.out.println(cheakInput(xy, matrix));
                } else {
                    break;
                }
            }
            matrix[xy[0] - 1][xy[1] - 1] = 'O';
            if (cheakVictori(matrix) != null) {
                printCell(matrix);
                System.out.println(cheakVictori(matrix));
                break;
            }
            printCell(matrix);
        }


    }

    public static void input(Scanner scanner, int[] xy) {
        int reloop = 0;
        do {
            try {
                System.out.println("Enter the coordinates: ");
                xy[0] = scanner.nextInt();
                xy[1] = scanner.nextInt();
                reloop = 1;
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                String str = scanner.nextLine();
            }
        }
        while (reloop == 0);
    }

    public static void printCell(char[][] matrix) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public static String cheakInput(int[] xy, char[][] matrix) {
        String result = null;
        if (xy[0] < 1 || xy[0] > 3 || xy[1] < 1 || xy[1] > 3) {
            result = "Coordinates should be from 1 to 3!";
            return result;
        }
        if (matrix[xy[0] - 1][xy[1] - 1] != ' ') {
            result = "This cell is occupied! Choose another one!";
        }
        return result;
    }

    public static String cheakVictori(char[][] matrix) {
        String result = null;
        int quantityX = 0;
        int quantityO = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 'X') {
                    quantityX++;
                } else if (matrix[i][j] == 'O') {
                    quantityO++;
                }
            }
        }
        if (quantityX - quantityO >= 2 || quantityO - quantityX >= 2) {
            result = "Impossible";
            return result;
        }
        //(0,0)(0,1)(0,2)
        //(1,0)(1,1)(1,2)
        //(2,0)(2,1)(2,2)
        if (matrix[0][0] == matrix[0][1] && matrix[0][0] == matrix[0][2]) {
            if (matrix[0][0] == 'X') {
                result = "X wins";
            } else if (matrix[0][0] == 'O') {
                result = "O wins";
            }
        }
        if (matrix[1][0] == matrix[1][1] && matrix[1][0] == matrix[1][2]) {
            if (matrix[1][0] == 'X') {
                result = "X wins";
            } else if (matrix[1][0] == 'O') {
                result = "O wins";
            }
        }
        if (matrix[2][0] == matrix[2][1] && matrix[2][0] == matrix[2][2]) {
            if (matrix[2][0] == 'X') {
                result = "X wins";
            } else if (matrix[2][0] == 'O') {
                result = "O wins";
            }
        }

        if (matrix[0][0] == matrix[1][0] && matrix[0][0] == matrix[2][0]) {
            if (matrix[0][0] == 'X') {
                result = "X wins";
            } else if (matrix[0][0] == 'O') {
                result = "O wins";
            }
        }
        if (matrix[0][1] == matrix[1][1] && matrix[0][1] == matrix[2][1]) {
            if (matrix[0][1] == 'X') {
                result = "X wins";
            } else if (matrix[0][1] == 'O') {
                result = "O wins";
            }
        }
        if (matrix[0][2] == matrix[1][2] && matrix[0][2] == matrix[2][2]) {
            if (matrix[0][2] == 'X') {
                result = "X wins";
            } else if (matrix[0][2] == 'O') {
                result = "O wins";
            }
        }

        if (matrix[0][0] == matrix[1][1] && matrix[0][0] == matrix[2][2]) {
            if (matrix[0][0] == 'X') {
                result = "X wins";
            } else if (matrix[0][0] == 'O') {
                result = "O wins";
            }
        }
        if (matrix[2][0] == matrix[1][1] && matrix[1][1] == matrix[0][2]) {
            if (matrix[2][0] == 'X') {
                result = "X wins";
            } else if (matrix[2][0] == 'O') {
                result = "O wins";
            }
        }
        return result;
    }
}
