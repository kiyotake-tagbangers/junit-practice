package junit.examples;


import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class MockitoExamples {

    @Test
    public void モックオブジェクトに定義されたメソッドの戻り値(){

        // モックオブジェクトの作成
        // Mockito の mock() メソッドで作成されたモックオブジェクト
        List<String> mock = mock(List.class);

        // nullを返すスタブメソッドとして設定されている
        assertThat(mock.get(0), is(nullValue()));
        assertThat(mock.contains("Hello"), is(false));
    }

    @Test
    public void スタブメソッドの設定() throws Exception {

        // スタブオブジェクトの作成
        List<String> stub = mock(List.class);

        // スタブオブジェクトの設定
        when(stub.get(0)).thenReturn("Hello");

        // 検証
        assertThat(stub.get(0), is("Hello"));
    }
}
