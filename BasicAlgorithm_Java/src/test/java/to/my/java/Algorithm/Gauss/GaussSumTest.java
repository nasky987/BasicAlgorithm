package to.my.java.Algorithm.Gauss;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jhon on 2016-01-16.
 */
public class GaussSumTest {

    @Test
    public void testSum1() throws Exception {
        final int result = GaussSum.sum(100);

        Assert.assertEquals(result, 5050);
    }

    @Test
    public void testSum2() throws Exception {
        final int result = GaussSum.sum(3);

        Assert.assertEquals(result, 6);
    }

    @Test
    public void testSum3() throws Exception {
        final int result = GaussSum.sum(0);

        Assert.assertEquals(result, 0);
    }

    @Test
    public void testSum4() throws Exception {
        final int result = GaussSum.sum(1);

        Assert.assertEquals(result, 1);
    }

    @Test
    public void testSum5() throws Exception {
        final int result = GaussSum.sum(-1);

        Assert.assertEquals(result, 0);
    }
}