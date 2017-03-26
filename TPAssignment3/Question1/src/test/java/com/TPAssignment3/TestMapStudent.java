package com.TPAssignment3;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class TestMapStudent
{
    MapStudent ms = new MapStudent();
    @Test
    public void testMapSize() throws Exception
    {
        assertEquals("Test size of map failed",ms.getStudentNameAndNumber().size(),3);

    }
}
