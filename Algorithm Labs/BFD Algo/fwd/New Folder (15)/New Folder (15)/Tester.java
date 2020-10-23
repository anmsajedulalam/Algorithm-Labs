import java.io.FileNotFoundException;

public class Tester {
    public static void main(String[] args) throws FileNotFoundException{
        shortestPath s = new shortestPath();
        s.ReadFile();
       int x= s.Bfs(2,3);
        System.out.println(x);
    }
}
