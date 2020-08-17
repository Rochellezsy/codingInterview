import java.text.DecimalFormat;

public class sqrt {
    public double mySqrt(int x) {
        DecimalFormat df = new DecimalFormat("0.00000");
        double l = 0;
        double r = x;
        double last = 0;
        while(l<=r){
            double mid = l + (r - l)/2;
            if(mid*mid<=x){
                if(Math.abs(mid-last)<=0.000001){
                    return Double.parseDouble(df.format(mid));
                }
                l = mid;
            }
            else{
                r = mid;
            }
            last = mid;
        }
        return -1;

    }

    public static void main(String[] args) {
        sqrt test = new sqrt();
        System.out.println(test.mySqrt(5));
    }
}
