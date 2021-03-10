package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Vector;

public class TestVector {


    @Test
    public void addTest(){
        Vector<String> testVector = new Vector<>();
        testVector.add("Chris");

        Boolean expected = true;
        Boolean actual = testVector.contains("Chris");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        Vector<String> testVector = new Vector<>();
        testVector.add("Chris");
        testVector.add("Robert");
        testVector.add("Stephen");

        testVector.remove("Robert");

        Boolean expected = false;
        Boolean actual = testVector.contains("Robert");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clearTest(){
        Vector<String> testVector = new Vector<>();
        testVector.add("Chris");
        testVector.add("Robert");
        testVector.add("Stephen");

        testVector.clear();

        int expected = 0;
        int actual = testVector.size();

        Assert.assertEquals(expected,actual);

    }
}
