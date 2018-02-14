public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        /*
        String[] str = s.split(" ");

        if(str==null||str.length==0)
            return 0;

        return str[str.length-1].length();
        */
        if(s==null||s.length()==0)
            return 0;

        int size = s.length();
        int count = 0;
        for(int i=size-1;i>=0;i--){
            if(s.charAt(i)!=' ')
                count++;
            if(s.charAt(i)==' '&&count!=0)
                return count;
        }
        return count;
    }

    public static void main(String[] args){
        LengthOfLastWord l = new LengthOfLastWord();
        String s = "Hello World";
        System.out.println(l.lengthOfLastWord(s));
    }
}
