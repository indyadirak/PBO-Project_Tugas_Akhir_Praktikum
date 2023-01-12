package view.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import view.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menghapus_akun_pasien_page extends JFrame{
    public JPanel Panel;
    private JLabel judul;
    private JLabel judul_email;
    private JTextField input_email;
    private JButton tombol_selesai;
    public menghapus_akun_pasien_page()
    {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        judul_email();
        input_email();
        tombol_selesai();
    }


    public void judul()
    {
        judul = new JLabel("menghapus data pasien");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        judul.setBounds(X,y,width,height);

        add(judul);
    }

    public void judul_email()
    {
        judul_email = new JLabel("email        = ");
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
        tombol_selesai.setBounds(300, 170, 100,30);
        add(tombol_selesai);
        tombol_selesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Input_Email = input_email.getText();
                proses_menghapus_pasien(Input_Email);
            }
        });
    }
    public void proses_menghapus_pasien(String inputan_email)
    {
        int nilai_pengecekan = object_deklarasi.Controller_Dokter.menghapus_akun_pasien(inputan_email);

        if (nilai_pengecekan == 1)
        {
            pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            menghapus_akun_pasien_page gui_menghapus_akun_pasien_page = new menghapus_akun_pasien_page();
            gui_menghapus_akun_pasien_page.setVisible(true);
        }

    }

}
