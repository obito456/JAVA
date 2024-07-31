import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Solution {
    public static void main(String[] args){

        ImageIcon icon=new ImageIcon("dog1.png");

        JLabel label=new JLabel();
        label.setText("hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);
        redpanel.setLayout(null);

        JPanel bluepanel=new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);
        bluepanel.setLayout(null);

        JPanel greenpanel=new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);
        greenpanel.setLayout(null);

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        greenpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);

    }  
}
