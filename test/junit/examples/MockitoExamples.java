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
}
