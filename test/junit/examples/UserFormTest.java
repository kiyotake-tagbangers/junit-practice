package junit.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UserFormTest {

    @Test
    public void isValidはuserNameとpasswordが空でない場合にtrueを返す() throws Exception {

        // SUT(System Under Test)は、テスト対象となるクラスやオブジェクトを差す
        UserForm sut = new UserForm("user01", "1234");
        assertThat(sut.isValid(), is(true));
    }

    @Test
    public void userNameが空のときにエラーメッセージが取得できる() throws Exception {
        UserForm sut = new UserForm("", "1234");
        String expected = "ユーザIDは必須項目です。";
        String actual = sut.getErrorMessage();
        assertThat(actual, is(expected));
    }

}