package main.pliki_operacje_tekst;

import java.math.BigInteger;

public class BigIntegerExample {

    // Napisz program, który określi dla jak dużych liczb
    // typ BigInteger przy wykonywaniu obliczeń pojawi się błąd lub wyjątek.
    public void operationThatThrowsException() {
        BigInteger bigInteger = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        // Tu będzie wyjątek przy sprobie podnieść maksymalną
        // wartość typu Integer do potęgi maksymalnej wartości typu Integer
        BigInteger mulResult = bigInteger.pow(Integer.MAX_VALUE);
        System.out.println(mulResult);
    }
}
