package qiuzhao.ByteDance;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.Bidi;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = 1000000007;
        BigDecimal[]res = new BigDecimal[n];
        for(int i=0; i<n; i++){
            BigDecimal a = scanner.nextBigDecimal();
            BigDecimal b = scanner.nextBigDecimal();
            String op = scanner.next();
            switch (op) {
                case "+":
                    res[i] = a.add(b).divideAndRemainder(BigDecimal.valueOf(mod))[1];
                    break;
                case "-":
                    res[i] = a.subtract(b).divideAndRemainder(BigDecimal.valueOf(mod))[1];
                    break;
                case "*":
                    res[i] = a.multiply(b).divideAndRemainder(BigDecimal.valueOf(mod))[1];
                    break;
                case "^":
//                    BigDecimal half = a.pow(Integer.parseInt(String.valueOf(b.divideAndRemainder(BigDecimal.valueOf(2))[0]))).divideAndRemainder(BigDecimal.valueOf(mod))[1];
//                    if(b.divideAndRemainder(BigDecimal.valueOf(2))[1].equals(BigDecimal.valueOf(1))){
//                        res[i] = half.multiply(half).multiply(a).divideAndRemainder(BigDecimal.valueOf(mod))[1];
//                    }
//                    else{
//                        res[i] = half.multiply(half).divideAndRemainder(BigDecimal.valueOf(mod))[1];
//                    }
                    res[i] = a.pow(Integer.parseInt(String.valueOf(b))).divideAndRemainder(BigDecimal.valueOf(mod))[1];
                    break;
            }
        }
        for (BigDecimal re : res) {
            System.out.println(re);
        }
    }
}
