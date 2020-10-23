import java.util.*;
import java.io.*;
public class AdjacencyMatrix
{
  public static int v1;
  public static int v2;
  public static Scanner sc;
  public static void main(String[]args)
  {
    try{
      sc=new Scanner(new File("input.txt"));
    int vertex=Integer.parseInt(sc.nextLine());
    System.out.println(vertex);//right
    int matrix[] [] = new int [vertex] [vertex];
//    System.out.println(vertex);
    while(sc.hasNextLine())
    {
      v1=Integer.parseInt(sc.next());
      System.out.print(v1+" ");
      v2=Integer.parseInt(sc.next());
      System.out.print(v2+" ");
      System.out.println();
      sc.nextLine();
     matrix [v1] [v2] =1;
    }
    int i,j;
    for(i=1;i<matrix.length-1;i++)
   {
      for(j=1;j<matrix.length-1;j++);
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
      System.out.println(e);
    }
}
}