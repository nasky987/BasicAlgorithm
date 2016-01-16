package to.my.java.Algorithm.Sort;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jhon on 2016-01-16.
 */
public class SelectionSortTest {

    @Test
    public void testSort1() throws Exception {
        int list[] = {55, 21, 23, 10, 1, 3, 42, 39, 28};
        int result[] = SelectionSort.sort(list);

        org.junit.Assert.assertArrayEquals(result, new int[] {1, 3, 10, 21, 23, 28, 39, 42, 55});
    }

    @Test
    public void testSort2() throws Exception {
        int list[] = {10, 5, 5, 9, 8, 3, 1, 2};
        int result[] = SelectionSort.sort(list);

        org.junit.Assert.assertArrayEquals(result, new int[] {1, 2, 3, 5, 5, 8, 9, 10});
    }
}