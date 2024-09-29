package Tp1.Exercice2;

import javax.swing.*;
import java.awt.*;

public class Horloge extends JLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Horloge Graphique");
        JPanel panel= new JPanel();
        JLabel notif = new JLabel();
        Font font =new Font("Verdana", Font.BOLD,82);
        notif.setFont(font);
        frame.setSize(320, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        panel.add(notif);
        frame.add(panel);
        HorlogeGraphique hg=new HorlogeGraphique(notif);
        hg.start();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}


