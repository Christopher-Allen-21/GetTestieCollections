package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
    @Test
    public void addTest(){
        Queue<String> testQueue = new PriorityQueue<>();

        testQueue.add("Volvo");

        String expected = "Volvo";
        String actual = testQueue.element();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeAndPeekTest(){
        Queue<String> testQueue = new PriorityQueue<>();

        testQueue.add("Volvo");
        testQueue.remove("Volvo");

        String expected = null;
        String actual = testQueue.peek();

        Assert.assertEquals(expected,actual);
    }
}
