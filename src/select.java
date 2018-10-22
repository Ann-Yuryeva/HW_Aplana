import java.util.Scanner;

public class select {
    public static void main(String args[]) {

        System.out.println("ввести число на выбор: X, Y или Z");
        Scanner in = new Scanner(System.in);
        String num= in.nextLine();
        if(num.equals("X")){
            System.out.println("Введено число : X");
        } else if (num.equals("Y")){
            System.out.println("Введено число : Y");
        }else if (num.equals("Z")){
            System.out.println("Введено число : Z");
        }
        }


    }