import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix==null||matrix.length==0)
            return res;

        int h1 = 0;
        int h2 = matrix[0].length;
        int h3 = matrix.length;
        int h4 = 0;
        int totalSize = h2 * h3;
        int i;
        int j;

        while(res.size()<totalSize){
            i = h1;
            j = h4;

            while(j<h2){
                res.add(matrix[i][j]);
                j++;
            }
            j--;
            i++;
            if(res.size()==totalSize)
                break;

            while(i<h3){
                res.add(matrix[i][j]);
                i++;
            }
            i--;
            j--;
            if(res.size()==totalSize)
                break;

            while(j>=h4){
                res.add(matrix[i][j]);
                j--;
            }
            j++;
            i--;

            while(i>h1){
                res.add(matrix[i][j]);
                i--;
            }

            h1++;
            h2--;
            h3--;
            h4++;
        }
        return res;
    }

    public static void main(String[] args){
        //int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //int[][] matrix = {{}};
        //int[][] matrix = {{2,3}};
        int[][] matrix = {{7},{9},{6}};
        SpiralMatrix s = new SpiralMatrix();
        List<Integer> res = s.spiralOrder(matrix);
        System.out.println(res);
    }
}
