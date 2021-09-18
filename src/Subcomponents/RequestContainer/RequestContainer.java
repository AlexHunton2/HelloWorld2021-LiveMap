package Subcomponents.RequestContainer;

import javax.swing.*;
import java.awt.*;

public class RequestContainer  extends JFrame {
    public RequestContainer() {
        super();
        JLabel requestText = new JLabel("Request!");
        this.add(requestText);
    }
    public static void openRequest() {
    //Window build-up
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
        //set grid layout
        frame.setLayout(new GridLayout(1, 1));
    //Input bars build-up
        JTextField messageIn = new JTextField("Please enter your event info");
        JTextField locationIn = new JTextField("Please enter your location of event");
        frame.add(messageIn);
        frame.add(locationIn);
    //Submit button!
        JButton submitBut = new JButton("Submit!");
        frame.add(submitBut);
    }
}
