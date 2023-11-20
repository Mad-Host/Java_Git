import java.util.*;

public class Arrays2D {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int cols = input.nextInt();

        //table 
        int[][] table = new int[rows][cols];

        //rows
        for(int i=0; i<rows; i++)
        {
            //column
            for(int j=0; j<cols; j++)
            {
                table[i][j] = input.nextInt();
            }

        }

        System.out.println("TABLE");
    
        //print the 2D_arry

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }
}
