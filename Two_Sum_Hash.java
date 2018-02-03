import java.util.ArrayList;
import java.util.Hashtable;

public class Two_Sum_Hash {
    public static int[] two_sum(int[] nums, int target){
        int[] res = new int[2];
        if(nums == null || nums.length == 0)
            return res;
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i=0;i<nums.length;i++)
            table.put(nums[i],i);
        int i=0;
        while(i<nums.length){
            if(table.containsKey(target-nums[i]) && (table.get(target-nums[i])!=i)){
                res[0] = i;
                res[1] = table.get(target-nums[i]);
                break;
            }
            i++;
        }
        return res;
    }
    /*
    public static int[] two_sum(int[] nums, int target)
    {
        int[] res = new int[2];
        if(nums == null || nums.length == 0)
            return res;


        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i=0;i<nums.length;i++)
            table.put(i,nums[i]);

        int i = 0;
        int j;

        while(i<nums.length-1){
            j=i+1;
            while(j<nums.length){
                if(table.get(j)==(target-nums[i])){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
                else
                    j++;
            }
            i++;
        }
        return res;
    }
    */


    public static void main(String[] args)
    {
        //int[] nums = {11,7,2,15};
        int[] nums = {4,4,9,1,6,56,1,1};
        //int[] nums = {3,2,4,1};
        int[] sum = Two_Sum_Hash.two_sum(nums,8);
        System.out.println(sum[1]);
    }
}
