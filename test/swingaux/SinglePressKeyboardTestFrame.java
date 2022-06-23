package swingaux;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class SinglePressKeyboardTestFrame extends JFrame
        implements ActionListener {

    public static final int DEFAULT_COLUMN_WIDTH = 20;

    private SinglePressKeyboard keyboard;

    private JTextField textField;

    @Override
    public void actionPerformed(ActionEvent ae) {
        //
    }

    public SinglePressKeyboardTestFrame() {
        super("Single Press Keyboard Test Frame");
        this.setLayout(new BorderLayout());
        this.textField = new JTextField(DEFAULT_COLUMN_WIDTH);
        this.textField.setEditable(false);
        this.add(this.textField, BorderLayout.PAGE_START);
        this.keyboard = new SinglePressKeyboard(this);
        this.add(this.keyboard, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame frame = new SinglePressKeyboardTestFrame();
        frame.pack();
        frame.setVisible(true);
    }

}
