/*
 * Basic Applet Structure:
 * Write a simple applet that displays the message "Hello, World!" in the center of the applet 
 * window.
 * Hint: Use the paint method and the Graphics class to draw the string.
 */

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 150, 100);
    }
}
/*
 * <applet code="HelloWorldApplet" width="350" height="200">
 * </applet>
 */