package junit.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void 空文字列の場合にtrueを返す() throws Exception {
        assertThat(StringUtils.isEmptyOrNull(""), is(true));
    }

    @Test
    public void nullの場合にtrueを返す() throws Exception {
        assertThat(StringUtils.isEmptyOrNull(null), is(true));
    }

    @Test
    public void abcの場合にfalseを返す() throws Exception {
        assertThat(StringUtils.isEmptyOrNull("abc"), is(false));
    }
}