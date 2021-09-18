package gameoflife;

public class Evaluate 
{
    int[][][] generation = new int[10][10][100];
    
    public void workOnNeigbour(int[][] paddedMatrix)
    {
        int count = 0;
           int Current = 0 ;
            for (int i = 1; i < 9; i++)
            {
                for (int j = 1; j < 9; j++)
                {
                    count = 0;
                    Current = paddedMatrix[i - 1][ j - 1] + paddedMatrix[i - 1][j + 1] + paddedMatrix[i + 1][j - 1] + paddedMatrix[i + 1][ j + 1] +
                        paddedMatrix[i - 1][ j] + paddedMatrix[i][ j + 1] + paddedMatrix[i ][ j - 1] + paddedMatrix[i + 1][ j]; 
                    //System.out.println(Current);
                    if (paddedMatrix[i][ j] == 0 && Current == 3)
                    {
                        paddedMatrix[i][ j] = 1;
                        System.out.print("| " + paddedMatrix[i][ j] + " Reincarnated");
                        //paddedMatrix[i][ j] = 1;
                        //System.out.print("| " + paddedMatrix[i][ j] + " Dies");
                        //paddedMatrix[i][ j] = 0;
                        //count = 0;  
                    }
                    else if (Current == 2 || Current == 3)
                    {
                        System.out.print("| " + paddedMatrix[i][ j] + " Lives");
                        //paddedMatrix[i, j] = 0;
                        //count = 0;
                    }
                    else if (Current < 2 || Current > 3)
                    {
                        System.out.print("| " + paddedMatrix[i][ j] + " Dies");
                        paddedMatrix[i][ j] = 0;
                        //count = 0;
                    }
                    else { 
                    }
                }
                
                System.out.println("\n");
            }
    }
  /*  using System;
using System.Collections.Generic;
using System.Text;

namespace GameOfLife
{
    public class Evaluate
    {
        int[,,] generation = new int[12,12,1];
       

        public void workOnNeighbour(int[,] paddedMatrix) {
            int count = 0;

            for (int i = 1; i < 11; i++)
            {
                for (int j = 1; j < 11; j++)
                {
                    
                    count = paddedMatrix[i - 1, j - 1] + paddedMatrix[i - 1, j + 1] + paddedMatrix[i + 1, j - 1] + paddedMatrix[i + 1, j + 1] +
                        paddedMatrix[i - 1, j] + paddedMatrix[i, j + 1] + paddedMatrix[i , j - 1] + paddedMatrix[i + 1, j]; 
                    //Console.WriteLine(count);
                    if (count < 2 || count > 3)
                    {
                        Console.Write("| " + paddedMatrix[i, j] + " Dies");
                        paddedMatrix[i, j] = 0;
                        count = 0;
                    }
                    else if (count == 2 || count == 3)
                    {
                        Console.Write("| " + paddedMatrix[i, j] + " Lives");
                        //paddedMatrix[i, j] = 0;
                        count = 0;
                    }
                    else if (paddedMatrix[i, j] == 0 && count == 3)
                    {
                        Console.Write("| " + paddedMatrix[i, j] + " Reincarnated");
                        paddedMatrix[i, j] = 1;
                    }
                    else { 
                    }
                }
                
                Console.WriteLine("\n");
            }
            


        }
    }
}
*/
}
