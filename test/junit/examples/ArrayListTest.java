package junit.examples;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArrayListTest {

    @Test
    public void addで要素を追加するとサイズが1となりgetで取得できる() throws Exception {
        ArrayList<String> sut = new ArrayList<String>();

        // ArrayListのaddメソッドは副作用があり戻り値を持たないメソッド
        sut.add("Hello");

        // size,getメソッドを使いオブジェクトの状態を間接的に確認するしかない
        assertThat(sut.size(), is(1));
        assertThat(sut.get(0), is("Hello"));
    }

    @Test
    public void 要素が2つ追加された状態で要素をremoveするとsizeが1となる() throws Exception {

        ArrayList<String> sut = new ArrayList<String>();
        sut.add("Hello");
        sut.add("World");

        sut.remove(0);

        assertThat(sut.size(), is(1));
        assertThat(sut.get(0), is("World"));
    }
}
