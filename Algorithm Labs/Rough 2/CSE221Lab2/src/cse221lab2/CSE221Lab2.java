        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */

        package cse221lab2;
        import java.util.Scanner;
        import java.io.File;
        /**
         *
         * @author 12201027
         */
        public class CSE221Lab2 {

            /**
             * @param args the command line arguments
             */
            public static Scanner sc;
            //public int i;
            public static void main(String[] args) {
                // TODO code application logic here
                try{
               sc=new Scanner(new File("file.txt"));
               int n=Integer.parseInt(sc.nextLine());//total number of nodes
               System.out.println(n);
               int [] A=new int[n+1];//because counting from 1
               //int i=1;//index for A
               int j=1;
                while(sc.hasNextLine())
                {
                    A[j]=Integer.parseInt(sc.next());
                    j++;
                }
                for(int d=1;d<A.length;d++)
                {
                    System.out.print(A[d]+" ");
                }
                System.out.println();
                //maxHeapify(A,1,n);
               // buildMaxHeap(A);
               // maxHeapify(A,1,n);
               heapSort(A);
               for(int d=A.length-1;d>0;d--)
                {
                    System.out.print(A[d]+" ");
                }
               /*for(int f=A.length-1;f>0;f--)
                {
                    System.out.print(A[f]+" ");
                }/*
                
                
                }
               /* int largest;
                int l=2*1;
                int r=2*1+1;
                if(l<=n&&A[l]>A[i])
                {
                  largest=l;
                }
                else
                {
                  largest=i;
                }
                if(r<=n&&A[r]>A[largest])
                {
                    largest=r;
                }
                if(largest!=i)
                {
                   int temp;
                   temp=A[i];
                   A[i]=A[largest];
                   A[largest]=temp;
                }*/
                }
                
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                
                System.out.println();
            }
            public static void maxHeapify(int [] A,int i,int n)//i=largest
            {
                int largest;
                //while(i>n/2){
             /*if(i<n/2)
                {*/
                int l=2*i;
                int r=2*i+1;
                if(l<=n&&A[l]>A[i])
                {
                  largest=l;
                }
                else
                {
                  largest=i;
                }
                if(r<=n&&A[r]>A[largest])
                {
                    largest=r;
                }
                if(largest!=i)
                {
                   int temp;
                   temp=A[i];
                   A[i]=A[largest];
                   A[largest]=temp;
                   maxHeapify(A,largest,n);
                }
               /*if(i>n/2){
                maxHeapify(A,largest,n);
                }*/
                //base case to stop recursion i>n/2
            }
            public static void buildMaxHeap(int [] A)
            {
            int n=A.length-1;
            for(int i=n/2;i>=1;i--)
            {
                maxHeapify(A,i,n);
            }
            }
            public static void heapSort(int [] A)
            {
                buildMaxHeap(A);
                for(int i=A.length-1;i>=2;i--)
                {
                   int temp;
                   temp=A[1];
                   A[1]=A[i];
                   A[i]=temp;
                   maxHeapify(A,1,i-1);
                }
            }
            

        }
