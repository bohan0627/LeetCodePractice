public class ValidPalindromeII {
    public boolean validPalindrome(String s){
        for(int i=0;i<s.length()/2;i++)
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return (isPalinDrome(s,i,s.length()-2-i)||isPalinDrome(s,i+1,s.length()-1-i));

        return true;
    }

    private boolean isPalinDrome(String s, int lo, int hi){
        for(int k = lo;k<= lo+(hi-lo)/2;k++)
            if (s.charAt(k) != s.charAt(hi - k + lo))
                return false;
        return true;
    }

    public static void main(String[] args){
        String s = "aydmda";
        ValidPalindromeII v = new ValidPalindromeII();
        System.out.println(v.validPalindrome(s));
    }
}
