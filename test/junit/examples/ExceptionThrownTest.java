package junit.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionThrownTest {

    ExceptionThrown sut = new ExceptionThrown();

    @Test(expected = IllegalArgumentException.class)
    public void 例外テスト() throws Exception {
        sut.doSomething();
    }
}