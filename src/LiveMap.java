import javax.swing.*;
import Subcomponents.MapContainer.MapContainer;
import Subcomponents.RequestContainer.RequestContainer;
import Subcomponents.UIContainer.UIContainer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
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
        JFrame mainFrame = new JFrame("Purdue LiveMap");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //display window
        mainFrame.pack();
        mainFrame.setVisible(true);
        //set size
        mainFrame.setSize(WIDTH, HEIGHT);
        //set grid layout
    /*
        mainFrame.setLayout(new GridLayout(1, 1));
    */
        //initializing
        MapContainer mapContainer = new MapContainer();
        UIContainer uiContainer = new UIContainer();
        JButton button = new JButton("Submit Request");

        //divide the window into panels
        JPanel ui = new JPanel();
        JPanel map = new JPanel();
        //setting panel borders
        ui.setSize(320, 720);
        map.setSize(960, 720);
        ui.setBackground(Color.LIGHT_GRAY);

        mainFrame.add(ui);
        mainFrame.add(map);
        //setting button size
        Dimension size = button.getPreferredSize();
        button.setBounds(0, 0, 100, 30);
        //setting button action
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RequestContainer.openRequest();
            }
        }
        );

        //putting items into panels
        ui.add(button);
        ui.add(uiContainer);
        map.add(mapContainer);

    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createWindow();
            }
        });

    }
}