import javax.swing.*;
import Subcomponents.MapContainer.MapContainer;
import Subcomponents.RequestContainer.RequestContainer;
import Subcomponents.UIContainer.UIContainer;

import java.awt.*;

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
        //display window
        frame.pack();
        frame.setVisible(true);
        //set size
        frame.setSize(WIDTH, HEIGHT);
        //set grid layout
        frame.setLayout(new GridLayout(1, 1));

        MapContainer mapContainer = new MapContainer();
        UIContainer uiContainer = new UIContainer();
        JButton button = new JButton("Submit Request");

        frame.getContentPane().add(uiContainer);
        frame.getContentPane().add(mapContainer);
        frame.add(button);
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
