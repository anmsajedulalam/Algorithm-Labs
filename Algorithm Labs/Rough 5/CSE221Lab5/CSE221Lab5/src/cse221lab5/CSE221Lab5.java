/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221lab5;
import java.util.Scanner;
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author 12201027
 */
public class CSE221Lab5 {
public static int prev[];//parent, previous 
public static int dist[];
public static Node[]a;//main node array
public static int v1,v2;
public static int vertex;
public static Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{

                   sc=new Scanner(new File("file.txt"));
                   vertex=sc.nextInt();
                   System.out.println(vertex);
                   a=new Node[vertex+1];
                   dist=new int[a.length];
                   prev=new int[a.length];//parent=new int[a.length];
                   for(int i=0;i<=a.length-1;i++)
        {
          a[i]=new Node(i,null,0,0);
        }
                    while(sc.hasNextLine())
        {
          v1=Integer.parseInt(sc.next());
//          System.out.print(v1+" ");
          v2=Integer.parseInt(sc.next());
//          System.out.print(v2);
//          System.out.println();
        add(v2);//
        
      }
         for(int i=1;i<a.length;i++)
       {
           for(Node n=a[i];n!=null;n=n.next)
           {
               System.out.print(n.value+" ");
           }
           System.out.println();
       }
         Dijkstra(a,1);
        
       int x=vertex;
//         
      while(x!=1)    
      {
//System.out.print(prev[x]+" ");
            if(x==-1)
            {
                break;
            }
            System.out.print(x+" ");
            x=prev[x];
       }
         
        }
        catch(Exception e)
                    {
                        e.printStackTrace();
                    }
    }
    public static void Dijkstra(Node [] G,int s)
    {
        for(int v=1;v<G.length;v++)// Initialization 
        {
            //create vertex set Q 
            Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i<G.length; i++)
        {
            queue.add(i);
        }
            dist[v]=5000;//Infinity, Large distance from source to v 
            prev[v]=0;//Undefined, Previous node in optimal path from source
            //add v to Q 		// All nodes initially in Q (unvisited nodes)
            queue.add(v);
            dist[s]=0;// Distance from source to source 
            while (!queue.isEmpty()) {
                //u ← vertex in Q with min dist[u] 
                int u=s;
                //remove u from Q
                queue.poll();
                for(Node n=a[u];n!=null;n=n.next)
                {
                    dist[u]=a[u].distance;
                    dist[v]=a[v].distance;
                    prev[v]=a[v].parent;
                    int alt=dist[u]+length(u,v);
                    if(alt<dist[v])
                    {
                        dist[v] =alt; 
			prev[v] = u; 
                    }
                }
            }
            }
    }
    public static int length(int u,int v)
    {
       int len=dist[v]-dist[u];
       return len;
    }
    public static void add(int v)
      {
        Node n1=new Node(v,null,0,0);
        Node tail=a[v1];
        for(Node n=tail;n!=null;n=n.next)
        {
          tail=n;
        }
        tail.next=n1;
      }
    }
        /*
        int array[]=new int[2];
        array[0]=dist;
        array[1]=prev;
        return array;
        /*
//        int[] array1 = new int[dist.legnth] ;
//        int[] array2 = obj[1];
//        retun new Object[]{array1,array2};
       // return new int[]{dist, prev};

    }
    public static void add(int v)
      {
        Node n1=new Node(v,null);
        Node tail=a[v1];
        for(Node n=tail;n!=null;n=n.next)
        {
          tail=n;
        }
        tail.next=n1;
      }
/*
    function Dijkstra(Graph, source)

create vertex set Q 
for each vertex v in Graph       	// Initialization 
	dist[v]← INFINITY (5000)	// Large distance from source to v 
	prev[v] ← UNDEFINED (0)	// Previous node in optimal path from source 
	add v to Q 		// All nodes initially in Q (unvisited nodes) 
	dist[source] ← 0 		// Distance from source to source 

while Q is not empty: 
	u ← vertex in Q with min dist[u] 	// Source node will be selected first 
	remove u from Q 
	for each neighbor v of u: 		// where v is still in Q. 
		alt ← dist[u] + length(u, v) 
		if alt < dist[v]: 		// A shorter path to v has been found 
			dist[v] ← alt 
			prev[v] ← u 
return dist[], prev[]

    */