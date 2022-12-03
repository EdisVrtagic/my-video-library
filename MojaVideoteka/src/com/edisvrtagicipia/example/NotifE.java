package com.edisvrtagicipia.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Klasa notifikacija koja nasljedjuje JFrame
public class NotifE extends JFrame {
    private JPanel notifPanel;
    private JButton zatvoriBtn;
    private JButton pokusajBtn;
    public NotifE()
    {
        //Sve dodajem na panel
        add(notifPanel);
        setSize(586,160);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Listener za zatvaranje aplikacije
        zatvoriBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        //Listener za vracanje na login formu
        pokusajBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginF vlog = new LoginF();
                vlog.setVisible(true);
                vlog.setLocationRelativeTo(null);
                dispose();
            }
        });
    }
}
