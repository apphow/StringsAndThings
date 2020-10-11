import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.awt.image.GifImageDecoder;

import static org.junit.Assert.*;

public class GIsHappyTest {
    private GIsHappy gIsHappy;

    @Before
    public void setUp() throws Exception {
        gIsHappy = new GIsHappy();
    }

    @Test
    public void gIsHappyTest() {
        String input = "xxggxx";
        Boolean actual = GIsHappy.gIsHappy(input);
        Assert.assertTrue(actual);
    }


    @Test
    public void gIsHappyTest2(){
        String input = "xxgxx";
        Boolean actual = GIsHappy.gIsHappy(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void gIsHappyTest3(){
        String input = "xxggyygxx";
        Boolean actual = GIsHappy.gIsHappy(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void gIsHappyTest4() {
        String input = "xxggxxggxxggxxggxxgxx";
        Boolean actual = GIsHappy.gIsHappy(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void gIsHappyTest5() {
        String input = "hhhhhhhh";
        Boolean actual = GIsHappy.gIsHappy(input);
        Assert.assertFalse(actual);
    }
}