

import java.util.HashMap;

public class FirstMissingPositive {


    /*
    public static int firstMissingPositive(int[] A) {
        // in-place swap (bucket sort)
        int i = 0;
        while (i < A.length) {
            if (A[i] > 0 && A[i] <= A.length && A[i] != i+1 && A[i] != A[A[i]-1]) {
                int temp = A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = temp;
            } else {
                ++i;
            }
        }
        // find the first positive missing integer
        i = 0;
        while (i < A.length && A[i] == i+1) ++i;
        return i+1;
    }
    */



    public static int find(int nums[])
    {
        if(nums == null || nums.length == 0)
            return 1;
        int temp;
        for(int i=0;i<nums.length;i++){
            while (nums[i]<(i+1) && nums[i]>0)
                if(nums[i]<nums.length){
                    temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
                if(i<nums.length-1 && nums[i] == nums[i+1] )
                    break;
        }

        int j=0;
        while (j < nums.length && nums[j] == j+1)
            ++j;

        int result = ++j;
        System.out.println("The first missing positive number is: "+result);
        return result;
    }

    public static int findOne(int[] nums){
        if(nums == null || nums.length == 0)
            return 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,1);
        }
        int temp = 0;
        for(int key: map.keySet()){
            //System.out.println(key);
            if(key>0 && key!=(temp+1))
            {
                temp = temp+1;
                break;
            }
            if(key>0)
                temp++;

        }
        return temp;
    }

    public static int firstMissingPositive(int[] nums) {

        if(nums==null||nums.length==0)
            return 1;
        int temp;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=(i+1)){
                if(nums[i]<=0||nums[i]>nums.length)
                    break;
                else if(nums[i]==nums[nums[i]-1])
                    break;
                else{
                    temp=nums[nums[i]-1];
                    nums[nums[i]-1]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=i+1)
                return i+1;
        return nums.length+1;
    }



    public static void main(String[] args)
    {
        //int[] nums = {2,4,-1,1};
        //int[] nums = {0,2,2,1,1};
        //int[] nums = {-1,4,2,1,9};
        //int[] nums = {-1,9,8,7,6};
        //int[] nums = {-1,9,8,1};
        //int[] nums = {-1,4,2,1,9,10};
        //int[] nums = {1,9};
        //int[] nums = {};
        int[] nums = {1,1,1,5,1,3};
        //int[] nums = {5,5,5,5};
        //int res = FirstMissingPositive.findOne(nums);
        //System.out.println(res);
        //int missing = FirstMissingPositive.firstMissingPositive(nums);
        //System.out.println(missing);
        //int res = FirstMissingPositive.find(nums);
        int res = FirstMissingPositive.firstMissingPositive(nums);
        System.out.println(res);
    }
}

 /*
        int i =0;
        while(i<nums.length)
        {
            if(nums[i]>0 && nums[i]<nums.length)
            {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;

            }

            if( nums[i]<(i+1) && nums[i]>0)
                i&=1;
            else
                i++;
            //System.out.println(i);
        }
        */
