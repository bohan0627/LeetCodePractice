public class PalinDrome {
    public boolean isPalinDrome(int num){
        if(num < 0)
            return false;
        else if(num==0)
            return true;
        else{
            int x = num;
            int y=0;

            while(x!=0){
                y = y*10 + x%10;
                x = x/10;
            }
            if(y==num)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args){
        int num = 00;
        PalinDrome p = new PalinDrome();
        System.out.println(p.isPalinDrome(num));
    }
}
