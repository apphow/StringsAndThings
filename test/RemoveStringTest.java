import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveStringTest {

    private StringsAndThings stringsAndThings;
    @Before
    public void setUp() throws Exception {
        stringsAndThings = new StringsAndThings();
    }

    @Test
    public void removeStringTest() {
        String base = "Friendly Friday Firedrill";
        String expected = "Friend Friday Firedrill";
        String actual = stringsAndThings.removeString(base, "ly");
        System.out.println(expected);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStringTest1() {
        String base = "Yellow Paint";
        String expected = "Yow Paint";
        String actual = stringsAndThings.removeString(base, "ell");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeStringTest2() {
        String base = "How are you?";
        String expected = "How are you?";
        String actual = stringsAndThings.removeString(base, "z");
        Assert.assertEquals(expected, actual);
    }

    }
