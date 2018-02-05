public class RomanToInteger {
    public int romanToInt(String s) {
        int[] n = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] dic = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i = 0;
        int index = 0;
        int res = 0;
        String cur = "";
        while(i<s.length()&&index<13){
            String target = dic[index];
            if(i<s.length()-1)
                cur = s.substring(i,i+target.length());
            else
                cur = s.substring(i);
            if(cur.equals(target)){
                res += n[index];
                i += target.length();
            }
            else
                index++;
        }
        return res;
    }

    public static void main(String[] args){
        String s = "MMMDCXXI";
        RomanToInteger r = new RomanToInteger();
        System.out.println(r.romanToInt(s));

    }
}
