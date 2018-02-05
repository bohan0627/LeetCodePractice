import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<>();

        //start from an empty list
        List<Integer> empty = new ArrayList<>();
        result.add(empty);

        for (int i = 0; i < num.length; i++) {
            //list of list in current iteration of the array num
            List<List<Integer>> current = new ArrayList<>();

            for (List<Integer> l : result) {
                // # of locations to insert is largest index + 1
                for (int j = 0; j < l.size()+1; j++) {
                    // + add num[i] to different locations
                    l.add(j, num[i]);

                    List<Integer> temp = new ArrayList<>(l);
                    current.add(temp);

                    //System.out.println(temp);

                    // - remove num[i] add
                    l.remove(j);
                }
            }

            result = new ArrayList<>(current);
        }

        return result;
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
