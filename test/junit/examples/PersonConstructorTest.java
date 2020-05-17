package junit.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PersonConstructorTest {

    @Test
    public void constructorTest(){

        Person instance = new Person("Duke");

        assertThat(instance.getName(), is("Duke"));
        assertThat(instance.getAge(), is(-1));
        assertThat(instance.getEmail(), is(nullValue()));

    }
}