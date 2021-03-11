package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestHashMap {

    @Test
    public void putTest(){
        HashMap<String,Integer> testHashMap = new HashMap<>();

        testHashMap.put("Rob",22);

        Integer expected = 22;
        Integer actual = testHashMap.get("Rob");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        HashMap<String,Integer> testHashMap = new HashMap<>();

        testHashMap.put("Chris",24);
        testHashMap.put("Rob",22);

        testHashMap.remove("Rob");

        Integer expected = null;
        Integer actual = testHashMap.get("Rob");

        Assert.assertEquals(expected, actual);

        expected = 24;
        actual = testHashMap.get("Chris");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        HashMap<String,Integer> testHashMap = new HashMap<>();

        testHashMap.put("Chris",24);
        testHashMap.put("Rob",22);

        testHashMap.clear();

        Integer expected = null;
        Integer actual = testHashMap.get("Rob");

        Assert.assertEquals(expected, actual);

        expected = null;
        actual = testHashMap.get("Chris");

        Assert.assertEquals(expected, actual);
    }

}
