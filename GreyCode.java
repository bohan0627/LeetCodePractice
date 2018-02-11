import java.util.ArrayList;
import java.util.List;

public class GreyCode {
    public List<Integer> grayCode(int n) {
        if(n==0){
            List<Integer> res = new ArrayList<>();
            res.add(0);
            return res;
        }

        List<Integer> res = grayCode(n-1);
        int add = 1<<(n-1);

        for(int i=res.size()-1;i>=0;i--)
            res.add(add+res.get(i));

        return res;
    }

    public static void main(String[] args){
        GreyCode g = new GreyCode();
        System.out.println(g.grayCode(3));
    }
}
