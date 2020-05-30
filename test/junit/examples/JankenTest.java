package junit.examples;

import org.junit.Before;
import org.junit.Test;

import static junit.examples.Janken.Hand.*;
import static junit.examples.Janken.Result.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JankenTest {

    private Janken sut;

    @Before
    public void setUp() throws Exception {
        sut = new Janken();
    }

    @Test
    public void グーとチョキなら勝利() throws Exception {
        assertThat(sut.judge(GU, TYOKI), is(WIN));
    }

    @Test
    public void グーとパーなら敗北() throws Exception {
        assertThat(sut.judge(GU, PA), is(LOSE));
    }

    @Test
    public void グーとグーなら引き分け() throws Exception {
        assertThat(sut.judge(GU, GU), is(DRAW));
    }

    @Test
    public void チョキとパーなら勝利() throws Exception {
        assertThat(sut.judge(TYOKI, PA), is(WIN));
    }

}