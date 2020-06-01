package junit.examples;

// java.util.Random の nextInt をユニットクラスで扱うため
// 同様の機能を持つインターフェースを定義
public interface RandomNumberGenerator {

    int nextInt();
}
