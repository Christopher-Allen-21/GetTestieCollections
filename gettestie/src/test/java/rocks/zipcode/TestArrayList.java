package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class TestArrayList {

    @Test
    public void addTest(){
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("Chris");

        Boolean expected = true;
        Boolean actual = myArrList.contains("Chris");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("Chris");
        myArrList.add("Robert");
        myArrList.add("Stephen");

        myArrList.remove("Robert");

        Boolean expected = false;
        Boolean actual = myArrList.contains("Robert");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clearTest(){
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("Chris");
        myArrList.add("Robert");
        myArrList.add("Stephen");

        myArrList.clear();

        int expected = 0;
        int actual = myArrList.size();

        Assert.assertEquals(expected,actual);

    }
}
