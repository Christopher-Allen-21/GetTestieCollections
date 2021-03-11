package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class TestTreeSet {

    @Test
    public void addTest1(){
        TreeSet<String> testTreeSet = new TreeSet<>();

        testTreeSet.add("Rob");

        Boolean expected = true;
        Boolean actual = testTreeSet.contains("Rob");

        Assert.assertEquals(expected, actual);

        expected = false;
        actual = testTreeSet.contains("Chris");
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void addTest2(){
        TreeSet<String> testTreeSet = new TreeSet<>();

        Boolean expected = true;
        Boolean actual = testTreeSet.add("Rob");;

        Assert.assertEquals(expected, actual);

        expected = false;
        actual = testTreeSet.add("Rob");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        TreeSet<String> testTreeSet = new TreeSet<>();

        testTreeSet.add("Rob");
        testTreeSet.add("Chris");

        testTreeSet.remove("Rob");

        Boolean expected = false;
        Boolean actual = testTreeSet.contains("Rob");

        Assert.assertEquals(expected, actual);
    }
}
