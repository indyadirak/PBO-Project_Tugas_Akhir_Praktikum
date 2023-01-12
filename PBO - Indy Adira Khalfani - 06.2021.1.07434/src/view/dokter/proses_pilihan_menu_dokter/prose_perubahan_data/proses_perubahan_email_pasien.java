package view.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import view.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proses_perubahan_email_pasien extends JFrame
{

    public JPanel panel_proses_perubahan_email_pasien;
    private JLabel judul;
    private JLabel judul_email_lama;
    private JLabel judul_email_baru;
    private JTextField input_email_lama;
    private JTextField input_email_baru;
    private JButton tombol_selesai;

    public proses_perubahan_email_pasien() {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        judul_input_email_lama();
        input_email_lama();
        judul_email_baru();
        input_email_baru();
        tombol_selesai();
    }

    public void judul()
    {
        judul = new JLabel("mengubah data email pasien");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        judul.setBounds(X,y,width,height);

        add(judul);
    }

    public void judul_input_email_lama()
    {
        judul_email_lama = new JLabel("email lama = ");
        judul_email_lama.setBounds(140,90, 100,30);
        add(judul_email_lama);
    }

    public void input_email_lama()
    {
        input_email_lama = new JTextField();
        input_email_lama.setBounds(220,90, 100,30);
        add(input_email_lama);
    }


    public void judul_email_baru()
    {
        judul_email_baru = new JLabel("email baru =  ");
        judul_email_baru.setBounds(140,130, 100,30);
        add(judul_email_baru);

    }

    public void input_email_baru()
    {
        input_email_baru = new JTextField();
        input_email_baru.setBounds(220, 130, 100, 30);
        add(input_email_baru);
    }

    public void tombol_selesai()
    {
        tombol_selesai = new JButton("selesai");
        tombol_selesai.setBounds(300,170,100,30);
        add(tombol_selesai);
        tombol_selesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email_lama = input_email_lama.getText();
                String email_baru = input_email_baru.getText();
                proses_perubahan_email_pasien(email_lama, email_baru);
            }
        });
    }
    public void proses_perubahan_email_pasien(String email, String email_baru)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_email_pasien(email, email_baru);
        if (nilai_check == 1)
        {
            pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            proses_perubahan_email_pasien gui_proses_perubahan_email_pasien = new proses_perubahan_email_pasien();
            gui_proses_perubahan_email_pasien.setVisible(true);
        }
    }
}
