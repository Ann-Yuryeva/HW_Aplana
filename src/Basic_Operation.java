import java.util.Scanner;

public class Basic_Operation {

    public static void main(String[] args) {

        int count=0;
        double X,Y,Z;
        Scanner in = new Scanner(System.in);
        count++;
        System.out.println("Введите число X = " );
        X = in.nextDouble();

        count++;
        System.out.println("Введите число Y = " );
        Y = in.nextDouble();

        count++;
        System.out.println("Введите число Z = ");
        Z = in.nextDouble();


        double average = (X+Y+Z)/count;
        System.out.println("Среднее арифмитическое введённых чисел =" + average);

        int division = (int)average/2 ;
        System.out.println("Результат деления =" + division);
        if (division>3) {
            System.out.println("Программа выполнена корректно");
        } else {
            System.out.println("Программа выполнена НЕкорректно");
        }

    }
}
