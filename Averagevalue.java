import java.util.Scanner;
public class Averagevalue{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input num: ");
        double x = in.nextDouble();
        System.out.println("Input num: ");
        double y = in.nextDouble();
        System.out.println("Input num: ");
        double z = in.nextDouble();
        double average = (x + y + z) / 3.0;
        System.out.printf( "%.2f %n" , average);
        double a = Math.floor(average / 2);
        if (a > 3) {
            System.out.printf("Программа выполнена корректно.");
        }
        else {
            System.out.printf("Программа выполнена.");
        }
    }
}