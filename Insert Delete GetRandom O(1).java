import java.util.HashSet;
import java.util.Random;

public class RandomizedSet {
    HashSet<Integer> set;
    public RandomizedSet(){
        set = new HashSet<>();
    }

    public boolean insert(int val){
        if(set.contains(val))
            return false;

        else {
            set.add(val);
            return true;
        }
    }

    public boolean remove(int val){
        if(set.contains(val)) {
            set.remove(val);
            return true;
        }
        else
            return false;
    }

    public int getRandom(){
        int size = set.size();
        int random = new Random().nextInt(size);
        int i = 0;
        int val = 0;
        for(int n:set){
            if(i == random) {
                val = n;
                break;
            }
            i++;
        }
        return val;
    }

    public static void main(String[] args)
    {
        RandomizedSet ran = new RandomizedSet();
        ran.insert(5);
        ran.insert(3);
        ran.insert(7);
        ran.insert(1);
        System.out.println(ran.insert(3));
        System.out.println(ran.remove(3));
        System.out.println(ran.getRandom());




    }
}
