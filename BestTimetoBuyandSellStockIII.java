public class MaxStockProfitIII {


    public static int maxStockProfit(int[] prices){
        if(prices==null || prices.length==0)
            return 0;
        int localMax = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        int totalProfit = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<min)
                min = prices[i];
            else
                localMax = Math.max(localMax,prices[i]-min);
            left[i] = localMax;
        }
        localMax = 0;
        for(int i=prices.length-1;i>=0;i--){
            if(prices[i]>max)
                max = prices[i];
            else
                localMax = Math.max(localMax,max-prices[i]);
            right[i] = localMax;
        }

        for(int i=0;i<prices.length;i++)
            totalProfit = Math.max(totalProfit,left[i]+right[i]);

        return totalProfit;
    }
    /*
    public static int maxStockProfit(int[] prices){
        // first code neglect this part
        if(prices == null || prices.length == 0) {
            System.out.println("The total stock is: Zero");
            return 0;
        }

        int localMax = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] left = new int[prices.length];
        int[] right = new int[prices.length];

        int totalProfit = 0;

        for(int i=0; i<prices.length;i++){
            if(prices[i] < min)
                min = prices[i];
            else
                localMax = Math.max(localMax, prices[i]-min);
            left[i] = localMax;
        }

        localMax = 0;
        for(int i=prices.length-1; i>=0;i--){
            if(prices[i] > max)
                max = prices[i];
            else
                localMax = Math.max(localMax, max-prices[i]);
            right[i] = localMax;
        }

        for(int i=0;i<prices.length;i++)
            totalProfit = Math.max(totalProfit,left[i]+right[i]);

        System.out.println("Max stock profit: "+ totalProfit);
        return  totalProfit;
    }
    */

    public static void main(String[] args)
    {
        int[] prices = {4,4,6,1,7,5,2,5};
        //int[] prices = {1,1,1,1};
        int profit = MaxStockProfitIII.maxStockProfit(prices);
        System.out.println(profit);

    }



}
