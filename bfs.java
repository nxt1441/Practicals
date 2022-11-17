public class bfs {
    static int i,j;
    static int g[][] = new int[][]{{0, 1, 1, 1, 0, 0, 0, 0, 0}, //1
            {0, 0, 0, 1, 0, 0, 0, 0, 0},   //2
            {0, 0, 0, 1, 0, 0, 0, 0, 0}, //3
            {0, 0, 0, 0, 1, 1, 0, 0, 0}, //4
            {0, 0, 0, 0, 1, 0, 1, 0, 0},//5
            {0, 0, 0, 0, 0, 0, 0, 0, 0},//6
            {0, 0, 0, 0, 1, 0, 0, 0, 0}, //7
            {0, 0, 0, 0, 1, 0, 0, 1, 0}, //8
            {0, 0, 0, 0, 0, 0, 0, 0, 0}}; //9
    static int v[] = new int[]{0,0,0,0,0,0,0,0,0};
    static int nv[] = new int[]{1,2,3,4,5,6,7,8,9};
    public static void main(String[] args)
    {
        for(i=0;i<g.length;i++)
        {
            if(v[i] != nv[i])
            {
                bfs(i);
            }
        }
    }
    static void bfs(int i)
    {
        v[i] = nv[i];
        System.out.println(v[i]);
        for(j=0;j<g.length;j++)
        {
            if(g[j][i] == 1)
            {
                if(v[j] == 0)
                {
                    bfs(j);
                }
            }
        }
    }
}
