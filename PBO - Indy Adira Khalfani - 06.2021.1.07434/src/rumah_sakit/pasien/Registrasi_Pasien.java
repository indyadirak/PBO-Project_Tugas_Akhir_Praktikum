package rumah_sakit.pasien;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Registrasi_Pasien extends JFrame
{
    Scanner input = new Scanner(System.in);
    public JPanel panel_registrasi_pasien;
    private JTextField input_nama;
    private JTextField input_email;
    private JPasswordField input_password;
    private JTextField input_alamat;
    private JButton tombol_daftar;
    private JLabel judul;
    private JLabel judul_registrasi_pasien;
    private JLabel nama;
    private JLabel email;
    private JLabel password;
    private JLabel alamat;

    public Registrasi_Pasien()
    {
        tombol_daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Input_Nama = input_nama.getText();
                String Input_Email = input_email.getText();
                String Input_Password = input_password.getText();
                String Input_Alamat = input_alamat.getText();
                object_deklarasi.Controller_Pasien.proses_registrasi_pasien(Input_Nama,Input_Email, Input_Password, Input_Alamat);
                pilihan_menu_pasien gui_pilihan_menu_pasien = new pilihan_menu_pasien();
                gui_pilihan_menu_pasien.setContentPane(gui_pilihan_menu_pasien.Pilihan_Menu_Pasien);
                gui_pilihan_menu_pasien.setSize(900, 900 );
                gui_pilihan_menu_pasien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu_pasien.setVisible(true);
            }
        });
    }
}
