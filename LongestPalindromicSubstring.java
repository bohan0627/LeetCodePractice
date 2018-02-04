public class LongestPalindromicSubstring {

    public String findLongest(String s){
        if(s.length()==0)
            return "";
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            int len1 = getExpand(s,i,i);
            int len2 = getExpand(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len>end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    private int getExpand(String s, int lo, int hi){
        while(lo>=0&&hi<s.length()&&s.charAt(lo)==s.charAt(hi)){
            lo--;
            hi++;
        }
        return hi-lo-1;
    }

    public static void main(String[] args){
        String s = "";
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        System.out.println(l.findLongest(s));
    }
}
