import org.junit.Test;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.junit.Assert.*;
/**
 * Created by Admin on 29.10.2016.
 */
public class UTest {
    @Test
    public void testFib () throws Exception {
        long[] etalon = new long[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946};
        for (int i = 0; i < 22; i++) {
            assertEquals(BigInteger.valueOf(etalon[i]), Main.calcFib(i));
        }
    }
}
