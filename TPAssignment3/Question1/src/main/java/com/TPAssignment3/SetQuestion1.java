package com.TPAssignment3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Riyaad on 3/23/2017.
 */
public class SetQuestion1
{
    Set<String> set = new HashSet<String>();
    Set<Integer> treeadd = new TreeSet<Integer>();

    public Set<String> getSet()
    {

        set.add("set1");
        set.add("set2");
        set.add("set3");
        set.add("set4");


        return set;
    }

    public Set<String> getTree()
    {

        treeadd.add(1);
        treeadd.add(2);
        treeadd.add(3);


        return set;
    }



}
