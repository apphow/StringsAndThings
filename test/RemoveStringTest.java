import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveStringTest {

    private  RemoveString removeString;
    @Before
    public void setUp() throws Exception {
       removeString = new RemoveString();
    }

    @Test
    public void removeStringTest() {
        String base = "Friendly Friday Firedrill";
        String expected = "Friend Friday Firedrill";
        String actual = RemoveString.removeString(base, "ly");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStringTest1() {
        String base = "Yellow Paint";
        String expected = "Yow Paint";
        String actual = RemoveString.removeString(base, "ell");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeStringTest2() {
        String base = "How are you?";
        String expected = "How are you?";
        String actual = RemoveString.removeString(base, "z");
        Assert.assertEquals(expected, actual);
    }

    }
