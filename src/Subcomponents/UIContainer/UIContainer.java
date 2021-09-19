package Subcomponents.UIContainer;

import javax.swing.*;


public class UIContainer  extends JPanel {
    public UIContainer() {
        super();
        JLabel label = new JLabel("Event categories");
        Icon YellowIcon = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/club.png");
        JButton button1 = new JButton(YellowIcon);
        Icon OrangeIcon = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/career.png");
        JButton button2 = new JButton(OrangeIcon);
        Icon RedIcon = new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/UIContainer/party.png");
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