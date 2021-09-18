
package gameoflife;

import java.util.Random;

public class GameOfLife 
{

    public static void main(String[] args) 
    {
        int[][] arr = new int[8][8];
        
        Random rd=new Random();
        for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    arr[i][j] = rd.nextInt(2);
                }
            }
        
        Grid g1=new Grid();
        g1.dispGrid(arr);
        
        int[][] paddedMat = g1.padMatrix(arr);
        
        Evaluate e1 = new Evaluate();
        e1.workOnNeigbour(paddedMat);
        
        /*  
        for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    System.out.print(arr[i][j]+"|");
                }
                System.out.println();
            }
          Console.WriteLine("Hello !!!! Welcome to game of life");
            int[,] arr = new int[10,10];
            Random randomArray = new Random();
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    arr[i,j] = randomArray.Next(0, 2);
                }
                
            }

            Grid g1 = new Grid();
            g1.displayGrid(arr);
            int[,] paddedMat = g1.padMatrix(arr);

            Evaluate evaluate = new Evaluate();
            evaluate.workOnNeighbour(paddedMat);

*/
        
    }
    
}
