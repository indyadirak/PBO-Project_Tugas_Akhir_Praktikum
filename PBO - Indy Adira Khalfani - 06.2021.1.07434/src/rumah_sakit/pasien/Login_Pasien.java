package rumah_sakit.pasien;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Login_Pasien extends JFrame
{
    Scanner input = new Scanner(System.in);
    private JLabel Aplikasi_Pendaftaran_Pasien_Rumah_Sakit;
    private JLabel judul_input_email;
    private JLabel judul_input_password;
    public JPanel panel_login_pasien;
    private JPasswordField input_password;
    private JTextField input_email;
    private JButton tombol_login;

    public Login_Pasien()
    {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        judul_input_email();
        input_nama();
        judul_input_password();
        input_password();
        tombol_login();
    }

    public void judul()
    {
        Aplikasi_Pendaftaran_Pasien_Rumah_Sakit = new JLabel("Aplikasi Pendaftaran Pasien Rumah Sakit");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        Aplikasi_Pendaftaran_Pasien_Rumah_Sakit.setBounds(X,y,width,height);

        add(Aplikasi_Pendaftaran_Pasien_Rumah_Sakit);
    }

    public void judul_input_email()
    {
        judul_input_email = new JLabel("email        = ");
        judul_input_email.setBounds(140,90, 100,30);
        add(judul_input_email);
    }

    public void input_nama()
    {
        input_email = new JTextField();
        input_email.setBounds(220,90, 100,30);
        add(input_email);
    }

    public void judul_input_password()
    {
        judul_input_password = new JLabel("Password = ");
        judul_input_password.setBounds(140,130, 100,30);
        add(judul_input_password);

    }

    public void input_password()
    {
        input_password = new JPasswordField();
        input_password.setBounds(220, 130, 100, 30);
        add(input_password);
    }

    public void tombol_login()
    {
        tombol_login = new JButton("login");
        tombol_login.setBounds(300, 170, 100,30);
        add(tombol_login);
        tombol_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = input_email.getText();
                String password = input_password.getText();
                object_deklarasi.Controller_Pasien.proses_login_data_pasien(email, password);
            }
        });
    }



}
