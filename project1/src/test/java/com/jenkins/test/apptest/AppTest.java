package com.jenkins.test.apptest;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
    @Test
    public void passingTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void failingTest() {
        Assert.assertTrue(true);
    }
}
