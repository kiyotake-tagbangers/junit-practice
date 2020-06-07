package junit.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RandomsMockTest {

    @Test
    public void choiceでAを返す() throws Exception {
        List<String> options = new ArrayList<>();
        options.add("A");
        options.add("B");
        Randoms sut = new Randoms();

        // モックの設定
        final AtomicBoolean isCallNextIntMethod = new AtomicBoolean(false);

        // スタブの設定
        sut.generator = new RandomNumberGenerator() {
            @Override
            public int nextInt() {
                // モックオブジェクトにメソッドが呼び出されたことをセット
                isCallNextIntMethod.set(true);
                return 0;
            }
        };

        assertThat(sut.choice(options), is("A"));
        assertThat(isCallNextIntMethod.get(), is(true));
    }
}