package junit.examples;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;

import static junit.examples.IsDate.dateOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

//@Ignore("動作確認時にコメントインする")
public class IsDateTest {

    @Test
    public void 日付の比較() throws Exception {
        Date date = new Date();

        // dateOfはカスタムMatcherのファクトリメソッド
        assertThat(date, is(dateOf(2011, 2, 10)));
    }

    @Test
    public void nullとの比較() throws Exception {

        // dateOfはカスタムMatcherのファクトリメソッド
        assertThat(null, is(dateOf(2011, 2, 10)));
    }
}