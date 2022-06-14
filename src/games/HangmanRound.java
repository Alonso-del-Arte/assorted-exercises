package games;

import java.util.Arrays;

public class HangmanRound {

    public static final int DEFAULT_NUMBER_OF_MAX_GUESSES = 10;

    private final int totalChances;

    private final String mysteryWord;

    private boolean solved = false;

    private String uncovered;

    public String solvedSoFar() {
        return this.uncovered;
    }
private int count = 0;
    public boolean isPresent(char letter) {
        this.count++;
        char[] letters = this.mysteryWord.toCharArray();
        Arrays.fill(letters, count, letters.length, '_');
        this.uncovered = new String(letters);
        return this.mysteryWord.indexOf(letter) > -1;
    }

    public HangmanRound(String word) {
        this(word, DEFAULT_NUMBER_OF_MAX_GUESSES);
    }

    public HangmanRound(String word, int numberOfGuesses) {
        if (word == null) {
            String excMsg = "Mystery word may be \"null\" but not null";
            throw new NullPointerException(excMsg);
        }
        if (word.isEmpty()) {
            String excMsg = "Mystery word must not be empty";
            throw new IllegalArgumentException(excMsg);
        }
        this.mysteryWord = word;
        this.totalChances = numberOfGuesses;
        char[] letters = this.mysteryWord.toCharArray();
        Arrays.fill(letters, '_');
        this.uncovered = new String(letters);
    }

}
