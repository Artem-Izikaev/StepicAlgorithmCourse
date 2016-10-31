import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calcFib(scanner.nextInt()));
    }

    public static BigInteger calcFib (long n) {
        BigInteger f1 = new BigInteger("0");
        BigInteger f2 = new BigInteger("1");
        BigInteger fRes = new BigInteger("0");
        if (n == 0 || n == 1)
            fRes = BigInteger.valueOf(n);
        else
            for (int i = 1; i < n; i++) {
                fRes = f1.add(f2);
                f1 = f2;
                f2 = fRes;
            }
        return fRes;
    }
}