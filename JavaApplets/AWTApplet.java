import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTApplet extends Applet implements ActionListener {
    TextField textField;
    Button button;
    Label label;

    public void init() {
        textField = new TextField(20);
        button = new Button("Click Me");
        label = new Label("Result will be displayed here");

        add(textField);
        add(button);
        add(label);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        label.setText("You entered: " + text);
    }
}
// <applet code="AWTApplet" height=300 width=200 ></applet>