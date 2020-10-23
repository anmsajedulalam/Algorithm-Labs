import java.io.*;
public class AdjacencyMatrix {
     int [][] myarray = null ;
    BufferedReader BFR;
    PrintWriter WRT;
    
      public int[][] ReadFile()
    {
        try 
        {
            BFR = new BufferedReader(new FileReader("input.txt"));
              try {
                 String s = BFR.readLine();
                myarray = new int [Integer.parseInt(s)][Integer.parseInt(s)];
                int X ;
                int Y ;
           
                while((s = BFR.readLine())!= null){
                String [] temp = s.split(" ");
                X= Integer.parseInt(temp[0]);
                Y = Integer.parseInt(temp[1]);
                myarray[X][Y] = 1; 
                myarray[Y][X] = 1;
             }
             BFR.close();
             }
              catch (Exception e)
              {
                 System.out.println("Error, Line not found "+e.toString());
            }
            }
        catch (FileNotFoundException e)
        {
            System.out.println("Error, file not found "+e.toString());
        }
        finally
        {
         return myarray;
        }
    }
    
    
//    public void WriteFile()
//    {
//        try 
//        {
//            WRT = new PrintWriter(new File("Output.txt"));
//            
//            WRT.print("  ");
//            for (int c=0; c<myarray.length; c++)
//            {
//                WRT.print(c+" ");
//            }
//            WRT.println();
//            
//            for(int i=0; i <myarray.length; i++)
//            {
//               WRT.print(i + " ");
//        
//               for(int j = 0;  j <myarray.length; j++)
//               {
//               
//                   WRT.print(myarray[i][j] + " ");
//                 
//               }
//                  WRT.println(" ");
//           }
//            
//           WRT.close();
//        }
//        catch(Exception e) 
//        {
//          System.out.println("Error while file writing: "+ e.toString());
//        }
//    }
//    
    public void print ()
    {
      System.out.print("  ");  
      for (int C1=0; C1<myarray.length; C1++)
          {
              System.out.print(C1+" ");
          }
          System.out.println(" ");
          for(int C2=0; C2 <myarray.length; C2++)
          {
            System.out.print(C2 + " ");
        
           for(int C3 = 0;  C3 <myarray.length; C3++)
          {
            
                System.out.print(myarray[C2][C3] + " ");
           
           }
            System.out.println(" ");
           }
    }
}