public class ValidPalidrome {
    public boolean isPalindrome(String s){
        if(s.length()==0)
            return true;

        s = s.toUpperCase();

        int lowC = 'A';
        int highC = 'Z';
        int lowN = '0';
        int highN = '9';
        int l = 0;
        int h = s.length()-1;

        while(l<h){
            if((s.charAt(l)<lowC||s.charAt(l)>highC)&&(s.charAt(l)<lowN||s.charAt(l)>highN)){
                l++;
                continue;
            }
            if((s.charAt(h)<lowC||s.charAt(h)>highC)&&(s.charAt(h)<lowN||s.charAt(h)>highN)){
                h--;
                continue;
            }
            if(s.charAt(l)==s.charAt(h)){
                l++;
                h--;
            }
            else
                return false;

        }
        return true;
    }

    public static void main(String[] args){
        ValidPalidrome p = new ValidPalidrome();
        //String s = "A man, a plan, a ccnal: Panama";
        String s = "ab";
        System.out.println(p.isPalindrome(s));
    }
}
