package day15.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        System.out.println(0.09 + 0.01);
        // 0.09999999999999999
        // BigDecimal b1 = new BigDecimal("0.3");
        // BigDecimal b2 = new BigDecimal("4");

        BigDecimal b1 = new BigDecimal("1");
        BigDecimal b2 = new BigDecimal("3");

        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        // System.out.println(b1.divide(b2));
        System.out.println(b1.divide(b2, 2, RoundingMode.HALF_UP));
        System.out.println(b1.divide(b2, 2, RoundingMode.CEILING));
        System.out.println(b1.divide(b2, 2, RoundingMode.DOWN));
        System.out.println(b1.divide(b2, 2, RoundingMode.FLOOR));
        System.out.println(b1.divide(b2, 2, RoundingMode.HALF_DOWN));
        System.out.println(b1.divide(b2, 2, RoundingMode.HALF_EVEN));
        // System.out.println(b1.divide(b2, 2, RoundingMode.UNNECESSARY));
        System.out.println(b1.divide(b2, 2, RoundingMode.UP));
        
    }
}
