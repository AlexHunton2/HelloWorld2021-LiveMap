package Subcomponents.UIContainer;

import javax.swing.*;

public class UIContainer  extends JPanel {
    public UIContainer() {
        super();
        JLabel uiText = new JLabel("UI!");
        JButton button1 = new JButton("Club");
        JButton button2 = new JButton("Career");
        JButton button3 = new JButton("Party");
        this.add(uiText);
        this.add(button1);
        this.add(button2);
        this.add(button3);

    }



}