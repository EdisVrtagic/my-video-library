package com.edisvrtagicipia.example;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//Klasa liste filmova sa slikama koja nasljedjuje JFrame
public class ImgF extends JFrame {
    private JPanel imPanel;
    private JLabel im1;
    private JLabel im2;
    private JLabel im3;
    private JLabel im4;
    private JLabel im5;
    private JLabel im6;
    //Slike filmova koje se nalaze u folderu projekta
    ImageIcon tulsa = new ImageIcon("tking.png");
    ImageIcon ambulance = new ImageIcon("amb.png");
    ImageIcon blackadam = new ImageIcon("badam.png");
    ImageIcon blackcrab = new ImageIcon("bcrab.png");
    ImageIcon tcontractor = new ImageIcon("tcontr.png");
    ImageIcon tenforcer = new ImageIcon("tenf.png");
    //Funkcija liste filmova
    public ImgF()
    {
        //Sve se dodaje na panel kao i u prethodnim funkcijama
        add(imPanel);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Setovanje slika na labele
        im1.setIcon(tulsa);
        im2.setIcon(ambulance);
        im3.setIcon(blackadam);
        im4.setIcon(blackcrab);
        im5.setIcon(tcontractor);
        im6.setIcon(tenforcer);
        //Listener na klik misa za prvu sliku
        im1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //Sve ono sto prosljedjujem na formu za ime filma,sliku,deskripciju...
                //Dio html koda sluzi za prelazak u novi red teksta na labelu
                String tulsaime = "Tulsa King";
                String tulsadesc = "<html>Tulsa King je američka kriminalistička dramska televizijska serija koju je kreirao Taylor Sheridan s Terenceom Winterom koji vodi Paramount+.<br>U seriji glumi Sylvester Stallone, što je njegova prva glavna uloga u televizijskoj seriji po scenariju.<br>Stallone glumi mafijaškog kapoa koji je upravo izašao iz zatvora i poslan u Tulsu u Oklahomi, gdje pokušava osnovati kriminalnu organizaciju.</br></html>";
                FilmD tudes = new FilmD();
                tudes.setVisible(true);
                tudes.setLocationRelativeTo(null);
                tudes.nazivFilma.setText(tulsaime);
                tudes.descFilma.setText(tulsadesc);
                tudes.slikaFilma.setIcon(tulsa);
                dispose();
            }
        });
        //Listener na klik misa za drugu sliku
        im2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String ambulanceime = "Ambulance";
                String ambdesc = "<html>Hitna pomoć je američki akcioni triler iz 2022. u režiji i produkciji Michaela Baya.<br> Koprodukcija između New Republic Pictures, Project X Entertainment i Bay Films<br>bazirana je na istoimenom danskom filmu Lauritsa Munch-Petersena i Larsa Andreasa Pedersena iz 2005. godine.<br>U glavnim ulogama su Jake Gyllenhaal, Yahya Abdul-Mateen II i Eiza González i prati dvoje usvojene braće i sestara (Gyllenhaal i Abdul-Mateen) <br>koji su postali pljačkaši banaka koji otimaju vozilo hitne pomoći i uzimaju dva prva pomoćnika za taoce.</br></html>";
                FilmD amdes = new FilmD();
                amdes.setVisible(true);
                amdes.setLocationRelativeTo(null);
                amdes.nazivFilma.setText(ambulanceime);
                amdes.descFilma.setText(ambdesc);
                amdes.slikaFilma.setIcon(ambulance);
                dispose();
            }
        });
        //Listener na klik misa za trecu sliku
        im3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String blackadamime = "Black Adam";
                String badesc = "<html>Crni Adam je američki superherojski film iz 2022. u kojem glumi Dwayne Johnson kao naslovni lik iz DC Comicsa.<br>Film je spin-off za Shazam! (2019) i jedanaesti film u DC Extended Universe (DCEU). <br>Režirao ga je Jaume Collet-Serra, scenarij su napisali Adam Sztykiel, Rory Haines i Sohrab Noshirvani, a producirao Johnson.</br></html>";
                FilmD addes = new FilmD();
                addes.setVisible(true);
                addes.setLocationRelativeTo(null);
                addes.nazivFilma.setText(blackadamime);
                addes.descFilma.setText(badesc);
                addes.slikaFilma.setIcon(blackadam);
                dispose();
            }
        });
        //Listener na klik misa za cetvrtu sliku
        im4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String blackcrabime = "Black Crab";
                String bcdesc = "<html>Crni rak je švedski akcioni triler iz 2022. godine u režiji Adama Berga, a po scenariju Adama Berga i Pellea Rådströma.<br> U njemu glume Noomi Rapace, Aliette Opheim i Dar Salim. Radi se o brzom klizaču (Rapace) regrutovanom da se pridruži <br>timu vojnika za opasnu misiju klizanja po morskom ledu iza neprijateljskih linija.<br>Tim ima zadatak da isporuči tajni paket u ostrvsku istraživačku bazu, za koju im je rečeno da može okončati rat.</br></html>";
                FilmD bccdes = new FilmD();
                bccdes.setVisible(true);
                bccdes.setLocationRelativeTo(null);
                bccdes.nazivFilma.setText(blackcrabime);
                bccdes.descFilma.setText(bcdesc);
                bccdes.slikaFilma.setIcon(blackcrab);
                dispose();
            }
        });
        //Listener na klik misa za petu sliku
        im5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String contractorime = "The Contractor";
                String condesc = "<html>Izvođač je američki akcioni triler iz 2022. godine u režiji Tarika Saleha u svom filmskom debiju na engleskom jeziku.<br> U filmu glume Chris Pine, Ben Foster, Gillian Jacobs, Eddie Marsan, J. D. Pardo, Florian Munteanu i Kiefer Sutherland. <br>Snimanje je počelo u Evropi, uključujući Fort Bragg u oktobru 2019., a snimanje je završeno krajem 2019.</br></html>";
                FilmD ccdes = new FilmD();
                ccdes.setVisible(true);
                ccdes.setLocationRelativeTo(null);
                ccdes.nazivFilma.setText(contractorime);
                ccdes.descFilma.setText(condesc);
                ccdes.slikaFilma.setIcon(tcontractor);
                dispose();
            }
        });
        //Listener na klik misa za sestu sliku
        im6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String enforcerime = "The Enforcer";
                String endesc = "<html>The Enforcer je američki akcioni triler iz 2022. u režiji Richarda Hughesa, u kojem glume Antonio Banderas, Kate Bosworth i Mojean Aria.</html>";
                FilmD edes = new FilmD();
                edes.setVisible(true);
                edes.setLocationRelativeTo(null);
                edes.nazivFilma.setText(enforcerime);
                edes.descFilma.setText(endesc);
                edes.slikaFilma.setIcon(tenforcer);
                dispose();
            }
        });
    }
}
