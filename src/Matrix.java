import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.println("Длина матрицы:  ");
        int matrix_long_i = in.nextInt();
        int matrix_long_j = in.nextInt();
        int[][] matrix = new int[matrix_long_i][matrix_long_j];
        System.out.println("Произведите ввод данных с клавиатуры в матрицу :  ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }System.out.print("");
        }System.out.println("Матрица =" );
        for (int i =0;i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }System.out.println("");
        System.out.println("первая строка матрицы: ");
        for (int i =0;i < 1; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}