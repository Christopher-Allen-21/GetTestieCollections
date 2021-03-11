package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TestIterator {

    @Test
    public void iteratorNextTest(){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        Iterator<String> it = cars.iterator();

        String expected = "Volvo";
        String actual = it.next();

        Assert.assertEquals(expected,actual);

        expected = "BMW";
        actual = it.next();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void hasNextTest(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(12);
        expected.add(23);
        ArrayList<Integer> actual = numbers;

        Assert.assertEquals(expected,actual);

    }
}
