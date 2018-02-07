public class Pow_X_N {

    public double pow(double x, int n){
        long N = n;
        if(N<0){
            x = 1/x;
            N = -N;
        }

        double base =1;
        double current = x;
        for(long i=N;i>0;i/=2){
            if((i%2)==1)
                base *= current;

            current*=current;
        }
        return base;
    }

    public static void main(String[] args){
        Pow_X_N p = new Pow_X_N();
        System.out.println(p.pow(3,5));
    }
}
