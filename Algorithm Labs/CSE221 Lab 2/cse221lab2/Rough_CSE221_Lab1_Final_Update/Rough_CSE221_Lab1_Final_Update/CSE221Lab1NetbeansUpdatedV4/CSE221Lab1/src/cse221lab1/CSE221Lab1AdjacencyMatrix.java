    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package cse221lab1;
    import java.util.Scanner;
    import java.io.File;
    /**
     *
     * @author BRACU\12201027
     */
    public class CSE221Lab1AdjacencyMatrix {

        /**
         * @param args the command line arguments
         */
      public static int v1;
      public static int v2;
      public static Scanner sc;
      public static void main(String[] args) {
            // TODO code application logic here
     
      int matrix[][] = null;
        try{
          sc=new Scanner(new File("input.txt"));
        int vertex=Integer.parseInt(sc.nextLine());
        System.out.println(vertex);//right
        matrix= new int [vertex+1] [vertex+1];
    //    System.out.println(vertex);
        int i,j;
         for(i=0;i<=matrix.length-1;i++)
       {
          for(j=0;j<=matrix.length-1;j++)
         {
           System.out.print(matrix[i][j] +" ");
          }
          System.out.println();
        }
         
        while(sc.hasNextLine())
        {
            //sc.nextLine();
          v1=Integer.parseInt(sc.next());
          System.out.print(v1+" ");
          v2=Integer.parseInt(sc.next());
          System.out.print(v2+" ");
          System.out.println();
//          sc.nextLine();
         matrix[v1][v2] =1;
        }
       
        for(i=0;i<=matrix.length-1;i++)
       {
          for(j=0;j<=matrix.length-1;j++)
         {
           System.out.print(matrix[i][j] +" ");
          }
          System.out.println();
        }
    //      System.out.print(matrix[i][j]);
    //      if(j==matrix.length-1)
    //      {
    //        System.out.println();
    //        

      }
        catch(Exception e)
        {
          e.printStackTrace();
        }
        
       }

    }
    
