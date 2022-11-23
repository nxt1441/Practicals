import java.util.Scanner;

public class lcs {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter first string: ");
            String s1 = sc.next();
            char [] x = s1.toCharArray();
            System.out.print("enter second string: ");
            String s2 = sc.next();
            char [] y = s2.toCharArray();
            int [][] c = new int[x.length+1][y.length+1];
            for( int i=0;i<=x.length;i++)
            {
                for(int j=0;j<=y.length;j++)
                {
                    if(i==0 || j==0)
                    {
                        c[i][j]=0;
                    }
                    else if( x[i-1]==y[j-1])
                    {
                        c[i][j]=c[i-1][j-1]+1;
                    }
                    else
                    {
                        c[i][j]=Math.max(c[i-1][j],c[i][j-1]);
                    }

                }
            }
            int index=c[x.length][y.length];
            int temp = index;
            char [] ch = new char[index+1];
            ch[index]='\0';
            int i = x.length,j = y.length;
            while(i>0&&j>0)
            {
                if(x[i-1]==y[j-1])
                {
                    ch[index-1]=x[i-1];
                    i--;
                    j--;
                    index--;
                }
                else if(c[i-1][j]>c[i][j-1])
                {
                    i--;
                }
                else
                {
                    j--;
                }
            }

            for( i=0;i<=x.length;i++){
                for( j=0;j<=y.length;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }

            for(int k=0;k<=temp;k++)
            {
                System.out.print(ch[k]+" ");
            }
            System.out.println("");
        }
    }

