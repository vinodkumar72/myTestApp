/*
*GreenWave Copyright 2014 All rights Reserved, GreenWave Company Confidential
*/
package com.test.myTestApp1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
* @author vinod
*/
public class AddTest {
 // This is new test
    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testAdd() {
        Add add = new Add();
        int sum = add.sum(3,5);
        assertEquals(8,sum); 
    }

}
