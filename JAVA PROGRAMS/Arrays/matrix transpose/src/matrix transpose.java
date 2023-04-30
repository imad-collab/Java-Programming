import java.util.Scanner;

class Transpose {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];
        int transpose[][] = new int[columns][rows];

        System.out.println("Enter the elements in matrix: ");
         //1st array arr[] is created.
        System.out.println("Original  matrix:- ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //2nd array of transpose[] is created.
        System.out.println("Transpose  matrix:- ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = arr[j][i];
            }
        }

        System.out.println("Transpose of the matrix: ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
