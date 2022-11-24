package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {
    @Test
    public void shouldBePositive(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(3, baseDemo.sum(1,2));
    }

    @Test
    public void shouldBeNegative(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(-1, baseDemo.sum(1,-2));
    }

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }
}