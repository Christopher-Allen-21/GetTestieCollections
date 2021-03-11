package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.TreeMap;

public class TestTreeMap {
    @Test
    public void putTest(){
        TreeMap<String,Integer> testTreeMap = new TreeMap<>();

        testTreeMap.put("Rob",22);

        Integer expected = 22;
        Integer actual = testTreeMap.get("Rob");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        TreeMap<String,Integer> testTreeMap = new TreeMap<>();

        testTreeMap.put("Chris",24);
        testTreeMap.put("Rob",22);

        testTreeMap.remove("Rob");

        Integer expected = null;
        Integer actual = testTreeMap.get("Rob");

        Assert.assertEquals(expected, actual);

        expected = 24;
        actual = testTreeMap.get("Chris");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        TreeMap<String,Integer> testTreeMap = new TreeMap<>();

        testTreeMap.put("Chris",24);
        testTreeMap.put("Rob",22);

        testTreeMap.clear();

        Integer expected = null;
        Integer actual = testTreeMap.get("Rob");

        Assert.assertEquals(expected, actual);

        expected = null;
        actual = testTreeMap.get("Chris");

        Assert.assertEquals(expected, actual);
    }
}
