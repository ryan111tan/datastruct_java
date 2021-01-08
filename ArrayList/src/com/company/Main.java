package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Main {

    @Test
    public void JUnitTest() {
        String[] input = {"yes"};
        String[] output = {"yes"};

        Assert.assertArrayEquals(input, output);
    }
}
