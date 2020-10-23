import java.util.*;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.logging.Logger;



public class BFS
{
  public void BFSMethod ( int [][] AM, int S )
{
  int[] parent=new int[AM.length];
  int[] distance=new int[AM.length];
  String[] colour=new String[AM.length];

  for(int c1=0; c1<AM.length; c1++)
  {
    colour [c1]= "White";
    distance[c1]= Integer.MAX_VALUE; // or you can use 9999999 
    parent [c1]=-1;
   }
  colour [S]="Gray";
  distance[S]= 0;
  parent[S]=-1;
  
  Queue<Integer> q=new LinkedList<Integer>();
  q.add(S);
  while (!(q.isEmpty()))
  {
    int u=q.remove();
    System.out.print(u+" "); // u = row 
    for (int v=0; v<AM.length; v++)
    {
      if(AM[u][v]==1 && colour[v].equals("White"))
      {
        colour[v]="Gray";
        distance[v]= distance[u]+1;
        parent[v]=u;
        q.add(v);
      }
    }
    colour[u]="Black";
  }
  
  
  
  
  
  }
}