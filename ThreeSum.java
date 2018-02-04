import java.util.*;

public class ThreeSum {



    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> total = new ArrayList<>();
        if(nums==null||nums.length==0)
            return total;
        Arrays.sort(nums);
        HashSet<LinkedList<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-2;i++) {
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi) {
                if (nums[i] + nums[lo] + nums[hi] == 0) {
                    LinkedList<Integer> results = new LinkedList<>();
                    //List<Integer> res = new ArrayList<>();
                    results.add(nums[i]);
                    results.add(nums[lo]);
                    results.add(nums[hi]);
                    set.add(results);
                    lo++;
                    hi--;
                } else if (nums[i] + nums[lo] + nums[hi] < 0)
                    lo++;
                else
                    hi--;
            }
        }
        total.addAll(set);
        return total;

        }

    public static void main(String[] args)
    {
        int[] nums = {-1,0,1,2,-1,-4};
        int target = 0;
        //ThreeSum.sum(nums,target);
        ThreeSum t = new ThreeSum();
        List<List<Integer>> res = t.threeSum(nums);
        for(List<Integer> it:res){
            System.out.println(it);
        }

    }
}
