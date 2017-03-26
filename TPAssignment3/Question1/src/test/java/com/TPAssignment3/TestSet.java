package com.TPAssignment3;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class TestSet
{
    SetQuestion1 s1 = new SetQuestion1();
    Set s2=s1.getSet();

    @Test
    public void testSetSize() throws Exception
    {
        assertEquals(s2.size(),4);
    }

    @Test
    public void testhettree() throws Exception
    {
        Set s2=s1.getTree();
        assertEquals(s2.size(),4);
    }
}
