import javax.swing.*;

/**
 *
 *
 */

public class LiveMap {
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;

    private static void createWindow() {
        //basic appearance
        JFrame.setDefaultLookAndFeelDecorated(true);
        //build and set window
        JFrame frame = new JFrame("LiveMap Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hi");
        frame.getContentPane().add(label);
        //display window
        frame.pack();
        frame.setVisible(true);
        //set size
        frame.setSize(WIDTH, HEIGHT);
    }

    public static void main(String args[]) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createWindow();
            }
        });

    }
}
