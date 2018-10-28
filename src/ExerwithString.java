import java.util.Scanner;

public class ExerwithString {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введи какой-нибудь текст: ");
        String hi =in.nextLine();

        /* Начинаем выполнение задания №1*/
        System.out.println("Выполнение 1-ого задания: " );
        System.out.println( "GM!" + hi + "!");

        /* Начинаем выполнение задания №2*/
        String bye = hi.replaceAll(" ", "");
        System.out.println("Выполнение задания №2: " + bye);

        /* Начинаем выполнение задания №3.
        Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
         Вывести на экран строку с наибольшей длинной.
         */
        System.out.println("Ввести две строки для выполнения 3 задания: ");
        String a = in.nextLine();
        String b = in.nextLine();
        int a_len =a.length();
        int b_len =b.length();

        if(a_len>b_len){
            System.out.println("первая строка длиннее чем вторая");
            System.out.println("первая строка : " + a);
        }else if (a_len<b_len){
            System.out.println("вторая строка длиннее чем первая");
            System.out.println("вторая строка : " + b);
        }
            }
        }
