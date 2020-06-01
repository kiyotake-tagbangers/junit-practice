package junit.examples;

import java.util.Random;

// java.util.Random の nextInt を利用するデフォルトの実装
public class RandomNumberGeneratorImpl implements RandomNumberGenerator {

    private final Random rand = new Random();

    @Override
    public int nextInt() {
        return rand.nextInt();
    }
}
