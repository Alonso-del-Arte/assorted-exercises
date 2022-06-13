package randomness;

import java.util.Random;

// TODO: Write static wrappers for Pseudorandomness's functions
public class Pseudorandom {

    private static final Random RANDOM = new Random();
//            = new Pseudorandomness(new RandomDotOrgAccess());

    // TODO: Write tests for this
    public static int nextInt() {
        return 0;
    }

    public static CoinSide flipCoin() {
        if (RANDOM.nextInt() % 2 == 0) {
            return CoinSide.HEADS;
        } else {
            return CoinSide.TAILS;
        }
    }

}
