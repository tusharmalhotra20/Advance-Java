/*
 * Applet with User Interaction:
 * Create an applet that takes a user’s name as input from a text field and displays a 
 * personalized greeting message when a button is clicked.
 * Hint: Use TextField, Button, and implement ActionListener.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("removal")

public class GreetingApplet extends Applet implements ActionListener {
    TextField nameField;
    Button greetButton;
    Label greetingLabel;

    public void init() {
        // Set the layout to null for absolute positioning
        setLayout(null);

        // Create the text field for input
        nameField = new TextField();
        nameField.setBounds(50, 30, 150, 20);
        add(nameField);

        // Create the button
        greetButton = new Button("Greet");
        greetButton.setBounds(220, 30, 50, 20);
        add(greetButton);

        // Add action listener to the button
        greetButton.addActionListener(this);

        // Create the label for displaying the greeting message
        greetingLabel = new Label();
        greetingLabel.setBounds(50, 70, 300, 20);
        add(greetingLabel);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the name entered by the user
        String name = nameField.getText();

        // Set the greeting message in the label
        greetingLabel.setText("Hello, " + name + "!");
    }

    public void paint(Graphics g) {
        // No custom painting required for this example
    }

}
/*
 * <applet code="GreetingApplet" width="600" height="300" ></applet>
 */