package junit.examples;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addに3と4を与えると7を返す() throws Exception {

        // Set up
        Calculator sut = new Calculator();
        sut.init();

        // Exercise
        int actual = sut.add(3,4);

        // Verify
        assertThat(actual, is(7));

        // TearDown
        sut.shutdown();
    }

    Calculator sut;

    @Before
    public void setUp() throws Exception {
        sut = new Calculator();
        sut.init();
    }

    /**
     * テストケースに共通する後処理のメソッド
     * 慣習としてメソッド名は、tearDown
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        sut.shutdown();
    }

    @Ignore("未実装")
    @Test
    public void divideに4と2を与えると2を返す() throws Exception {
        int actual = sut.divide(3, 4);
        assertThat(actual, is(7));
    }
}