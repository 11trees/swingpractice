package pers.landi.swingpractice.chapter1;

import pers.landi.swingpractice.util.SwingConsole;

import javax.swing.*;

public class SubmitSwingProgram extends JFrame {
    JLabel label;

    public SubmitSwingProgram() {
        super("Hello Swing");
        label = new JLabel("A Label");
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    static SubmitSwingProgram ssp;

    public static void main(String[] args) throws Exception {
        ssp = new SubmitSwingProgram();
        SwingConsole.run(ssp, 300, 100);
        Thread.sleep(5000);
        SwingUtilities.invokeLater(() -> ssp.label.setText("Hey! This is Different!"));
    }
}
