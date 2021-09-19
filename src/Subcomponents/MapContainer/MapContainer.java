package Subcomponents.MapContainer;

import javax.swing.*;


public class MapContainer extends JPanel {
    public MapContainer() {
        super();
        JLabel mapImage1 = new JLabel(new ImageIcon("../HelloWorld2021-LiveMap/src/Subcomponents/MapContainer/purduemap.jpg"));
        this.add(mapImage1);
    }

}
