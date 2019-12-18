public class T16 {
    public double Power(double base, int exponent) {
        double result=1;
        if(base==0 &&exponent!=0) return 0;
        else if(base!=0){
            if(exponent==0){
                return 1;
            }
            else if(exponent>0){
                while (exponent>0){
                    result=result*base;
                    exponent--;
                }
                return result;
            }
            else {
                exponent=-exponent;
                while (exponent>0){
                    result=result*base;
                    exponent--;
                }
                return 1/result;
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        T16 test=new T16();
        System.out.println(test.Power(2,-1));
    }
}
