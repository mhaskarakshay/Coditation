
package gameoflife;

public class Grid 
{
    public void dispGrid(int[][] arr)
    {
         for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    System.out.print(arr[i][j]+"|");
                }
                System.out.println();
            }
    }
    
    public int[][] padMatrix(int[][] arrP)
    {
        int[][] paddedMatrix = new int[10][10] ;
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    paddedMatrix[i][j] = 0;
                }
               
            }
            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    paddedMatrix[i+1] [j+1] = arrP[i][j];
                }
                System.out.println();
            }
            return paddedMatrix;
    }
           
           /*  
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    System.out.print(paddedMatrix[i][j]+"|");
                }
               System.out.println();
            }
             
    }
   using System;
using System.Collections.Generic;
using System.Text;

namespace GameOfLife
{
    public class Grid //Create and display grid
    {
       
        public void displayGrid(int[,] arr) {
            
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    Console.Write("|  " +arr[i,j]+ "  |");
                }
                Console.WriteLine("\n");
            }
            
        }

        public int[,] padMatrix(int[,] arrP) {

            int[,] paddedMatrix = new int[12, 12] ;
            for (int i = 0; i < 12; i++)
            {
                for (int j = 0; j < 12; j++)
                {
                    paddedMatrix[i, j] = 0;
                }
               
            }
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    paddedMatrix[i+1, j+1] = arrP[i, j];
                }
                Console.WriteLine("\n");
            }
            //for (int i = 0; i < 12; i++)
            //{
            //    for (int j = 0; j < 12; j++)
            //    {
            //        Console.Write("|  " + paddedMatrix[i, j] + "  |");
            //    }
            //    Console.WriteLine("\n");
            //}
            return paddedMatrix;
        }
    }
    
}
    */

    
}
