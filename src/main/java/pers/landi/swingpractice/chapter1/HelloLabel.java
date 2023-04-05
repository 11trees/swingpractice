package pers.landi.swingpractice.chapter1;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HelloLabel {
    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame("Hello Swing");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);

        TimeUnit.SECONDS.sleep(5);
        frame.add(new JLabel("label1"));
        TimeUnit.SECONDS.sleep(5);
        frame.add(new JLabel("label2"));

//        label.setText("Hey! This is Different!");
    }
}
