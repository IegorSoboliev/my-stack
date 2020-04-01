
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {
    private int maxSize;
    private MyStack stack;
    private int element;

    @Before
    public void setUp() throws Exception {
        maxSize = 12;
        element = 1;
        stack = new MyStack(maxSize);
        stack.push(element);
    }

    @Test
    public void isEmptyValid () {
        stack.pop(element);
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void isEmptyNotValid () {
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void pushValid() {
        Assert.assertEquals(stack.peek(), element);
    }

    @Test
    public void pushNotValid() {
        Assert.assertFalse(stack.peek() != element);
    }

    @Test
    public void popValid() {
        Assert.assertEquals(stack.pop(element), element);
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void popNotValid() {
        Assert.assertFalse(stack.pop(element) != element);
        Assert.assertFalse(stack.getTop() != -1);
    }

    @Test
    public void isFullValid() {
        int counter = 1;
        while (counter < maxSize) {
            stack.push(element);
            counter++;
        }
        Assert.assertTrue(stack.isFull());
    }
}
