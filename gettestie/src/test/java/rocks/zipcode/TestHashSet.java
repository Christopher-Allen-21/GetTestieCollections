package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {

    @Test
    public void addTest(){
        HashSet<String> testHashSet = new HashSet<>();
        testHashSet.add("Chris");

        Boolean expected = true;
        Boolean actual = testHashSet.contains("Chris");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        HashSet<String> testHashSet = new HashSet<>();
        testHashSet.add("Chris");
        testHashSet.add("Robert");
        testHashSet.add("Stephen");

        testHashSet.remove("Robert");

        Boolean expected = false;
        Boolean actual = testHashSet.contains("Robert");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clearTest(){
        HashSet<String> testHashSet = new HashSet<>();
        testHashSet.add("Chris");
        testHashSet.add("Robert");
        testHashSet.add("Stephen");

        testHashSet.clear();

        int expected = 0;
        int actual = testHashSet.size();

        Assert.assertEquals(expected,actual);

    }




}
