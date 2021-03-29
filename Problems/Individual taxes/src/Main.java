import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayCompany;
        int[] arrayTaxes;
        arrayCompany = new int[n];
        arrayTaxes = new int[n];

        for (int i = 0; i < arrayCompany.length; i++) {
            arrayCompany[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrayTaxes.length; i++) {
            arrayTaxes[i] = scanner.nextInt();
        }

        double result = 0;
        int idex = 0;

        for (int i = 0; i < n; i++) {
            if (arrayCompany[i] * arrayTaxes[i] > result) {
                result = arrayCompany[i] * arrayTaxes[i];
                idex = i + 1;
            }
        }

        System.out.println(idex);

    }
}