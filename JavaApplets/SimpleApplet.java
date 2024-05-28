/*
 * Write a simple applet program to show the lifecycle of an applet.
 */
import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class SimpleApplet extends Applet {
    String message;

    // The init method is called once when the applet is first loaded.
    public void init() {
        message = "Applet initialized.";
        System.out.println("init() called");
    }

    // The start method is called each time the applet is started.
    public void start() {
        message = "Applet started.";
        System.out.println("start() called");
        repaint();
    }

    // The paint method is called to render the applet's output.
    public void paint(Graphics g) {
        System.out.println("paint() called");
        g.drawString(message, 20, 20);
    }

    // The stop method is called when the applet is stopped.
    public void stop() {
        message = "Applet stopped.";
        System.out.println("stop() called");
        repaint();
    }

    // The destroy method is called when the applet is destroyed.
    public void destroy() {
        message = "Applet destroyed.";
        System.out.println("destroy() called");
    }
}
// <applet code="SimpleApplet" height="300" width="500"></applet>