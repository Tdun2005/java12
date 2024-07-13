import java.util.Random;
import java.util.Scanner;

public class MyArrayRandom {

    // Hàm tạo một mảng int có đúng n phần tử chứa các số ngẫu nhiên trong khoảng [-1000...1000]
    public static int[] createOne(int n) {
        Random r = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = r.nextInt(2001) - 1000;  // nextInt(2001) tạo số từ 0 đến 2000, sau đó trừ đi 1000
        }
        return array;
    }

    // Hàm tạo một mảng int 2 chiều cỡ m x n chứa các số ngẫu nhiên trong khoảng [10..99]
    public static int[][] createTwo(int m, int n) {
        Random r = new Random();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = r.nextInt(90) + 10;  // nextInt(90) tạo số từ 0 đến 89, sau đó cộng thêm 10
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên m, n
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số nguyên m: ");
        int m = scanner.nextInt();

        // Tạo và in mảng n phần tử
        int[] arrayOne = createOne(n);
        System.out.println("Mảng một chiều:");
        for (int i : arrayOne) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Tạo và in mảng m x n phần tử
        int[][] arrayTwo = createTwo(m, n);
        System.out.println("Mảng hai chiều:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayTwo[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
