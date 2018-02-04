public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        if(s.length()==0)
            return 0;
        int num=0;
        for(int i=0;i<=2*s.length()-1;i++){
            int lo = i/2;
            int hi = lo + i%2;
            while(lo>=0&&hi<s.length()&&s.charAt(lo)==s.charAt(hi)){
                lo--;
                hi++;
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args){
        String s = "aac";
        PalindromicSubstrings p = new PalindromicSubstrings();
        System.out.println(p.countSubstrings(s));
    }
}
