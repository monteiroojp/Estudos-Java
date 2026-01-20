package basics;
import java.util.Scanner;

public class MatrixExercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for(int i=0; i< matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++)
                matrix[i][j] = sc.nextInt();

        int targetNumber = sc.nextInt();

        for(int i=0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == targetNumber){
                    System.out.printf("Position %d,%d:%n", i, j);
                    if(j>0)
                        System.out.printf("Left: %d%n", matrix[i][j-1]);
                    if(i>0)
                        System.out.printf("Up: %d%n", matrix[i-1][j]);
                    if(j<m-1)
                        System.out.printf("Right: %d%n", matrix[i][j+1]);
                    if(i<n-1)
                        System.out.printf("Down: %d%n", matrix[i+1][j]);
                }
            }
        }
    }
}
