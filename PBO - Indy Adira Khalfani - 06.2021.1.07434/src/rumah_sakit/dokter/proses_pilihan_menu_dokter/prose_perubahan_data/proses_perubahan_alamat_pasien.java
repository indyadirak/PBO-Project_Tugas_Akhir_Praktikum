package rumah_sakit.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proses_perubahan_alamat_pasien extends JFrame
{
    public JPanel Panel_perubahan_alamat_pasien;
    private JLabel judul;
    private JLabel judul_email;
    private JLabel judul_alamat_baru;
    private JTextField Input_email;
    private JTextField Input_alamat_baru;
    private JButton tombol_selesai;

    public proses_perubahan_alamat_pasien()
    {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        judul_input_email();
        input_email();
        judul_alamat_baru();
        input_alamat_baru();
        tombol_selesai();
    }

    public void judul()
    {
        judul = new JLabel("mengubah data alamat pasien");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        judul.setBounds(X,y,width,height);

        add(judul);
    }

    public void judul_input_email()
    {
        judul_email = new JLabel("email        = ");
       judul_email.setBounds(140,90, 100,30);
        add(judul_email);
    }

    public void input_email()
    {
        Input_email = new JTextField();
        Input_email.setBounds(220,90, 100,30);
        add(Input_email);
    }


    public void judul_alamat_baru()
    {
        judul_alamat_baru = new JLabel("alamat          = ");
        judul_alamat_baru.setBounds(140,130, 100,30);
        add(judul_alamat_baru);

    }

    public void input_alamat_baru()
    {
        Input_alamat_baru = new JPasswordField();
        Input_alamat_baru.setBounds(220, 130, 100, 30);
        add(Input_alamat_baru);
    }

    public void tombol_selesai()
    {
        tombol_selesai = new JButton("selesai");
        tombol_selesai.setBounds(300, 170, 100,30);
        add(tombol_selesai);
        tombol_selesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String Input_Email = Input_email.getText();
                String Input_Alamat = Input_alamat_baru.getText();
                proses_perubahan_alamat_pasien(Input_Email, Input_Alamat);
            }
        });
    }

    public void proses_perubahan_alamat_pasien(String email, String password_baru)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_alamat_pasien(email, password_baru);
        if (nilai_check == 1)
        {
            pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            proses_perubahan_alamat_pasien gui_proses_perubahan_alamat_pasien = new proses_perubahan_alamat_pasien();
            gui_proses_perubahan_alamat_pasien.setVisible(true);
        }
    }
}
