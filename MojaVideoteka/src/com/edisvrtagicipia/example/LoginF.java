package com.edisvrtagicipia.example;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Klasa Login koja nasljedjuje JFrame
public class LoginF extends JFrame {
    private JPanel loginpanel;
    private JTextField usernBox;
    private JTextField passBox;
    private JButton loginBtn;
    private JLabel imLog;
    ImageIcon logA = new ImageIcon("logad.png");
    //Funkcija Login
    public LoginF()
    {
        //Panel na koji se sve dodaje da bi bilo vidljivo
        add(loginpanel);
        setSize(360,330);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        imLog.setIcon(logA);
        //Listener za login button
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //If statement za korisnicko ime i password
                //Equals je dodan da uporedi dva niza i vrati true ako su stringovi jednaki i false ako nisu
                if(usernBox.getText().equals("admin") && passBox.getText().equals("123"))
                {
                    WelcF w1 = new WelcF();
                    //Setam tekst na formu welcome iz koda + tekst koji je unesen na username textFieldu u ovom slučaju admin
                    w1.welcText.setText("Dobrodošli "+usernBox.getText());
                    w1.setVisible(true);
                    //Ovaj dio je za centriranje prozora aplikacije na ekranu
                    w1.setLocationRelativeTo(null);
                    //Dispose za vidljivost trenutne forme
                    dispose();
                }
                else
                {
                    NotifE no = new NotifE();
                    no.setVisible(true);
                    no.setLocationRelativeTo(null);
                    dispose();
                }
            }
        });
    }
}
