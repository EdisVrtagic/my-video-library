package com.edisvrtagicipia.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Klasa detaljnijeg pregleda filmova koja nasljedjuje JFrame
//Sve sto je na public, tome pristupam iz drugih funkcija
public class FilmD extends JFrame {
    public JPanel filmPanel;
    public JLabel nazivFilma;
    public JLabel slikaFilma;
    private JButton nazadBtn;
    private JButton zatvoriBtn;
    public JLabel descFilma;
    //Funkcija za opis filmova,naziv,sliku...
    public FilmD()
    {
        //Sve se takodjer dodaje na panel da bi bilo vidljivo
        add(filmPanel);
        setSize(1000,550);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Listener za vracanje na formu liste filmova
        nazadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImgF vn = new ImgF();
                vn.setVisible(true);
                vn.setLocationRelativeTo(null);
                dispose();
            }
        });
        //Listener za zatvaranje aplikacije
        zatvoriBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}
