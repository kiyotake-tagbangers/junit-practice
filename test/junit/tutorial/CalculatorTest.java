package junit.tutorial;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void multiply3And4(){
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3, 4);

        // Assertクラスに定義されたstaticメソッド
        // 2つ目の引数のisメソッドは、Matcherと呼ばれる値の比較オブジェクトを生成するためのファクトリメソッド
        // staticインポートすることで、テストコードを自然言語に近い構文で記述できる
        assertThat(actual, is(expected));
    }

    @Test
    public void multiply5And7(){
        Calculator calc = new Calculator();
        int expected = 35;
        int actual = calc.multiply(5, 7);

        // Assertクラスに定義されたstaticメソッド
        // 2つ目の引数のisメソッドは、Matcherと呼ばれる値の比較オブジェクトを生成するためのファクトリメソッド
        // staticインポートすることで、テストコードを自然言語に近い構文で記述できる
        assertThat(actual, is(expected));
    }

    @Test
    public void divide3To2(){
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3, 2);
        assertThat(actual, is(expected));
    }

    // メソッドが例外を送出することを検証する時は、expected属性を利用
    @Test(expected = IllegalArgumentException.class)
    public void divide5To0(){
        Calculator calc = new Calculator();
        calc.divide(5, 0);
    }

}