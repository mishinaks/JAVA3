import java.util.Scanner;
public class Сonversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = in.nextInt();
        if (x == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция, 4 - карат");
            int measureone = in.nextInt();
            System.out.println("Введите количество выбранных единиц");
            float quantity = in.nextFloat();
            if (measureone == 1) {
                System.out.printf("Результат: \nКилограммы: %.2f\nФунты: %.2f\nУнции: %.2f\nКараты: %.2f", quantity, quantity * 2.2, quantity * 35.27, quantity * 5000);
            }
            else if (measureone == 2) {
                System.out.printf("Результат: \nКилограммы: %.2f\nФунты: %.2f\nУнции: %.2f\nКараты: %.2f", quantity * 0.45, quantity, quantity * 16, quantity * 2267.96);
            }
            else if (measureone == 3) {
                System.out.printf("Результат: \nКилограммы: %.2f\nФунты: %.2f\nУнции: %.2f\nКараты: %.2f", quantity * 0.028, quantity * 0.06, quantity, quantity * 141.74);
            }
            else if (measureone == 4) {
                System.out.printf("Результат: \nКилограммы: %.4f\nФунты: %.4f\nУнции: %.3f\nКараты: %.2f", quantity * 0.0002, quantity * 0.0004, quantity * 0.007, quantity);
            }
            else {
                System.out.println("Ошибка! Перезапутите программу!!!");
            }
        }
        else if (x == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int measuretwo = in.nextInt();
            System.out.println("Введите количество выбранных единиц");
            float quantitytwo = in.nextFloat();
            if (measuretwo == 1) {
                System.out.printf("Результат: \nМетры: %.2f\nМили: %.3f\nЯрды: %.2f\nФуты: %.2f", quantitytwo, quantitytwo * 0.0006, quantitytwo * 1.094, quantitytwo * 3.28);
            }
            else if (measuretwo == 2) {
                System.out.printf("Результат: \nМетры: %.2f\nМили: %.2f\nЯрды: %.2f\nФуты: %.2f", quantitytwo * 1609.34, quantitytwo, quantitytwo * 1759.99, quantitytwo * 5279.99);
            }
            else if (measuretwo == 3) {
                System.out.printf("Результат: \nМетры: %.2f\nМили: %.4f\nЯрды: %.2f\nФуты: %.2f", quantitytwo * 0.914, quantitytwo * 0.0006, quantitytwo, quantitytwo * 3);
            }
            else if (measuretwo == 4) {
                System.out.printf("Результат: \nМетры: %.2f\nМили: %.4f\nЯрды: %.3f\nФуты: %.2f", quantitytwo * 0.3, quantitytwo * 0.00019, quantitytwo * 0.333, quantitytwo);
            }
            else {
                System.out.println("Ошибка! Перезапутите программу!!!");
            }
        }
        else {
            System.out.println("Ошибка! Перезапутите программу!!!");
        }
    }
}
