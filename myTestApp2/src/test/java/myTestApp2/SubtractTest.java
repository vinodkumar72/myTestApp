/*
*GreenWave Copyright 2014 All rights Reserved, GreenWave Company Confidential
*/
package myTestApp2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.myTestApp2.Subtract;


/**
* @author vinod
*/
public class SubtractTest {

    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testSubstract() {
        Subtract sub = new Subtract();
        assertEquals(sub.minus(8,2),6);
    }

}
