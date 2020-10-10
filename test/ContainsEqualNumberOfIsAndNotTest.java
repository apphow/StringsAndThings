import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsEqualNumberOfIsAndNotTest {

    private ContainsEqualNumberOfIsAndNot containsEqualNumberOfIsAndNot;

    @Before
    public void setUp() throws Exception {
        containsEqualNumberOfIsAndNot = new ContainsEqualNumberOfIsAndNot();
    }

    @Test
    public void containsEqualNumberOfIsAndNot() {
        String input = "This is not";
        Boolean actual = ContainsEqualNumberOfIsAndNot.containsEqualNumberOfIsAndNot(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void equalIsNotTest2() {
        String input= "noisxxnotyynotxisi";
        Boolean actual = ContainsEqualNumberOfIsAndNot.containsEqualNumberOfIsAndNot(input);
        Assert.assertTrue(actual);
    }

    @Test
    public void equalIsNotTest3() {
        String input = "This is this and that is that";
        Boolean actual = ContainsEqualNumberOfIsAndNot.containsEqualNumberOfIsAndNot(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void equalIsNotTest4() {
        String input = "is not";
        Boolean actual = ContainsEqualNumberOfIsAndNot.containsEqualNumberOfIsAndNot(input);
        Assert.assertTrue(actual);
    }
}