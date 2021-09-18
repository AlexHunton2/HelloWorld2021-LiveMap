package Subcomponents.RequestContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    //Event type selection bar build-up
        JPanel eventTypeIn = new JPanel();
        String[] choices = {"Please choose you event type", "Food", "Career", "Party", "Club"};
        JComboBox<String> selectoinBar = new JComboBox<String>(choices);
        selectoinBar.setVisible(true);
        eventTypeIn.add(selectoinBar);
    //Input bars build-up
        JTextField nameIn = new JTextField("Please enter the name of event");
        JTextField messageIn = new JTextField("Please enter your event info");
        JTextField locationIn = new JTextField("Please enter your location of event");
        JTextField startDateIn = new JTextField("Please enter the date when your event starts");
        JTextField endDateIn = new JTextField("Please enter the date when your event ends");
    //place labels in sequence
        frame.add(nameIn);
        frame.add(eventTypeIn);
        frame.add(messageIn);
        frame.add(locationIn);
        frame.add(startDateIn);
        frame.add(endDateIn);
    //Submit button!
        JButton submitBut = new JButton("Submit!");
        //Button function setting
        submitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name, eventType, message, location, startDate, endDate;
                name = nameIn.getText();
                eventType = String.valueOf(selectoinBar.getSelectedItem());
                message = messageIn.getText();
                location = locationIn.getText();
                startDate = startDateIn.getText();
                endDate = endDateIn.getText();
            }
        }
        );
        frame.add(submitBut);
    }
}
