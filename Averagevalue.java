import java.util.Scanner;
public class Averagevalue{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input num: ");
        int x = in.nextInt();
        System.out.println("Input num: ");
        int y = in.nextInt();
        System.out.println("Input num: ");
        int z = in.nextInt();
        double average = (x + y + z) / 3.0;
        System.out.printf( "%.2f %n" , average);
        double a = average / 2 - average%2 / 2;
        if (a > 3) {
            System.out.printf("Программа выполнена корректно.");
        }
        else {
            System.out.printf("Программа выполнена.");
        }
    }
}
