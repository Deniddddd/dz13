
import java.util.Scanner;

public class Mat {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите 2 любых целых числа: ");
        int number = n.nextInt();
        int number1 = n.nextInt();
        int[][] a = new int[number][number1];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number1; j++) {
                a[i][j] = number*i + number1;
            }
        }
        System.out.println("Начальная матрица");
        System.out.println("------");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number1; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < number; i++) {
            for (int j = i+1; j < number; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }
        }
        System.out.println();
        System.out.println("Новая матрица");
        System.out.println("------");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}

