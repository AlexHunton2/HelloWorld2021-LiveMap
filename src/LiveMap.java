import javax.swing.*;

/**
 *
 *
 */

public class LiveMap {

    private static void createWindow() {
        //basic appearance
        JFrame.setDefaultLookAndFeelDecorated(true);
        //build and set window
        JFrame frame = new JFrame("LiveMap Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        JLabel label = new JLabel("Hi");
        frame.getContentPane().add(label);
        //display window
        frame.pack();
        frame.setVisible(true);
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
