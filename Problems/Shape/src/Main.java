import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String str0 = "You have chosen a ";
        String str1 = "square";
        String str2 = "circle";
        String str3 = "triangle";
        String str4 = "rhombus";
        String strNoZero = "There is no such shape!";
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                System.out.println(str0 + str1);
                break;
            case 2:
                System.out.println(str0 + str2);
                break;
            case 3:
                System.out.println(str0 + str3);
                break;
            case 4:
                System.out.println(str0 + str4);
                break;
            default:
                System.out.println(strNoZero);
                break;
        }
    }
}