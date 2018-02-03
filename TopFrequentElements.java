import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopFrequentElements{

    public static List<Integer> topFre(int[] nums, int k){
        if(nums==null||nums.length==0||k==0)
            return null;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n))
                map.put(n,map.get(n)+1);
            else
                map.put(n,1);
        }
        ArrayList<Integer>[] b=new ArrayList[nums.length+1];
        int f;
        for(int K:map.keySet()){
            f = map.get(K);
            if(b[f]==null)
                b[f]=new ArrayList<>();

            b[f].add(K);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i =b.length-1;i>=0&&res.size()<k;i--)
            if(b[i]!=null)
                res.addAll(b[i]);
        return res;
    }
    /*
    public static List<Integer> topFre(int[] nums,int k){
        if(nums == null || nums.length == 0){
            System.out.println("inValid");
            return null;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            if(map.containsKey(n))
                map.put(n,map.get(n)+1);
            else
                map.put(n,1);
        }

        ArrayList<Integer>[] bucket = new ArrayList[nums.length +1];
        for(int key: map.keySet()){
            int frequency = map.get(key);

            if(bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);


        }
        //System.out.println(bucket[1].isEmpty());
        ArrayList<Integer> res = new ArrayList<>();
        //System.out.println(res.size());
        for(int i=nums.length;i>=0 && res.size()<k;i--){
            if(bucket[i]!=null)
            res.addAll(bucket[i]);
        }
        //System.out.println(res.isEmpty());


        return  res;


    }
    */

    /*
    class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            System.out.println("inValid");
            return null;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            if(map.containsKey(n))
                map.put(n,map.get(n)+1);
            else
                map.put(n,1);
        }

        ArrayList<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key: map.keySet()){
            int frequency = map.get(key);

            if(bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);


        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=nums.length;i>=0 && res.size()<k;i--){
            if(bucket[i]!=null)
            res.addAll(bucket[i]);
        }


        return  res;

    }
}
     */

    public static void main(String[] args){
        int[] nums = {1,1,2,3,3,3};
        List<Integer> li = TopFrequentElements.topFre(nums,2);
        for(int ele: li){
            System.out.println(ele);
        }
    }
}