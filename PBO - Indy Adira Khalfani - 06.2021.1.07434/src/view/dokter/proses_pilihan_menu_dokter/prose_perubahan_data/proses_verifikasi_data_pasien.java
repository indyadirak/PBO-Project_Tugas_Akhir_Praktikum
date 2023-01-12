package view.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import view.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proses_verifikasi_data_pasien extends JFrame{
    private JTextField input_email;
    private JLabel judul;
    private JLabel judul_email;
    private JLabel judul_verifikasi_data;

    private JButton tombol_selesai;
    public JPanel panel;

    public proses_verifikasi_data_pasien() {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
    judul();
    judul_input_email();
    input_email();
    tombol_selesai();
    }

    public void judul()
    {
        judul = new JLabel("verifikasi data  pasien");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        judul.setBounds(X,y,width,height);

        add(judul);

    }

    public void judul_input_email()
    {
        judul_email = new JLabel("email = ");
        judul_email.setBounds(140,90, 100,30);
        add(judul_email);
    }

    public void input_email()
    {
        input_email = new JTextField();
        input_email.setBounds(220,90, 100,30);
        add(input_email);
    }


    public void tombol_selesai()
    {
        tombol_selesai = new JButton("selesai");
        tombol_selesai.setBounds(300,130,100,30);
        add(tombol_selesai);
        tombol_selesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = input_email.getText();
                proses_verifikasi_data_pasien(email);
            }
        });
    }

    public void proses_verifikasi_data_pasien(String email)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.verifikasi_data_pasien(email);
        if (nilai_check == 1)
        {
            pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            proses_verifikasi_data_pasien gui_proses_verifikasi_data_pasien = new proses_verifikasi_data_pasien();
            gui_proses_verifikasi_data_pasien.setVisible(true);
        }
    }
}
