package randomness;

import java.io.InputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Connects to Random.org to get random integers.
 * @author Alonso del Arte
 */
class RandomDotOrgAccess extends ExternalRandomnessProvider {

    private static final int MINIMUM_AMOUNT = 1;

    private static final int MAXIMUM_AMOUNT = 10000;

    private static final int MINIMUM_MINIMUM = -1000000000;

    private static final int MAXIMUM_MAXIMUM = 1000000000;

    @Override
    public int[] giveNumbers(int amount, int minimum, int maximum)
            throws IOException {
        if (amount < MINIMUM_AMOUNT || amount > MAXIMUM_AMOUNT) {
            String excMsg = "amount should be in range " + MINIMUM_AMOUNT
                    + " to " + MAXIMUM_AMOUNT;
            throw new IllegalArgumentException(excMsg);
        }
        if (minimum < MINIMUM_MINIMUM) {
            String excMsg = "minimum should be at least " + MINIMUM_MINIMUM;
            throw new IllegalArgumentException(excMsg);
        }
        if (maximum > MAXIMUM_MAXIMUM) {
            String excMsg = "maximum should be at no more than "
                    + MAXIMUM_MAXIMUM;
            throw new IllegalArgumentException(excMsg);
        }
        if (minimum >= maximum) {
            String excMsg = "minimum should not be greater than maximum";
            throw new IllegalArgumentException(excMsg);
        }
        return new int[amount];
    }

    @Override
    public boolean haveNotExceededQuota() throws IOException {
        return false;
    }

}
