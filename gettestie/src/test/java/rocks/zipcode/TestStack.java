package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void popTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void peekTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");

        String expected = "Hello world";
        String actual = stack.peek();

        assertEquals(expected, actual);
    }


}
