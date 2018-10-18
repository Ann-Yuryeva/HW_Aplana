import java.util.Scanner;

public class Basic_Operation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        count++;
        double X,Y,Z;
        System.out.println("Введите число X = " );
        X = in.nextDouble();
        System.out.println("Введено чисел = " + count++);

        System.out.println("Введите число Y = " );
        Y = in.nextDouble();
        System.out.println("Введено чисел = " + count++);

        System.out.println("Введите число Z = ");
        Z = in.nextDouble();
        System.out.println("Введено чисел = " + count++);

        double average = (X+Y+Z)/count;
        System.out.println("Среднее арифмитическое введённых чисел =" + average);

        double division = average/2%0;
        System.out.println("Результат деления =" + division);
        if (division>3) {
            System.out.println("Программа выполнена корректно");
        } else {
            System.out.println("Программа выполнена НЕкорректно");
        }

    }
}
