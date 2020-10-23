import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class shortestPath {
    int [][]m;
    int k;
    int l;
    Boolean[] array1;
    int array2[];
    void ReadFile() throws FileNotFoundException{
    File f=new File("C:\\Users\\rahat boss\\Desktop\\lab3.txt");
    Scanner a=new Scanner(f);
    k=a.nextInt();
    l=a.nextInt();
    array1=new Boolean[k];
    array2=new int[k];
    m=new int[k][l];
        while(a.hasNext()){
            int c=a.nextInt(); 
            int r=a.nextInt();
            m[c][r]=1;
            m[r][c]=1;
        }
    }
    public int Bfs(int s,int d){
        for(int i=0;i<k;i++){
            array1[i]=false;
            array2[i]=0;
        }
        array1[s]=true;
        array2[s]=0;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        while(!q.isEmpty()){
            int u=q.remove();
            for(int z=0;z<k;z++){
                if(m[u][z]==1 && array1[z]==false){
                    array1[z]=true;
                    array2[z]=array2[u]+1;
                    q.add(z);
                }
            }
        }
        return array2[d];
    }  
}
