package mx.uabc.cursojava.fundamentales;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DatosBig {
    public static void main(String args[]) {
        long masLargo = Long.MAX_VALUE;
        System.out.println(masLargo);
        BigInteger bi = BigInteger.valueOf(masLargo);
        bi=bi.add(BigInteger.valueOf(masLargo));
        bi=bi.add(BigInteger.valueOf(masLargo));
        System.out.println(bi.toString());
        System.out.println(bi.max(bi));

        BigDecimal bd = BigDecimal.valueOf(Double.MAX_VALUE);
        bd=bd.add(BigDecimal.valueOf(Double.MAX_VALUE));
        System.out.println(bd);


    }
}
