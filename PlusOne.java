public class PlusOne {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        for(int i=size-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] res = new int[size+1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args){
        PlusOne p = new PlusOne();
        int[] digits = {9,9,8};
        int[] res = p.plusOne(digits);
        for(int num:res)
            System.out.println(num);
    }
}
