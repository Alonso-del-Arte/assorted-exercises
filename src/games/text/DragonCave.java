/*
 * I'd make this public domain except it has creative writing content of unclear
 * authorship. If you're the author of the creative content included here,
 * please let me know, so I can give you a byline. So license is I don't know.
 */
package games.text;

import java.util.Scanner;

/**
 * Implementation of a text game, <i>Dragon Cave</i>. It is my understanding
 * that it is an old game dating back to the very earliest days of computer
 * gaming. I'm doing it as an exercise in a training.
 * @author Alonso del Arte For the Java programming, not the creative writing
 * content, which I copied and pasted from a classmate who is also doing this
 * assignment.
 */
public class DragonCave {

    private static final String INTRO
            = "You are in a land full of dragons. In front of you,\n"
            + "you see two caves. In one cave, the dragon is friendly\n"
            + "and will share his treasure with you. The other dragon\n"
            + "is greedy and hungry and will eat you on sight.\n"
            + "Which cave will you go into? (1 or 2)\n";

    private static final String UNFRIENDLY_DRAGON_OUTCOME
            = "You approach the cave...\n"
            + "It is dark and spooky...\n"
            + "A large dragon jumps out in front of you!\n"
            + "He opens his jaws and...\n"
            + "He gobbles you up!\n";

    private static final String FRIENDLY_DRAGON_OUTCOME
            = "You approach the cave...\n"
            + "It is dark and spooky...\n"
            + "A large dragon jumps out in front of you!\n"
            + "He opens his jaws and...\n"
            + "Spits out treasure! Just for you!\n";

    /**
     * I wrote this one, not the original Dragon Cave author. If it's not as
     * good as the other text, blame me, not the original author.
     */
    private static final String INDECISION_OUTCOME
            = "Your failure to choose one of the two caves has caused\n"
            + "something bad to happen regardless. I don't know, maybe a big\n"
            + "hailstorm or whatever. And did I mention that it's freezing\n"
            + "cold? You should have gone into a cave...";

    private enum SideOfCoin { HEADS, TAILS }

    private static SideOfCoin flip() {
        double x = Math.random();
        if (x < 0.5) {
            return SideOfCoin.HEADS;
        } else {
            return SideOfCoin.TAILS;
        }
    }

    public static void main(String[] args) {
        System.out.println(INTRO);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next().replace(" ", "");
        int number = -1;
        try {
            number = Integer.parseInt(line);
            SideOfCoin flipChoice = SideOfCoin.values()[number - 1];
            SideOfCoin flipOutcome = flip();
            if (flipChoice.equals(flipOutcome)) {
                System.out.println(FRIENDLY_DRAGON_OUTCOME);
            } else {
                System.out.println(UNFRIENDLY_DRAGON_OUTCOME);
            }
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.err.println("\n" + number + " is not a valid cave number");
            System.err.println("System reports: \"" + aioobe.getMessage()
                    + "\"");
            System.out.println(INDECISION_OUTCOME);
        } catch (NumberFormatException nfe) {
            System.err.println("\nSystem reports: \"" + nfe.getMessage()
                    + "\"");
            System.out.println(INDECISION_OUTCOME);
        }
    }

}
