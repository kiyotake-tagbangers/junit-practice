package junit.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AssertionTest {

    @Test
    public void assertion(){
        String actual = "Hello" + " " + "World";
        assertThat(actual, is("Hello World"));
    }
}
