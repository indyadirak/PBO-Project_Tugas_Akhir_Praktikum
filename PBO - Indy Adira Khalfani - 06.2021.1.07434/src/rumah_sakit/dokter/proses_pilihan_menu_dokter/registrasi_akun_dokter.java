package rumah_sakit.dokter.proses_pilihan_menu_dokter;

import rumah_sakit.dokter.pilihan_menu_dokter;
import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registrasi_akun_dokter extends JFrame
{
    public JPanel panel_registrasi_akun_dokter;
    private JLabel judul;
    private JLabel nama;
    private JLabel email;
    private JLabel password;
    private JLabel nip;
    private JTextField input_nama_dokter;
    private JTextField input_email_dokter;
    private JPasswordField input_password_dokter;
    private JTextField input_NIP_Dokter;
    private JButton tombol_Daftar;

    public registrasi_akun_dokter() {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);

        judul();
        text_nama();
        input_nama();
        text_email();
        Input_email();
        text_input_password();
        input_password();
        text_nip();
        input_nip();
        tombol_daftar();
    }
    public void judul()
    {
        judul = new JLabel("Aplikasi Pendaftaran Pasien Rumah Sakit");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        judul.setBounds(X,y,width,height);

        add(judul);
    }

    public void text_nama()
    {
        nama = new JLabel("Nama         = ");
        nama.setBounds(140,90,100,30);
        add(nama);
    }

    public void input_nama()
    {
        input_nama_dokter = new JTextField();
        input_nama_dokter.setBounds(220,90,100,30);
        add(input_nama_dokter);
    }

    public void text_email()
    {
        email = new JLabel("email         = ");
        email.setBounds(140,130,100,30);
        add(email);
    }

    public void Input_email()
    {
        input_email_dokter = new JTextField();
        input_email_dokter.setBounds(220, 130, 100,30);
        add(input_email_dokter);
    }

    public void text_input_password()
    {
        password = new JLabel("password  = ");
        password.setBounds(140,170,100,30);
        add(password);
    }

    public void input_password()
    {
        input_password_dokter = new JPasswordField();
        input_password_dokter.setBounds(220,170,100,30);
        add(input_password_dokter);
    }
    public void text_nip()
    {
        nip = new JLabel("nip          = ");
        nip.setBounds(140,210,100,30);
        add(nip);
    }

    public void input_nip()
    {
        input_NIP_Dokter = new JTextField();
        input_NIP_Dokter.setBounds(220,210,100,30);
        add(input_NIP_Dokter);
    }

    public void tombol_daftar()
    {
        tombol_Daftar = new JButton("Daftar");
        tombol_Daftar.setBounds(320,250,80,30);
        add(tombol_Daftar);

        tombol_Daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String Input_Nama = input_nama_dokter.getText();
                String Input_Email = input_email_dokter.getText();
                String Input_Password = input_password_dokter.getText();
                String Input_NIP = input_NIP_Dokter.getText();
                object_deklarasi.Controller_Dokter.input_data(Input_Nama,Input_Email, Input_Password, Input_NIP);

                pilihan_menu_dokter gui_pilihan_menu_dokter = new pilihan_menu_dokter();
                gui_pilihan_menu_dokter.setVisible(true);
            }
        });
    }

}
