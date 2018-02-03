public class CountingBits {
    /*
    public static int[] countBitOne(int num)
    {

        int[] result = new int [num+1];

        int oneCount = 0;
        int temp =0;
        for(int i=0;i<=num;i++)
        {
            temp = i;
            while(temp > 0)
            {
                temp &= temp-1;
                oneCount++;
            }
            result[i] = oneCount;
            oneCount = 0;

        }

        return result;

    }
    */

    public static int[] countFormula(int num)
    {

        int[] result = new int[num+1];
        for(int i=0;i<=num;i++)
        {
            result[i] = result[i/2] + (i%2);
        }

        return result;
    }

    public static void main(String[] args)
    {
        int num = -1;
        //CountingBits.countBitOne(num);
        int[] result = CountingBits.countFormula(num);
        for(int n:result){
            System.out.println(n);
        }
    }
}
