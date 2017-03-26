package com.TPAssignment3;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class TestStudentList
{
    StudentList std = new StudentList();

    @Test
    public void testList() throws Exception
    {

        assertEquals("Tseting the get names from the list",std.getList().get(1),"John");
    }

    @Test
    public void testlistSize() throws Exception
    {
        assertFalse(std.getList().isEmpty());

    }

}
