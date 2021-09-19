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
    private static final String NAME_MESSAGE = "Please enter the name of event";
    private static final String MESSAGE_MESSAGE = "Please enter your event info";
    private static final String LOCATION_MESSAGE = "Please enter the location of event";
    private static final String START_DATE_MESSAGE = "Please enter the date when the event starts";
    private static final String END_DATE_MESSAGE = "Please enter the date when the event ends";
    private static final String TYPE_MESSAGE = "Please choose you event type";
    public static void openRequest() {
    //Window build-up
        //basic appearance
        JFrame.setDefaultLookAndFeelDecorated(true);
        //build and set window
        JFrame requestFrame = new JFrame("Event Submission");
        requestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //display window
        requestFrame.pack();
        requestFrame.setVisible(true);
        //set size
        requestFrame.setSize(600,800);
        //set grid layout
        requestFrame.setLayout(new GridLayout(7, 1));
    //Event type selection bar build-up
        String[] choices = {TYPE_MESSAGE, "Career", "Party", "Club"};
        JComboBox<String> eventTypeIn = new JComboBox<String>(choices);
        eventTypeIn.setVisible(true);
    //Input bars build-up

        JTextField nameIn = new JTextField(NAME_MESSAGE);
        JTextField messageIn = new JTextField(MESSAGE_MESSAGE);
        JTextField locationIn = new JTextField(LOCATION_MESSAGE);
        JTextField startDateIn = new JTextField(START_DATE_MESSAGE);
        JTextField endDateIn = new JTextField(END_DATE_MESSAGE);

    //Submit button!
        JPanel submitPanel = new JPanel();
        JButton submitBut = new JButton("Submit!");
        submitPanel.add(submitBut);
        //Button function setting
        submitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name, eventType, message, location, startDate, endDate;
                name = nameIn.getText();
                eventType = String.valueOf(eventTypeIn.getSelectedItem());
                message = messageIn.getText();
                location = locationIn.getText();
                startDate = startDateIn.getText();
                endDate = endDateIn.getText();
                if(name.equals(NAME_MESSAGE) && eventType.equals(TYPE_MESSAGE) && message.equals(MESSAGE_MESSAGE)
                    && location.equals(LOCATION_MESSAGE) && startDate.equals(START_DATE_MESSAGE)
                    && endDate.equals(END_DATE_MESSAGE)) {
                    requestFrame.dispose();
                } else {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    //build and set window
                    JFrame error = new JFrame("Event Submission");
                    error.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    //display window
                    error.pack();
                    error.setVisible(true);
                    //set size
                    error.setSize(350,125);
                    //set layout
                    error.setLayout(new GridLayout(2, 1));
                    //set up massage
                    JPanel errorMessagePan = new JPanel();
                    JLabel errorMessage = new JLabel("Please complete the form before submission!");
                    errorMessagePan.add(errorMessage);
                    //set up confirm button
                    JPanel errorConfirmPan = new JPanel();
                    JButton errorConfirmBut = new JButton("Confirm");
                    errorConfirmPan.add(errorConfirmBut);
                    //display
                    error.add(errorMessagePan);
                    error.add(errorConfirmPan);
                    errorConfirmBut.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            error.dispose();
                        }
                    });
                }
            }
        }
        );
        //place labels in sequence
        requestFrame.add(nameIn);
        requestFrame.add(eventTypeIn);
        requestFrame.add(messageIn);
        requestFrame.add(locationIn);
        requestFrame.add(startDateIn);
        requestFrame.add(endDateIn);
        requestFrame.add(submitPanel);
    }
}
