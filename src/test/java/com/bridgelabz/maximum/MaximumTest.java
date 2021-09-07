package com.bridgelabz.maximum;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MaximumTest
{
    @Test
    public void intMax1() {
        int actualValue = Maximum.getmaximum(12,14,15);
        Assert.assertEquals(15,actualValue);
    }

    @Test
    public void intMax2() {
        int actualValue = Maximum.getmaximum(1000,545,746);
        Assert.assertEquals(1000,actualValue);
    }
}
