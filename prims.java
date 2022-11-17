import java.util.Scanner;

public class prims {
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of nodes:");
        n =  scan .nextInt();
        int g[][] = new int[n][n];
        int v[] =  new int[n];
        for(int i=0;i<g.length;i++)
        {
            for(int j=0; j<g.length;j++)
            {
                if(i==j)
                {
                    System.out.println("Edge"+(i+1)+" - "+(j+1)+ " cost =9");
                    g[i][j] = 9;
                }
                else {
                    System.out.print("Edge" + (i+1) + " - " + (j+1) + " cost =");
                    g[i][j] = scan.nextInt();
                }
            }
        }
        System.out.println(" ");
        int s=0;
        v[s] = 1;
        int sum =0 ,u=0,v1=0;
        while(s < n-1)
        {
            int min = 9;
            for(int i=0;i<g.length;i++)
            {
                for(int j=0;j<g.length;j++)
                {
                    if(v[i] == 1)
                    {
                        if(g[i][j] < min)
                        {
                            min = g[i][j];
                            u=i;
                            v1=j;
                        }
                    }
                }
            }

            if((v[u]==0 && v[v1]==1)||(v[u]==1 && v[v1]==0))
            {
                sum += g[u][v1];
                System.out.println("Edge:"+ (u+1) +" - "+(v1+1)+" cost = "+g[u][v1]);
                v[u] = v[v1] =1;
                s++;
            }
            g[u][v1] = g[v1][u] = 9;
        }
        System.out.println("Total cost= "+sum);
    }
}
