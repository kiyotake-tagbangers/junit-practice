package junit.examples;

// 固定値を返すスタブ実装
public class RandomNumberGeneratorFixedResultStub implements RandomNumberGenerator{

    @Override
    public int nextInt() {
        return 1;
    }
}
