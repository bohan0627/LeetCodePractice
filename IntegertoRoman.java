public class IntegertoRoman {
    public String intToRoman(int num) {
        int[] n = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] dic = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String str = "";
        for(int i=0;i<13;i++){
            if(num>=n[i]){
                int count = num/n[i];
                num %= n[i];
                for(int j=0;j<count;j++)
                    str += dic[i];
            }
        }
        return str;
    }

    public static void main(String[] args){
        int num = 3999;
        IntegertoRoman i = new IntegertoRoman();
        System.out.println(i.intToRoman(num));
    }
}
