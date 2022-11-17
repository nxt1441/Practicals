import java.util.Scanner;

public class bfs1 {
    static int n;

    static int v[] = new int[10];
    static int g[][] = new int[10][10];


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no fo nodes");
        n = scan.nextInt();
        int v[] = new int[n];
        int g[][] = new int[n][n];
        System.out.println("Enter 1 if nodes are adjacent "+"otherwise 0");
        System.out.println("Enter Graph");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                g[i][j] = scan.nextInt();
            }
        }
        bfssearch();
    }

    public static void bfssearch() {
        for(int i=0;i<n;i++)
        {
            v[i] = 0;
        }
        for(int i=0;i< n;i++)
        {
            if(v[i] == 0)
            {
                bfs(i);
            }
        }
    }
    public static void bfs(int i)
    {
        v[i] = 1;
        System.out.println("Visited Node:"+(i+1));
        for(int j=0;j<n;j++)
        {
            if(g[i][j]==1 & v[j]==0)
            {
                bfs(j);
            }
        }

    }
}
