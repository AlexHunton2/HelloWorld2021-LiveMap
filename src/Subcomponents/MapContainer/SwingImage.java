package Subcomponents.MapContainer;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class SwingImage
{
    public static void main(String args[]) throws Exception
    {
        Abc obj=new Abc();
    }
}

class Abc extends JFrame
{
    public Abc() throws Exception
    {

        setLayout(new FlowLayout());

        JLabel l1=new JLabel("Full Name:");
        JTextField t1=new JTextField();
        t1.setColumns(20);

        JLabel l2=new JLabel("Class:");
        JTextField t2=new JTextField();
        t2.setColumns(20);

        JLabel l3=new JLabel("College:");
        JTextField t3=new JTextField();
        t3.setColumns(20);

        JLabel l4=new JLabel("City");
        JTextField t4=new JTextField();
        t4.setColumns(20);

        JButton b1=new JButton("Submit");
        JButton b2=new JButton("Reset");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(b2);

        BufferedImage myPicture = ImageIO.read(new File("purduemap.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        add(picLabel);

        setVisible(true);
        setSize(250,400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 