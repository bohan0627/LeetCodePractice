import sun.jvm.hotspot.tools.SysPropsDumper;

import java.util.HashMap;
import java.util.Stack;

public class VParentheses {


    public static boolean valid(String s)
    {
        if(s==null||s.length()==0)
            return false;
        HashMap<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');

        int i = 0;
        char c = s.charAt(i);
        while(map.keySet().contains(c) && i<s.length()-1 && map.get(c) == s.charAt(i+1)  )
            {
                if(i == s.length()-2)
                return true;
            i += 2;
            c = s.charAt(i);
        }
        return false;

    }
    


    public static void main(String[] args)
    {
        String s = " ";
        String s1 = "{[]}"
        boolean status;
        status = VParentheses.valid(s1);
        System.out.println(status);


    }
}
