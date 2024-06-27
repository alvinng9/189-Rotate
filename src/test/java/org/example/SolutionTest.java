package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void rotateTest() {
        Solution solution = new Solution();
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(input, 3);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, input);
        int[] inputTwo = {-1,-100,3,99};
        solution.rotate(inputTwo, 2);
        Assert.assertArrayEquals(new int[]{3,99,-1,-100}, inputTwo);

    }

}