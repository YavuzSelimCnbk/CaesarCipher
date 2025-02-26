package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.example.EncrpytPage.encryptedMessage;

public class ResultPage implements ActionListener {

    JButton button;
    JFrame frame;
    public ResultPage()
    {
        frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel title = new JLabel("Metniniz şifrelendi");
        title.setFont(new Font("Tahoma", Font.BOLD, 20));
        titlePanel.add(title);
        frame.add(titlePanel);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel result = new JLabel();
        result.setFont(new Font("Arial", Font.PLAIN, 15));
        result.setText("Sonuç: "+ encryptedMessage);
        resultPanel.add(result);
        frame.add(resultPanel);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        button = new JButton("Tamam");
        button.setPreferredSize(new Dimension(100, 40));
        button.addActionListener(this);
        buttonPanel.add(button);
        frame.add(buttonPanel);


        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
        {
            frame.dispose();
        }
    }
}
