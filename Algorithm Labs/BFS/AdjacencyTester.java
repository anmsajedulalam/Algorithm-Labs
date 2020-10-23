public class AdjacencyTester
{
  public static void main(String[] args) 
    {
        System.out.println( "!!_-_-_-_-_TASK-01_-_-_-_-_!! " );
        AdjacencyMatrix AM = new AdjacencyMatrix();
        AM.ReadFile();
        //AM.WriteFile();
        //AM.print();
        
        BFS b= new BFS();
        b.BFSMethod (AM.ReadFile(), 1 );
      }
}
