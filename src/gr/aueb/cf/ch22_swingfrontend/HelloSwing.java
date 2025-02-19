package gr.aueb.cf.ch22_swingfrontend;

import javax.swing.*;

public class HelloSwing {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("First Swing App");
        jFrame.setSize(600, 300);
        jFrame.setLocationRelativeTo(null);     // aligns to the center of the screen
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        jFrame.setContentPane(contentPane);

        contentPane.add(new JLabel("Hello World"));
        jFrame.setVisible(true);
    }
}
