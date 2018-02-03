public class MinPathSum {
    public static int minSum(int[][] g){
        if(g==null||g.length==0||g[0].length==0)
            return 0;
        for(int i=g.length-1;i>=0;i--)
            for(int j=g[0].length-1;j>=0;j--){
                if(i==g.length-1&&j!=g[0].length-1)
                    g[i][j]+=g[i][j+1];
                else if(j==g[0].length-1&&i!=g.length-1)
                    g[i][j]+=g[i+1][j];
                else if(i!=g.length-1&&j!=g[0].length-1)
                    g[i][j]+=Math.min(g[i+1][j],g[i][j+1]);
        }
        return g[0][0];
    }
    public static void main(String[] args){
        //int[][] g={{1,3,1},{1,5,1},{4,2,1}};
        int[][] g={{}};
        System.out.println(g[0].length);
        int res = MinPathSum.minSum(g);
        System.out.println(res);
    }
}
