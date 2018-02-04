import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {

    /*
    public static void sum(int[] nums, int target)
    {
        HashSet<Integer> twoSum = new HashSet<>();
        HashSet<Integer> single = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!single.contains(nums[i]))
                single.add(nums[i]);
        }

        int a = 0;
        int b = 0;
        int c = 0;

        int temp = 0;

        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(!single.contains(nums[i] + nums[j]))
                twoSum.add(nums[i] + nums[j]);
            }
        }

        Iterator<Integer> it = twoSum.iterator();
        while(it.hasNext())
        {
            single.contains(target - it.next())
        }


        for(int i=0;i<nums.length;i++)
        {
            if(table.contains(target-nums[i]))
            {
                a = nums[i];
                b = table.get(target-nums[i]);
                c = (target - a - b);
                System.out.println("The three numbers are: "+a+","+b+","+c);
            }
        }
    }
    */

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
                    List<Integer> res = new ArrayList<>();
                    results.add(nums[i]);
                    results.add(nums[lo]);
                    results.add(nums[hi]);
                    if(!set.contains(results)){
                        set.add(results);
                        res.addAll(results);
                        total.add(res);
                    }
                    lo++;
                    hi--;
                } else if (nums[i] + nums[lo] + nums[hi] < 0)
                    lo++;
                else
                    hi--;
            }
        }
        return total;

        }
    /*
    public static void sum(int[] nums, int target)
    {
        Arrays.sort(nums);
        HashSet<LinkedList<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length-2;i++)
        {
            int lo = i + 1;
            int hi = nums.length - 1;
            while(lo<hi)
            {
                if(nums[i] + nums[lo] + nums[hi] == 0)
                {
                    LinkedList<Integer> results = new LinkedList<>();
                    results.add(nums[i]);
                    results.add(nums[lo]);
                    results.add(nums[hi]);
                    set.add(results);
                    lo++;
                    hi--;
                }
                else if(nums[i]+nums[lo]+nums[hi]<0)
                    lo++;
                else
                    hi--;
            }


        }

        Iterator<LinkedList<Integer>> it = set.iterator();
        for(LinkedList<Integer> list:set)
        {
            System.out.println(list);
        }

    }
    */

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
