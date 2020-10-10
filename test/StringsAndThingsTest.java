import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringsAndThingsTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setUp() throws Exception {

        stringsAndThings = new StringsAndThings();
    }

    @Test
    public void removeString() {
    }

    @Test
    public void countYZ() {
        String input = "fez day";
        int expected = 2;
        int actual = stringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countYZ2() {
        String input = "yesterday was such a lovely day";
        int expected = 3;
        int actual = StringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countYZ3() {
        String input = "z y z y z zebra";
        int expected = 5;
        int actual = StringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countYZ4() {
        String input = "fizz buzz fuzzy buzzy";
        int actual = 4;
        int expected = StringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
    }

}