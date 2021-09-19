import Subcomponents.APIRequest.APIAccessor;
import Subcomponents.MapContainer.MapContainer;
import Subcomponents.UIContainer.UIContainer;

import javax.swing.*;
import java.awt.*;

/**
 *
 *
 */

public class AlexTestLiveMap {
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

        frame.getContentPane().add(uiContainer);
        frame.getContentPane().add(mapContainer);

    }

    public static void main(String[] args) {
        /*
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createWindow();
            }
        });
         */

        APIAccessor api = new APIAccessor();
        try {
            String msg = api.insertEvent("clubs", "Testing!", "Somewhere!", 10022002);
            System.out.println(api.getEvents("clubs"));
            System.out.println(msg);
        } catch (Exception e) {
            System.out.println("JSON Error :(");
            System.out.println(e.getMessage());
        }

    }
}
