package src.main.java;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExercise {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal("-45.67");
        System.out.println("Número convertido a double: " + roundBigDecimal(num));
        System.out.println("Signo revertido: " + signReverse(num));
    }

    public static double roundBigDecimal (BigDecimal bigNum){
       return bigNum.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal signReverse (BigDecimal bigNum){
        if(bigNum.compareTo(BigDecimal.ZERO) > 0) {
           bigNum = bigNum.negate();
        } else {
            bigNum = bigNum.abs();
        }
        return bigNum.setScale(1,RoundingMode.HALF_UP);
    }
}
