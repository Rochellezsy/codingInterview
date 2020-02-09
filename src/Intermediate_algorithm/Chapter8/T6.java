package Intermediate_algorithm.Chapter8;

public class T6 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        int flag = 1; // 1 表示正数，-1表示负数；
        if (dividend > 0) {
            dividend = -dividend;
        } else {
            flag = -flag;
        }
        if (divisor > 0) {
            divisor = -divisor;
        } else {
            flag = -flag;
        }

        int s = 0, tmpd, k;
        while (dividend <= divisor) {
            tmpd = divisor;
            k = 1;
            while (dividend <= tmpd + tmpd && tmpd + tmpd < 0) {
                tmpd += tmpd;
                k += k;
            }
            s = s + k;
            dividend -= tmpd;
        }
        return flag > 0 ? s : -s;


    }
}
