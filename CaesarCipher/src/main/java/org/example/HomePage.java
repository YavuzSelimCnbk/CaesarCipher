package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage implements ActionListener {

    JFrame frame;


    public HomePage()
    {
        JLabel questionLabel = new JLabel();
        questionLabel.setText("<html>Şifrelemek(encrpyt) mi yoksa<br>şifresini çözmek(decrpyt) mi istiyorsunuz?<html>");
        questionLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        JPanel questionPanel = new JPanel();
        questionPanel.setPreferredSize(new Dimension(400,150));
        questionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        questionPanel.add(questionLabel);

        JButton encryptButton = new JButton();
        encryptButton.setText("Encrypt");
        encryptButton.addActionListener(this);
        encryptButton.setPreferredSize(new Dimension(150,40));

        JButton decryptButton = new JButton();
        decryptButton.setText("Decrypt");
        decryptButton.addActionListener(this);
        decryptButton.setPreferredSize(new Dimension(150,40));

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2));
        buttonsPanel.add(encryptButton);
        buttonsPanel.add(decryptButton);



        frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        frame.add(questionPanel);
        frame.add(buttonsPanel);

        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
