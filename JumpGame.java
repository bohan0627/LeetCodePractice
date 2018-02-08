public class JumpGame {
    /*
    public boolean canJump(int[] nums) {
        if(nums.length==0)
            return false;
        int jump = nums[0];
        if(nums.length==1&&jump>0)
            return true;
        for(int i=0;i<nums.length;i++){
            if(i<=jump&&(i+nums[i])>jump)
                jump = nums[i]+i;
            if(jump>=nums.length-1)
                return true;
        }
        return false;
    }
    */

    public boolean canJump(int[] nums) {
        if(nums.length==0)
            return false;
        int jump = 0;
        for(int i=0;i<nums.length;i++){
            if(i<=jump&&(i+nums[i])>jump)
                jump = nums[i]+i;
            if(jump>=nums.length-1)
                return true;
        }
        return false;
    }



    public static void main(String[] args){
        JumpGame j = new JumpGame();
        int[] nums = {0};
        System.out.println(j.canJump(nums));
    }
}

