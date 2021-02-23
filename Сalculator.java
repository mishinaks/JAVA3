import java.util.Scanner;
public class Сalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = in.nextInt();
        System.out.println("Введите второе число: ");
        int y = in.nextInt();
        in.nextLine();
        System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’. ");
        String sim = in.nextLine();
        int res = 0;
        switch (sim) {
            case "+":
                res = x + y;
                break;
            case "-":
                res = x - y;
                break;
            case "*":
                res = x * y;
                break;
            case "/":
                res = x / y;
                break;
            default: System.out.println("ОШИБКА!Будьте внимательнее!");
                return;
        }
        System.out.println("Результат: " + res);
    }
}
