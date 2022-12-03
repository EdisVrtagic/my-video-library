package com.edisvrtagicipia.example;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Klasa Welecome koja nasljedjuje JFrame
public class WelcF extends JFrame {
    private JButton closeBtn;
    private JButton nextBtn;
    private JPanel WPanel;
    //Stavio sam na public da mogu pristupiti iz neke druge klase labelu i slicno...
    public JLabel welcText;

    public WelcF()
    {
        //Panel na koji se sve dodaje da bi bilo vidljivo
        add(WPanel);
        setSize(310,160);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Listener closeBtn kada se klikne on zatvara aplikaciju u potpunosti
        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
        //Listener nextBtn prebacuje me na sljedecu formu tj. listu filmova
        nextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImgF mig = new ImgF();
                mig.setVisible(true);
                mig.setLocationRelativeTo(null);
                dispose();
            }
        });
    }
}
