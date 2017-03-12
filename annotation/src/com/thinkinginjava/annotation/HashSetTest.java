package com.thinkinginjava.annotation;

import org.junit.Test;
import java.util.HashSet;

/**
 * Created by dujian on 12/03/2017.
 */
public class HashSetTest {
    HashSet<String> testObject = new HashSet<String>();

    @Test
    @SimulatingNull(3)
    public void initialization(){
        assert testObject.isEmpty();
    }
    @Test
    public void _contains(){
        testObject.add("one");
        System.out.println(testObject.toString());
    }

}
