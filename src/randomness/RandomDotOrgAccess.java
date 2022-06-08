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

    @Override
    public int[] giveNumbers(int amount, int minimum, int maximum)
            throws IOException {
        return new int[amount];
    }

    @Override
    public boolean haveNotExceededQuota() throws IOException {
        return false;
    }

}
