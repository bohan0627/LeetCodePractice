public class TrappingRainWater {
    public static int waterVolume(int[] nums){
        if(nums==null||nums.length==0)
            return 0;
        int lo=0;
        int hi=nums.length-1;
        int lM=nums[lo];
        int hM=nums[hi];
        int v=0;
        while(lo<hi){
            if(lM>hM){
                hi--;
                if(nums[hi]<hM)
                    v+=hM-nums[hi];
                else
                    hM=nums[hi];
            }
            else{
                lo++;
                if(nums[lo]<lM)
                    v+=lM-nums[lo];
                else
                    lM=nums[lo];
            }
        }
        return v;
    }
    /*
    public static int waterVolume(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return 0;
        int volume = 0;
        int lo = 0;
        int hi = nums.length-1;
        int loMax = nums[lo];
        int hiMax = nums[hi];

        while(lo < hi)
        {
            if(loMax>=hiMax)
            {
                hi--;
                if(nums[hi] <hiMax)
                    volume += hiMax - nums[hi];
                else
                    hiMax = nums[hi];
            }
            else
            {
                lo++;
                if (nums[lo] < loMax)
                    volume += loMax - nums[lo];
                else
                    loMax = nums[lo];
            }


        }

        return volume;

    }
    */

    /*
    public static int waterVolume(int[] nums) {

        int total = 0;
        int j = 0;

        for (int i = 1; i < nums.length-1; i++)
        {
            if (nums[i] < nums[i - 1])
            {
                j = i;
                while (j < nums.length-1 && nums[i] >= nums[j + 1])
                {
                    if(nums[j] < nums[j+1])
                    {
                        total += Math.min(nums[j - 1], nums[j + 1]) - nums[j];
                        nums[j] = Math.min(nums[j - 1], nums[j + 1]);
                    }
                    j++;
                }
                if (j == nums.length - 1)
                    break;
                else
                {
                    int height = Math.min(nums[i - 1], nums[j + 1]);
                    while (i <= j)
                    {
                        total += height - nums[i];
                        i++;
                    }
                }
            }
        }
        return total;
    }
    */

    public static void main(String[] args)
    {
        //int[] nums = {0,1,0,2,1,0,0,3,2,1,2,1};
        //int[] nums = {0,1,5,3,0,0,0,1,0,1,2,1,1,2};
        int[] nums = {0,4,5,2,1,6,7,1,0,1,0,0};
        //int[] nums = {};
        int water = TrappingRainWater.waterVolume(nums);
        System.out.println(water);
    }
}



/*
        for (int i = 1; i < nums.length - 1; i++)
        {
            if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1])
            {
                total += Math.min(nums[i - 1], nums[i + 1]) - nums[i];
                nums[i] = Math.min(nums[i - 1], nums[i + 1]);
            }
        }

        int j = 0;
        for (int i = 1; i < nums.length - 1;i++)
        {
            if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1])
            {
                total += Math.min(nums[i - 1], nums[i + 1]) - nums[i];
                nums[i] = Math.min(nums[i - 1], nums[i + 1]);
            }

             if (nums[i] < nums[i - 1] && nums[i] == nums[i + 1])
            {
                j = i;
                while (nums[j] == nums[j+1] && j<nums.length-1)
                {
                    j++;
                    same += 1;
                }
                if(nums[j]<nums[j+1])
                {
                    total += (same+1) * (Math.min(nums[i-1],nums[j+1])-nums[j]);
                }
                else same = 0;
                i = j;
            }
        }
        */
