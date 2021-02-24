import java.util.Scanner;
public class Сalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = in.nextDouble();
        System.out.println("Введите второе число: ");
        double y = in.nextDouble();
        in.nextLine();
        System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’. ");
        String sim = in.nextLine();
        double res = 0;
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