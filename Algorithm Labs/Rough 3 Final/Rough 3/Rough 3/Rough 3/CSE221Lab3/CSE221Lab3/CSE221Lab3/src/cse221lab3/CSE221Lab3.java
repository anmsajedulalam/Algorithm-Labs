    /* 12201027
     * A N M Sajedul Alam 
     * Lab BFS 
     * Shortest Path Finder
     */
    package cse221lab3;
    import java.util.Scanner;
    import java.io.File;
    import java.util.LinkedList;
    import java.util.Queue;
    /**
     *
     * @author 12201027
     */
    public class CSE221Lab3 {
        //White==1, Gray==2, Black==3
        public static int color[];
        public static int parent[];
        public static int d[];//level
        public static int v1,v2;
        public static Node[]a;
    public static Scanner sc;
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
          try{

                   sc=new Scanner(new File("file.txt"));
                   int vertex=sc.nextInt();
                   System.out.println(vertex);
                   a=new Node[vertex+1];
                   color=new int[a.length];
                   d=new int[a.length];
                   parent=new int[a.length];
                   for(int i=0;i<=a.length-1;i++)
        {
          a[i]=new Node(i,null);
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
         for(int i=0;i<a.length;i++)
       {
           for(Node n=a[i];n!=null;n=n.next)
           {
               System.out.print(n.value+" ");
           }
           System.out.println();
       }   
//        BFS(a,1);
             BFS(a,1);
             for(int i=1;i<=a.length-1;i++)
             {
             System.out.println("Parent of "+i+": "+parent[i]);
             System.out.println("Distance of "+i+": "+d[i]);
             System.out.println("Path of "+i+": ");
             
             for(Node n=a[parent[i]];n!=null;n=n.next)
             {
                 System.out.print(n.value+" ");
             }
             System.out.println();
             }
             /*int source=1;
             for(int v=5;v<=a.length-1;v++)
             {
                 int p=parent[v];
                 while(p!=source)
                 {
                     System.out.print(p+" ");
                     p=parent[p];
                 }
                 System.out.println();
             }/*
        /*for(int i=1;i<=a.length;i++)
        {
            System.out.println(a[i].value);
        }*/
          }
          catch(Exception e)
                    {
                        e.printStackTrace();
                    }
          }
        public static void BFS(Node [] G,int s){//G=node array, s=source node
        for(int u=1;u<=G.length-1;u++)
        {
             color[u]=1;//1=white
             d[u]=564564477;//d=level infinity
             parent[u]=-1;//null

        }
        color[s]=2;
        d[s]=0;
        parent[s]=0;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int u=q.poll();
//            int v=1;
            for(Node n=G[u];n!=null;n=n.next)//loop using list
//            for(int v=0;v<G.length;v++)
            {
                if(color[n.value]==1)
                {
                    color[n.value]=2;
                    d[n.value]=d[u]+1;
                    parent[n.value]=u;
                    q.add(n.value);
                }
//                v++;
            }
            color[u]=3;
        }
//        return d[s];
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
