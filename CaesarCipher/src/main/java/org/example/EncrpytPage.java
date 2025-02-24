package org.example;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EncrpytPage implements ActionListener {


    JFrame frame;
    JTextField keyField;
    JTextField valueField;
    JButton encrpytButton;


    public EncrpytPage() {
        JLabel title = new JLabel("Şifreleme(Encrpyt)");






        JLabel keyLabel = new JLabel("Key(Anahtar)");

        keyLabel.setBorder(new LineBorder(Color.BLACK, 1,true));

        keyField = new JTextField();



        JPanel keyPanel = new JPanel();
        keyPanel.setLayout(new GridLayout(1,2));
        keyPanel.add(keyLabel);
        keyPanel.add(keyField);


        JLabel messageLabel = new JLabel("Mesaj");
        messageLabel.setBorder(new LineBorder(Color.BLACK, 1,true));
        valueField = new JTextField();


        JPanel messagePanel = new JPanel();
        messagePanel.setLayout(new GridLayout(1,2));
        messagePanel.add(messageLabel);
        messagePanel.add(valueField);


        encrpytButton = new JButton("Şifrele");
        encrpytButton.addActionListener(this);
        encrpytButton.setPreferredSize(new Dimension(100,30));
        encrpytButton.setBorder(new LineBorder(Color.BLACK, 1,true));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(encrpytButton);



        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(4,1));

        frame.add(title);
        frame.add(keyPanel);
        frame.add(messagePanel);
        frame.add(buttonPanel);

        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == encrpytButton) {
            String key = keyField.getText();
            String value = valueField.getText();
        }
    }

}

