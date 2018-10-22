import java.util.Scanner;
import java.lang.*;




public class binarycode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в двоичной системе счисления: " );
        String bi=in.nextLine();
        System.out.println(Integer.parseInt(bi, 2));
    }
}
