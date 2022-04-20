package com.daq.boot.util;

import java.math.BigDecimal;

//java에서 소수점 이하 연산에 대한 지원이 부족하여 계산에 관해서는 BigDecimal 를 권장 하고 있습니다.
public class BigDecimalTest {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        BigDecimal decimal1 = new BigDecimal("6.675");
        BigDecimal decimal2 = new BigDecimal("3");
 
        //덧셈
        System.out.println(decimal1+"+"+decimal2+"="+decimal1.add(decimal2)+" : 덧셈");
 
        //뺄셈
        System.out.println(decimal1+"-"+decimal2+"="+decimal1.subtract(decimal2)+" : 뺄셈");
 
        //곱셈
        System.out.println(decimal1+"*"+decimal2+"="+decimal1.multiply(decimal2)+" : 곱셈");
 
        //나눗셈
        System.out.println(decimal1+"/"+decimal2+"="+decimal1.divide(decimal2)+" : 나눗셈");
        System.out.println(decimal1+"/"+decimal2+"="+decimal1.divide(decimal2, 2, BigDecimal.ROUND_UP)+" : 나눗셈(올림)");
        System.out.println(decimal1+"/"+decimal2+"="+decimal1.divide(decimal2, 2, BigDecimal.ROUND_DOWN)+" : 나눗셈(내림)");
        System.out.println(decimal1+"/"+decimal2+"="+decimal1.divide(decimal2, 2, BigDecimal.ROUND_CEILING)+" : 나눗셈(양수 올림, 음수 내림)");
        System.out.println(decimal1+"/"+decimal2+"="+decimal1.divide(decimal2, 2, BigDecimal.ROUND_FLOOR)+" : 나눗셈(양수 내림, 음수 올림)");
        System.out.println(decimal1+"/"+decimal2+"="+decimal1.divide(decimal2, 2, BigDecimal.ROUND_HALF_UP)+" : 나눗셈(5이상 올림)");
        System.out.println(decimal1+"/"+decimal2+"="+decimal1.divide(decimal2, 2, BigDecimal.ROUND_HALF_DOWN)+" : 나눗셈(5초과 올림)");
        
    }
 
}
