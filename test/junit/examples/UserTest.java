package junit.examples;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class UserTest {

    // インスタンス化テストは初期状態を検証する特別なコンテキスト
    // 初期値が期待するものかをテストする
    public static class インスタンス化テスト {
        @Test
        public void デフォルトコンストラクタ() throws Exception {
            User instance = new User();
            assertThat(instance.getName(), is("nobody"));
            assertThat(instance.isAdmin(), is(false));
        }
    }

}