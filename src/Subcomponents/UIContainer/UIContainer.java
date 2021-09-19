package Subcomponents.UIContainer;

import Subcomponents.RequestContainer.RequestContainer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIContainer  extends JPanel {
    public UIContainer() {
        super();
        Icon TitleIcon = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/TitleIcon.jpg");
        JLabel label = new JLabel(TitleIcon);
        Icon ClubIcon = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/ClubIcon.jpg");
        Icon ClubIcon2 = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/ClubIcon2.jpg");
        JButton button1 = new JButton(ClubIcon);
        //setting button action
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button1.getIcon() == ClubIcon) {
                    button1.setIcon(ClubIcon2);
                } else {
                    button1.setIcon(ClubIcon);
                }
            }
        }
        );
        Icon CareerIcon = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/CareerIcon.jpg");
        Icon CareerIcon2 = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/CareerIcon2.jpg");
        JButton button2 = new JButton(CareerIcon);
        //setting button action
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button2.getIcon() == CareerIcon) {
                    button2.setIcon(CareerIcon2);
                } else {
                    button2.setIcon(CareerIcon);
                }
            }
        }
        );
        Icon PartyIcon = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/PartyIcon.jpg");
        Icon PartyIcon2 = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/PartyIcon2.jpg");
        JButton button3 = new JButton(PartyIcon);
        //setting button action
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button3.getIcon() == PartyIcon) {
                    button3.setIcon(PartyIcon2);
                } else {
                    button3.setIcon(PartyIcon);
                }
            }
        }
        );

        Box box = Box.createVerticalBox();
        box.add(label);
        box.add(Box.createVerticalStrut(10));
        box.add(button1);
        box.add(Box.createVerticalStrut(10));
        box.add(button2);
        box.add(Box.createVerticalStrut(10));
        box.add(button3);
        box.add(Box.createVerticalStrut(10));
        add(box);

    }



}