public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
         int[][] res = new int[n][n];
         int left = 0;
         int right = n-1;
         int top = 0;
         int bottom = n-1;
         int k = 1;
         while(left<right && top<bottom){
             for(int i=left;i<right;i++)
                 res[top][i] = k++;
             for(int j=top;j<bottom;j++)
                 res[j][right] = k++;
             for(int i=right;i>left;i--)
                 res[bottom][i] = k++;
             for(int j=bottom;j>top;j--)
                 res[j][left] = k++;

             left++;
             right--;
             top++;
             bottom--;
         }

         if(n%2!=0)
             res[n/2][n/2] = k;

         return res;
        }


    public static void main(String[] args){
        int n = 2;
        SpiralMatrixII s = new SpiralMatrixII();
                int[][] res = s.generateMatrix(n);
                System.out.println(res[1][0]);

                }
                }
