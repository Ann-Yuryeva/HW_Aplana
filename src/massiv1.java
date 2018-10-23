import java.util.Scanner;

public class massiv1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int mas_long=in.nextInt();
        System.out.println("длина массива: " + mas_long);
        int [] massiv = new int[mas_long];
        System.out.println("Заполните числами массив: ");
        for (int i=0;i<mas_long;i++){
            massiv[i]=in.nextInt();
        }for (int arr: massiv){
            System.out.println("=" + arr*2);
        }
    }
}
