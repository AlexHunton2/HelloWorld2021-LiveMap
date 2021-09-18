package Subcomponents.RequestContainer;

import javax.swing.*;

public class RequestContainer  extends JFrame {
    public RequestContainer() {
        super();
        JLabel requestText = new JLabel("Request!");
        this.add(requestText);
    }
    public static void openRequest() {
        //basic appearance
        JFrame.setDefaultLookAndFeelDecorated(true);
        //build and set window
        JFrame frame = new JFrame("LiveMap Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //display window
        frame.pack();
        frame.setVisible(true);
        //set size
        frame.setSize(600,400);
    }
}
