package igrica;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.RenderingHints;
import java.awt.Window;

import javax.swing.JFrame;

public class Screen extends JFrame {

    private GraphicsDevice grafulja;

    public Screen() {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        grafulja = env.getDefaultScreenDevice();


    }

    public void setFullScren(DisplayMode dm, JFrame window) {
        window.setUndecorated(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grafulja.setFullScreenWindow(window);

        if (dm != null && grafulja.isDisplayChangeSupported()) {
            try {
                grafulja.setDisplayMode(dm);
            } catch (Exception e) {
            }
        }
    }

    public Window getFullScreenWindow() {
        return grafulja.getFullScreenWindow();
    }

    public void restoreScreen() {
        Window w = grafulja.getFullScreenWindow();
        if (w != null) {
            w.dispose();
        }
        grafulja.setFullScreenWindow(null);


    }

    public static void main(String[] args) {
        DisplayMode dm = new DisplayMode(1366, 768, 16, DisplayMode.REFRESH_RATE_UNKNOWN);

        Screen b = new Screen();

        b.run(dm);



    }

    public void run(DisplayMode dm) {
        setBackground(Color.PINK);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.PLAIN, 24));

        Screen s = new Screen();

        try {
            s.setFullScren(dm, this);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
        } finally {
            s.restoreScreen();


        }

    }

    public void paint(Graphics g) {

        if (g instanceof Graphics2D) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        }
        g.drawString("�uja je zakon, mo� mislit", 200, 200);
        g.drawLine(200, 200, 600, 600);
        g.drawArc(15, 45, 1200, 400, 255, 45);
        g.draw3DRect(600, 500, 100, 100, false);

    }
}
