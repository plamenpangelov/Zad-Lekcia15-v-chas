import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void printMatrixDiagonals(int[][] arr) {
        //print main diagonal
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
        //print main diagonal - 2nd solution
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();

        //print second diagonal
        int a = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][a] + " ");
            a--;
        }
        System.out.println();
        //print second diagonal - 2nd solution
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length - 1 - i] + " ");
        }
        System.out.println();

        //print second diagonal - 3rd solution
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == arr.length - 1 - j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void sumMatrixDiagonals(int[][] arr) {
        System.out.println("sum main diagonal: " + sumMatrixMainDiagonal(arr));
        System.out.println("sum second diagonal: " + sumMatrixSecondDiagonal(arr));
    }

    public static int sumMatrixMainDiagonal(int[][] arr) {
        int sumMainDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumMainDiagonal = sumMainDiagonal + arr[i][i];
        }
        return sumMainDiagonal;
    }

    public static int sumMatrixSecondDiagonal(int[][] arr) {
        int sumSecondDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumSecondDiagonal += arr[i][arr.length - 1 - i];
        }
        return sumSecondDiagonal;
    }

    public static void printCustomMatrixSum(int[][] customMatrix) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < customMatrix.length; i++) {
            for (int j = 0; j < customMatrix.length; j++) {
                System.out.println("Enter value for element (" + i + ";" + j + "): ");
                customMatrix[i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        System.out.println("Elements above the main diagonal: ");
        for (int i = 0; i < customMatrix.length - 1; i++) {
            for (int j = i + 1; j < customMatrix.length; j++) {
                System.out.print(customMatrix[i][j] + ", ");
                sum += customMatrix[i][j];
            }
        }
        System.out.println("Their sum = " + sum);
    }
}