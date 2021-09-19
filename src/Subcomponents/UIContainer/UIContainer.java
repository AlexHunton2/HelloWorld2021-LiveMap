package Subcomponents.UIContainer;

import javax.swing.*;

public class UIContainer  extends JPanel {
    public UIContainer() {
        super();
        JLabel label = new JLabel("Event categories");
        Icon YellowIcon = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/ClubIcon.jpg");
        JButton button1 = new JButton(YellowIcon);
        Icon OrangeIcon = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/CareerIcon.jpg");
        JButton button2 = new JButton(OrangeIcon);
        Icon RedIcon = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/PartyIcon.jpg");
        JButton button3 = new JButton(RedIcon);

        Box box = Box.createVerticalBox();
        box.add(button1);
        box.add(Box.createVerticalStrut(10));
        box.add(button2);
        box.add(Box.createVerticalStrut(10));
        box.add(button3);
        box.add(Box.createVerticalStrut(10));
        add(box);
        add(label);

    }



}