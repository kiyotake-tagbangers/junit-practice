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
    public void スタブメソッドの設定() {

        // スタブオブジェクトの作成
        List<String> stub = mock(List.class);

        // スタブオブジェクトの設定
        when(stub.get(0)).thenReturn("Hello");

        // 検証
        assertThat(stub.get(0), is("Hello"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void 例外を送出するメソッド() throws Exception {
        List<String> stub = mock(List.class);
        when(stub.get(0)).thenReturn("Hello");
        when(stub.get(1)).thenReturn("World");
        when(stub.get(2)).thenThrow(new IndexOutOfBoundsException());
        stub.get(2);
    }

    @Test(expected = RuntimeException.class)
    public void 戻り値がvoid型のメソッドで例外を送出() throws Exception {
        List<String> stub = mock(List.class);
        doThrow(new RuntimeException()).when(stub).clear();

        // 例外を送出
        stub.clear();
    }

    @Test
    public void モックの検証() throws Exception {
        List<String> mock = mock(List.class);
        mock.clear();
        mock.add("Hello");
        mock.add("Hello");
        mock.add("World");
        verify(mock).clear();
        verify(mock, times(2)).add("Hello");
        verify(mock, times(1)).add("World");
        verify(mock, never()).add("Hello World");
    }
}
