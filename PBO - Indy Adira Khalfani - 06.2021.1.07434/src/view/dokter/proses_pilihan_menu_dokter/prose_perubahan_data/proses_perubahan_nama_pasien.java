package view.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import view.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proses_perubahan_nama_pasien extends JFrame
{

    public JPanel panel_perubahan_nama_pasien;
    public JLabel judul;
    public JLabel judul_email;
    public JLabel judul_nama_baru;
    private JTextField input_email;
    private JTextField input_nama_baru;
    private JButton tombol_selesai;
    public proses_perubahan_nama_pasien()
    {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        judul_input_email();
        input_email_lama();
        judul_nama_baru();
        input_nama_baru();
        tombol_selesai();

    }

    public void judul()
    {
        judul = new JLabel("mengubah data nama pasien");
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

    public void input_email_lama()
    {
        input_email = new JTextField();
        input_email.setBounds(220,90, 100,30);
        add(input_email);
    }


    public void judul_nama_baru()
    {
        judul_nama_baru = new JLabel("nama baru =  ");
        judul_nama_baru.setBounds(140,130, 100,30);
        add(judul_nama_baru);

    }

    public void input_nama_baru()
    {
        input_nama_baru = new JTextField();
        input_nama_baru.setBounds(220, 130, 100, 30);
        add(input_nama_baru);
    }

    public void tombol_selesai()
    {
        tombol_selesai = new JButton("selesai");
        tombol_selesai.setBounds(300,170,100,30);
        add(tombol_selesai);
        tombol_selesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = input_email.getText();
                String nama_baru= input_nama_baru.getText();
                proses_perubahan_nama_pasien(email,nama_baru);
            }
        });
    }

    public void proses_perubahan_nama_pasien(String email,String nama)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_nama_pasien(email, nama);
        if (nilai_check == 1)
        {
            pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            proses_perubahan_nama_pasien gui_proses_perubahan_nama_pasien = new proses_perubahan_nama_pasien();
            gui_proses_perubahan_nama_pasien.setVisible(true);
        }
    }
}
