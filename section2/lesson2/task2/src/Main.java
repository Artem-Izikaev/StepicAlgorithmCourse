import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calcFibLastNumber(scanner.nextInt()));
    }

    public static byte calcFibLastNumber (int n) {
        byte f1 = 0;
        byte f2 = 1;
        byte fRes = 0;

        if (n == 0 || n == 1)
            fRes = (byte) n;
        else
            for (int i = 1; i < n; i++) {
                fRes = (byte) (f1 + f2);
                fRes = (byte) (fRes > 9 ? fRes % 10 : fRes);
                f1 = f2;
                f2 = fRes;
            }
        return fRes;
    }
}