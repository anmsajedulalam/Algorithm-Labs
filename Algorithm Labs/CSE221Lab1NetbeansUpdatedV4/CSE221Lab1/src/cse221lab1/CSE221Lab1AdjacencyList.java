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

    public class CSE221Lab1AdjacencyList {
      public static int v1,v2;
      public static Node[]a;
      public static Scanner sc;
      public static void main(String[]args)
      {
        try{
          sc=new Scanner(new File("input.txt"));
        int vertex=sc.nextInt();
        System.out.println(vertex);
        a=new Node[vertex+1];//a=Node[]a
    //  int v1,v2;
        for(int i=0;i<=a.length-1;i++)
        {
          a[i]=new Node(i,null);
        }
        for(int j=0;j<=a.length-1;j++)
        {
            System.out.println(a[j].value);
        }
        
        while(sc.hasNextLine())
        {
          v1=Integer.parseInt(sc.next());
//          System.out.print(v1+" ");
          v2=Integer.parseInt(sc.next());
//          System.out.print(v2);
//          System.out.println();
        add(v2);//
        for(Node i=a[v1];i!=null;i=i.next)
        {
          System.out.print(i.value+" ");
        }
        System.out.println();
      }
        /*for(int i=0,Node j=a[i];j!=null;j=j.next,i++)
        {
          System.out.print(j.value+" ");
        }
        System.out.println();*/
     }

        catch(Exception e)
        {
          e.printStackTrace();
        }
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

     }
    
