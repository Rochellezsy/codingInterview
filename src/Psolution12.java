public class Psolution12 {
    public double Power(double base, int exponent) {
        double result=1;

        if(exponent==0 && base!=0){
            return 1;

        }
        else if(base == 0){
            return 0;
        }
        else if(exponent>0){
            for(int i=0;i<exponent;i++){
                result=result*base;
            }
        }
        else if(exponent<0){
            exponent=-exponent;
            for(int i=0;i<exponent;i++){
                result=result*1/base;
            }
        }
        return result;



    }

}
