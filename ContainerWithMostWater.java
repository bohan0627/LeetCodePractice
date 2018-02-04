public class ContainerWithMostWater {
    public int mostWater(int[] nums){
        if(nums.length==0)
            return 0;
        int lo = 0;
        int hi = nums.length-1;
        int max = 0;
        while(lo<hi){
            max = Math.max(max,Math.min(nums[lo],nums[hi])*(hi-lo));
            if(nums[lo]<nums[hi])
                lo++;
            else
                hi--;
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater c = new ContainerWithMostWater();
        System.out.println(c.mostWater(nums));

    }
}
