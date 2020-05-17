package junit.examples;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionFailTest {

    AssertionFail sut;

    @Before
    public void setUp() throws Exception {
        sut = new AssertionFail();
    }

    /**
     * failメソッドはテストを無条件で失敗として扱いたい時に使用する
     * テストメソッドを作成したが、テストコードを記述していない場合などに利用
     */
    @Ignore("動作確認時に、この@Ignoreをコメントアウトする")
    @Test
    public void someTest() {
        fail("TODO: implement test code");
    }

    /**
     * あるブロックが実行された場合にテストを失敗とする
     * = 特定のステップが実行されないことをテストする
     */
    @Test(expected = IllegalStateException.class)
    public void timeoutがtrueのときにロジックが実行されないこと() {

        // SetUp
        Runnable logic = new Runnable() {
            @Override
            public void run() {

                // timeOutがfalseの場合、runメソッドは実行されてしまう
                fail("run が呼ばれてしまった");
            }
        };
        sut.timeOut = true;

        // Exercise
        sut.invoke(logic);
    }
}