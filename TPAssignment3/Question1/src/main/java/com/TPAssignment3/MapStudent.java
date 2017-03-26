package com.TPAssignment3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Riyaad on 3/23/2017.
 */
public class MapStudent
{
    Map<String,Integer> StudentSet = new HashMap<String,Integer>();

    public Map<String,Integer> getStudentNameAndNumber()
    {
            StudentSet.put("Riyaad",1001);
            StudentSet.put("Jennifer",1002);
            StudentSet.put("Jack",1003);

        return StudentSet;
    }


}
