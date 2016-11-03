import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Admin on 03.11.2016.
 */
public class UTest_2_2 {
    @Test
    public void testEqualNumbers () throws Exception {
        assertEquals(BigInteger.valueOf(57436),
                     Main.euclidGCD(BigInteger.valueOf(57436),
                                    BigInteger.valueOf(57436)));
    }

    @Test
    public void testAIsZero() throws Exception {
        assertEquals(BigInteger.valueOf(234203),
                     Main.euclidGCD(BigInteger.ZERO,
                                    BigInteger.valueOf(234203)));
    }

    @Test
    public void testBIsZero() throws Exception {
        assertEquals(BigInteger.valueOf(34623465833L),
                Main.euclidGCD(BigInteger.valueOf(34623465833L),
                               BigInteger.ZERO));
    }

    @Test
    public void testAGreaterBGreaterZero() throws Exception {
        assertEquals(BigInteger.valueOf(8),
                     Main.euclidGCD(BigInteger.valueOf(78265782320L),
                                    BigInteger.valueOf(26756893464L)));
    }

    @Test
    public void testBGreaterAGreaterZero() throws Exception {
        assertEquals(BigInteger.valueOf(26723831),
                     Main.euclidGCD(BigInteger.valueOf(26723831).multiply(BigInteger.valueOf(13)),
                                    BigInteger.valueOf(26723831).multiply(BigInteger.valueOf(43))));
    }

}
