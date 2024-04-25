import java.applet.Applet;
import java.awt.Graphics;

public class LifecycleApplet extends Applet implements Runnable {
    private Thread animationThread;
    private int x = 20;
    private boolean running = false;

    public void init() {
        // Initialize objects
        System.out.println("Initializing...");
    }

    public void start() {
        // Start the applet code
        System.out.println("Starting...");
        if (animationThread == null) {
            animationThread = new Thread(this);
            running = true;
            animationThread.start();
        }
    }

    public void paint(Graphics g) {
        // Draw a moving circle
        g.clearRect(0, 0, getWidth(), getHeight());
        g.fillOval(x, 50, 50, 50);
    }

    public void run() {
        while (running) {
            x += 5;
            if (x > getWidth()) {
                x = 0;
            }
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        // Stop the applet code
        System.out.println("Stopping...");
        running = false;
    }

    public void destroy() {
        // Destroy the applet code
        System.out.println("Destroying...");
    }
}
