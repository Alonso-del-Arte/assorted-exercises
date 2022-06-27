package swingaux;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import randomness.Pseudorandom;

class SinglePressKeyboardTest implements ActionListener {

    private static final String QWERTY = "QWERTYUIOP\nASDFGHJKL\nZXCVBNM";

    private static final String DVORAK = "PYFGCRL\nAOEUIDHTNS\nQJKXBMWVZ";

    private ActionEvent mostRecentEvent = null;

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.mostRecentEvent = ae;
    }

    @Test
    void testPickLetter() {
        char letterChoice = (char) ('A' + Pseudorandom.nextInt(26));
        String letter = Character.toString(letterChoice);
        SinglePressKeyboard keyboard = new SinglePressKeyboard(letter,this);
        JButton button = keyboard.buttons.get(0);
        button.doClick();
        String nonNullMsg = "Most recent event should not be null";
        assert this.mostRecentEvent != null : nonNullMsg;
        String msg = "Keyboard with button for letter '" + letterChoice
                + "' should be source of most recent event";
        assertEquals(keyboard, this.mostRecentEvent.getSource(), msg);
        assertEquals(letter, this.mostRecentEvent.getActionCommand());
    }

    @Test
    void testLetterOnscreenButtonsRespondToPhysicalButtons() {
        SinglePressKeyboard keyboard = new SinglePressKeyboard(QWERTY, this);
        JFrame frame = new JFrame("For test purposes only");
        for (JButton button : keyboard.buttons) {
            String expected = button.getText();
            char ch = expected.charAt(0);
            KeyEvent event = new KeyEvent(frame, KeyEvent.KEY_PRESSED,
                    System.currentTimeMillis(), 0, ch, ch);
            keyboard.physKbdListen.keyPressed(event);
            assert this.mostRecentEvent != null
                    : "Most recent event should not be null at this point";
            String actual = this.mostRecentEvent.getActionCommand();
            String msg = "Pressing '" + expected
                    + "' key on physical keyboard should relay that key";
            assertEquals(expected, actual, msg);
        }
    }

}
