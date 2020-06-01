package junit.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RandomsTest {

    @Test
    public void choiceでAを返す() throws Exception {
        List<String> options = new ArrayList<>();
        options.add("A");
        options.add("B");
        options.add("C");
        options.add("D");
        Randoms sut = new Randoms();

        // スタブの設定
        sut.generator = new RandomNumberGenerator() {
            @Override
            public int nextInt() {
                return 0;
            }
        };
        // スタブ実装を使う場合
        // sut.generator = new RandomNumberGeneratorFixedResultStub();
        assertThat(sut.choice(options), is("A"));
    }
}