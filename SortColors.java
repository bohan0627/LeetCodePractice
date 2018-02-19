

public class SortColors {
    public void sortColors(int[] nums) {
        int right = nums.length-1;
        int left = 0;
        int i = 0;
        while(i<=right)
        if(nums[i] == 0){
            swap(nums, i, left);
            left++;
            i++;
        } else if(nums[i] == 2){
            swap(nums, i, right);
            right--;
        } else {
            i++;
        }
    }

    private void swap(int[] nums, int i1, int i2){
        int tmp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = tmp;
    }
    public static void main(String[] args){
        //int[] nums = {1,2,0,0,2,1,2,2};
        int[] nums = {1,0};
        SortColors s = new SortColors();
        s.sortColors(nums);
        for(int a:nums)
            System.out.println(a);
    }
}
