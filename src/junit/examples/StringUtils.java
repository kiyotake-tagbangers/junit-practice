package junit.examples;

public class StringUtils {

    // 副作用のないメソッドの例
    // 文字列が空文字かnullであるかを判定するメソッドでは、
    // 同じ文字列を何度判定しても不変で、オブジェクトへの副作用がない
    public static boolean isEmptyOrNull(String value) {
        return value == null || value.isEmpty();
    }
}
