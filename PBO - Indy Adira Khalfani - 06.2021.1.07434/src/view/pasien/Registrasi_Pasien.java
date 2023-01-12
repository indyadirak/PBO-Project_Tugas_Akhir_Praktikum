package view.pasien;

import view.object_deklarasi;

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
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        text_input_nama();
        input_nama();
        text_input_email();
        Input_email();
        text_input_password();
        input_password();
        text_input_alamat();
        input_alamat();
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
    public void text_input_nama()
    {
        nama = new JLabel("Nama         = ");
        nama.setBounds(140,90,100,30);
        add(nama);
    }
    public void input_nama()
    {
        input_nama = new JTextField();
        input_nama.setBounds(220,90,100,30);
        add(input_nama);
    }

    public void text_input_email()
    {
        email = new JLabel("email         = ");
        email.setBounds(140,130,100,30);
        add(email);
    }

    public void Input_email()
    {
        input_email = new JTextField();
        input_email.setBounds(220, 130, 100,30);
        add(input_email);
    }

    public void text_input_password()
    {
        password = new JLabel("password  = ");
        password.setBounds(140,170,100,30);
        add(password);
    }

    public void input_password()
    {
        input_password = new JPasswordField();
        input_password.setBounds(220,170,100,30);
        add(input_password);
    }

    public void text_input_alamat()
    {
        alamat = new JLabel("alamat       = ");
        alamat.setBounds(140,210,100,30);
        add(alamat);
    }

    public void input_alamat()
    {
        input_alamat = new JTextField();
        input_alamat.setBounds(220,210,100,30);
        add(input_alamat);
    }

    public void tombol_daftar()
    {
        tombol_daftar = new JButton("Daftar");
        tombol_daftar.setBounds(320,250,80,30);
        add(tombol_daftar);

        tombol_daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Input_Nama = input_nama.getText();
                String Input_Email = input_email.getText();
                String Input_Password = input_password.getText();
                String Input_Alamat = input_alamat.getText();
                object_deklarasi.Controller_Pasien.proses_registrasi_pasien(Input_Nama,Input_Email, Input_Password, Input_Alamat);
            }
        });
    }


}
