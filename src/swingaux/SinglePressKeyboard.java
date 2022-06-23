package swingaux;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public final class SinglePressKeyboard extends JPanel
        implements ActionListener {

    public static final String QWERTY_LETTER_KEYS
            = "QWERTYUIOP\nASDFGHJKL\nZXCVBNM";

    List<JButton> buttons = new ArrayList<>();

    private final ActionListener actListen;

    public void reset() {
        //
    }

    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand()); // TODO: Delete this line after all tests pass
        System.out.println(ae.getModifiers()); // TODO: Delete this line after all tests pass
        System.out.println(ae.getSource()); // TODO: Delete this line after all tests pass
        ActionEvent event = new ActionEvent(this, ae.getID(),
                ae.getActionCommand(), ae.getWhen(), ae.getModifiers());
        this.actListen.actionPerformed(event);
    }

    private JButton makeButton(char ch) {
        String letter = Character.toString(ch);
        JButton button = new JButton(letter);
        button.setMnemonic(ch);
        button.addActionListener(this);
        this.buttons.add(button);
        return button;
    }

    private void addButtons(String keys) {
        char[] characters = keys.toCharArray();
        for (char ch : characters) {
            if (ch != '\n') {
                this.add(this.makeButton(ch));
            }
        }
    }

    public SinglePressKeyboard(ActionListener listener) {
        this(QWERTY_LETTER_KEYS, listener);
    }

    public SinglePressKeyboard(String keys, ActionListener listener) {
        super(new GridLayout(3, 12));
        this.addButtons(keys);
        this.actListen = listener;
    }

}
