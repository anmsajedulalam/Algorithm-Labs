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
            public static void main(String[] args) {
                // TODO code application logic here
                try{
               sc=new Scanner(new File("file.txt"));
               int n=Integer.parseInt(sc.nextLine());
               System.out.println(n);
               int [] A=new int[n+1];
               int i=1;//index for A
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
            }
            public void maxHeapify(int [] A,int largest,int n)
            {
                 int largest;
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
                }
                if(i<n/2)
                {
                maxHeapify(int [] A,int largest,int n);
                }
                //base case to stop recursion i>n/2
            }
            public void heapSort(int [] A)
            {
                buildMaxHeap(A);
                for(int e=A.length;e>=2;e--)
                {
                   int temp;
                   temp=A[l];
                   A[l]=A[i];
                   A[i]=temp;
                   maxHeapify(A,l,i-1);
                }
            }
            public void buildMaxHeap(int [] A)
            {
                maxHeapify(int [] A,int largest,int n);
            }
            }

        }
