import java.util.Scanner;

public class Krushkal {
    public static void main(String[] args)
    {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter no. of nodes");
        int n = scan.nextInt();
        int g[][] = new int[n][n];
        for(int i=0;i<g.length;i++)
        {
            System.out.println("Enter Weight of nodes adjacent with:"+i);
            for(int j=0;j<g.length;j++)
            {
                g[i][j] = scan.nextInt();
            }
        }
        int mn =0 , max =0 ;
        int u=0, sum=0, v=0, x=0;

        int V[] = {0,1,2,3,4,5,6};
        while(x<n-1)
        {
            int min=100;
            for(int i=0;i<g.length;i++)
            {
                for(int j=0;j<g.length;j++)
                {
                    if(g[i][j] < min)
                    {
                        min = g[i][j];
                        u=i;
                        v=j;
                    }
                }
            }
            if(V[u]!=V[v])
            {
                x++;
                sum = sum + min;
                System.out.println(u+ " " + v +" "+min);
                if(V[u] <V[v])
                {
                    mn=V[u];
                    max = V[v];
                }
                else
                {
                    mn = V[v];
                    max = V[u];
                }
                V[u] = V[v] =mn;
                for(int i=0;i<g.length;i++)
                {
                    if(V[i] == max)
                    {
                        V[i] = mn;
                    }
                }
            }
            g[u][v] = g[v][u] = 100;
        }
        System.out.println(sum);
    }
}
