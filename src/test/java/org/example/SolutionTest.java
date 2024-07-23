package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void singleNumberTest() {
        Solution solution = new Solution();
        assertEquals(1, solution.singleNumber(new int[]{2,2,1}));
        assertEquals(4, solution.singleNumber(new int[]{4,1,2,1,2}));
        assertEquals(1, solution.singleNumber(new int[]{1}));
    }

}