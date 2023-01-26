import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  row = sc.nextInt();
        int col = sc .nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(String.format("Enter Matrix[%d][%d] element : ",i,j));
                matrix[i][j] = sc.nextInt();

            }
        }
        int[] newArr = new int[row*col];
        int k =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newArr[k++] = matrix[i][j];
            }
        }
        k=0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                  matrix[i][j] = newArr[k++];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
     }
}
