import java.math.BigInteger;
import java.util.Scanner;

class Main {
    private static BigInteger iA, iB;

    public static void main(String[] args) {
        getInputData();
        System.out.println(euclidGCD(iA, iB));
    }

    public static void getInputData () {
        Scanner scanInput = new Scanner(System.in);
        iA = scanInput.nextBigInteger();
        iB = scanInput.nextBigInteger();
    }

    public static BigInteger euclidGCD (BigInteger a, BigInteger b) {
        if (a.compareTo(BigInteger.ZERO) == 0)
            return b;
        else
        if (b.compareTo(BigInteger.ZERO) == 0)
            return a;
        else
        if (a.compareTo(b) > 0)
            return euclidGCD(a.divideAndRemainder(b)[1], b);
        else
            return euclidGCD(b.divideAndRemainder(a)[1], a);
    }
}