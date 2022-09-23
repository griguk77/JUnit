
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
    public static MyMath myMath;

    @BeforeClass
    public static void createNewMyMath() {
        myMath = new MyMath();
    }
    @Test(expected = RuntimeException.class)
    public void checkZeroShouldWasNotZero() {
        myMath.divide(1, 0);
    }

    @Test(timeout = 1000)
    public void checkTimeMin() {
        myMath.divide(1, 1);
    }
    @Test
    public void checkShouldPositiveValue() {
        Assert.assertEquals(2, myMath.divide(4, 2), 1e-9);
    }
}
