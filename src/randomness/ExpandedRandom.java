package randomness;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Random;

public abstract class ExpandedRandom extends Random {

    private static final long serialVersionUID = 4553887127401760416L;

    public abstract CoinSide flipCoin();

    public abstract String nextString();

    public String nextWord() {
        return this.nextWord(Locale.getDefault());
    }

    public abstract String nextWord(Locale locale);

    public abstract LocalDateTime nextDateTime();

    public abstract LocalDateTime nextDateTime(LocalDateTime start, LocalDateTime end);

}
