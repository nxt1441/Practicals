import java.util.*;
public class making_change
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Amount for Change:");
        int N=sc.nextInt();
        System.out.print("Enter No. coin:");
        int n=sc.nextInt();
        System.out.print("Enter value of Available coin:");
        int d[]=new int[n];
        for(int i=0;i<n;i++)
        {
            d[i]=sc.nextInt();
        }
        int c[][]=new int[n][N+1];

        int i,j;
        for(i=0;i<n;i++)
        {
            c[i][0]=0;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<N+1;j++)
            {
                if(i==0 && j<d[i])
                {
                    c[i][j]=0;
                }
                else if(i==0)
                {
                    c[i][j]=1+c[0][j-d[0]];
                }
                else if(j<d[i])
                {
                    c[i][j]=c[i-1][j];
                }
                else
                {
                    c[i][j]=Math.min(c[i-1][j],1+c[i][j-d[i]]);
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<N+1;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Required coin:" +c[n-1][N]);
    }

}