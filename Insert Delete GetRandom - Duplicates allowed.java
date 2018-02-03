import java.util.HashMap;
import java.util.Random;

public class RandomizedElementsII {
    public  HashMap<Integer,Integer> map;

    public RandomizedElementsII(){
        map = new HashMap<>();
    }

    public  boolean insert(int val){
        if(map.containsKey(val)){
            map.put(val,map.get(val)+1);
            return false;
        }
        else
            {
                map.put(val, 1);
                return true;
            }
    }

    public  boolean remove(int val){
        if(map.containsKey(val) && map.get(val)>1){
            map.put(val,map.get(val)-1);
            return true;
        }
        else if(map.containsKey(val) && map.get(val)==1){
            map.remove(val);
            return true;
        }
        else
            return false;
    }

    public int getRandomVal(){
        int size =0;
        for(int v:map.values()){
            size += v;
        }
        int random = new Random().nextInt(size);
        int res = 0;
        int total = -1;
        for(int key:map.keySet()){
            total += map.get(key);
            if(total>=random) {
                res = key;
                break;
            }
        }
       return res;
    }

    public static void main(String[] args){
        RandomizedElementsII r = new RandomizedElementsII();
        boolean status;
        status = r.insert(1);
        System.out.println(status);
        status = r.insert(1);
        System.out.println(status);
        status = r.insert(2);
        System.out.println(status);
        int res;
        res = r.getRandomVal();
        System.out.println(res);
        //status = r.remove(5);
        //status = r.remove(3);
        status = r.remove(1);
        System.out.println(status);
        //status = r.remove(1);
        res = r.getRandomVal();
        System.out.println(res);
    }
}
