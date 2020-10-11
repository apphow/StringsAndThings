import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountTripleTest {

    private CountTriple countTriple;

    @Before
    public void setUp() throws Exception {
        countTriple = new CountTriple();
    }

    @Test
    public void countTriple() {
        String input = "abcXXXabc";
        Integer expected = 1;
        Integer actual = CountTriple.countTriple(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countTriple2() {
        String input = "abcdefghigklmnop";
        Integer expected = 0;
        Integer actual = CountTriple.countTriple(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countTriple3() {
        String input = "xxxabyyyycd";
        Integer expected = 3;
        Integer actual = CountTriple.countTriple(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countTriple4() {
        String input = "a";
        Integer expected = 0;
        Integer actual = CountTriple.countTriple(input);
        Assert.assertEquals(expected, actual);
    }
}