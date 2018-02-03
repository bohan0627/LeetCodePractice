import java.util.LinkedList;
import java.util.List;

//KVal refers to the K: total numbers which used to get the target


public class Ksum {
    private List<List<Integer>> kSum(int kVal, int target, int startIndex, int[] nums )
    {
        List<List<Integer>> result = new LinkedList<>();
        if ( kVal == 0 )
        {
            if ( target == 0 )
            {
                result.add( new LinkedList<>() );
            }
            return result;
        }

        for ( int i = startIndex; i < nums.length - kVal + 1; i++ )
        {
            if ( ( i > startIndex ) && ( nums[i] == nums[i - 1] ) )
            {
                continue;
            }
            for ( List<Integer> partialResult : kSum( kVal - 1, target - nums[i], i + 1, nums ) )
            {
                partialResult.add( 0, nums[i] );
                result.add( partialResult );
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] array = {1,0,-1,0,-2,2};
        List<List<Integer>> res = FourSum.fSum(4,0,0,array);
        for(List<Integer> it:res){
            System.out.print(it);
        }
}
