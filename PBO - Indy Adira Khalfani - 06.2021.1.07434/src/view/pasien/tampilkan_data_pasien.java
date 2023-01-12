package view.pasien;

import view.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tampilkan_data_pasien extends JFrame
{

    public JPanel panel;
    private JLabel judul;
    private JTextPane panel_isian;
    private JButton exitButton;

    public tampilkan_data_pasien() {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        area_teks();
        tombol_keluar();
    }
    private void judul()
    {
        judul = new JLabel("Aplikasi Pendaftaran Pasien Rumah Sakit");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        judul.setBounds(X,y,width,height);

        add(judul);
    }
    public void area_teks()
    {
        panel_isian = new JTextPane();
        panel_isian.setText(informasi_data());
        panel_isian.setBounds(30,90,300,200);
        add(panel_isian);
    }
    public String informasi_data()
    {
        String Text = "nama  = " + object_deklarasi.Controller_Pasien.mendapat_nama()+ "\n" + "Email = " + object_deklarasi.Controller_Pasien.mendapat_email()+"\n"+ "alamat = " + object_deklarasi.Controller_Pasien.mendapat_alamat()+"\n"+"verifikasi = "+ object_deklarasi.Controller_Pasien.mendapat_verifikasi();
        return Text;
    }

    public void tombol_keluar()
    {
        exitButton = new JButton("exit");
        exitButton.setBounds(350,  250,100,30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilihan_menu_pasien gui_pilihan_menu_pasien = new pilihan_menu_pasien();
                gui_pilihan_menu_pasien.setVisible(true);
            }
        });
        add(exitButton);
    }
}
