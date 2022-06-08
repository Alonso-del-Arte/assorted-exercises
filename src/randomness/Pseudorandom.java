package randomness;

import java.util.Random;

// TODO: Write static wrappers for Pseudorandomness's functions
public class Pseudorandom {

    private static final Random RANDOM
            = new Pseudorandomness(new RandomDotOrgAccess());

    // TODO: Write tests for this
    public static int nextInt() {
        return 0;
    }

}
