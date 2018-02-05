import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> empty = new ArrayList<>();
        res.add(empty);

        for(int i=0;i<nums.length;i++ )
        {
            List<List<Integer>> current = new ArrayList<>();
            for(List<Integer> l:res){
                for(int j=0;j<l.size()+1;j++){
                    l.add(j,nums[i]);
                    List<Integer> temp = new ArrayList<>(l);
                    current.add(temp);
                    l.remove(j);
                }
            }
            res = new ArrayList<>(current);
        }
        return res;
    }

    public static void main(String[] args){
        int[] num = {9,0,1,5,2};
        Permutations p = new Permutations();
        List<List<Integer>> res = p.permute(num);
        System.out.println(res.size());
        for(List<Integer> list:res)
            System.out.println(list);

    }
}
