public class JumpGameII {

    public static int jump(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int lastReach = 0;
        int reach = 0;
        int step = 0;

        for (int i = 0; i <= reach && i < nums.length; i++) {
            //when last jump can not read current i, increase the step by 1
            if (i > lastReach) {
                step++;
                lastReach = reach;
            }
            //update the maximal jump
            reach = Math.max(reach, nums[i] + i);
        }

        if (reach < nums.length - 1)
            return 0;

        return step;
    }

    public static void main(String[] args)
    {
        //int[] nums = {2,3,1,1,4};
        int[] nums = {2,3,1,2,1,3,2,3,1,1};
        int minJump = JumpGameII.jump(nums);
        System.out.println("The minimum jumps are: "+minJump);
    }
}
