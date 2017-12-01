import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Salim on 25/10/2017.
 */
public class MainTest {

    @Test
    public void multiplicationOfZeroShouldReturnZero() {
        Calculator myCalculator = new Calculator();
        Assert.assertEquals("Multiplication of an 10 * 0 should return 0", 0, myCalculator.multiply(10, 0));
    }
}
