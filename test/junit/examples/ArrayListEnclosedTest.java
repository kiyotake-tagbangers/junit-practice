package junit.examples;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

// 構造化された ArrayList のテストクラス
@RunWith(Enclosed.class)
public class ArrayListEnclosedTest {

    public static class listに1件追加してある場合 {
        private ArrayList<String> sut;

        // テストの事前条件を満たすためのコードを setUp メソッドに移動しているので、
        // テストメソッドが読みやすい
        @Before
        public void setUp() throws Exception {
            sut = new ArrayList<String>();
            sut.add("A");
        }

        @Test
        public void sizeは1を返す() throws Exception {
            int actual = sut.size();
            assertThat(actual, is(1));
        }
    }

    public static class listに2件追加してある場合 {
        private ArrayList<String> sut;

        @Before
        public void setUp() throws Exception {
            sut = new ArrayList<String>();
            sut.add("A");
            sut.add("B");
        }

        @Test
        public void sizeは2を返す() throws Exception {
            int actual = sut.size();
            assertThat(actual, is(2));
        }
    }
}