package rumah_sakit.dokter.proses_pilihan_menu_dokter;

import rumah_sakit.dokter.proses_pilihan_menu_dokter.prose_perubahan_data.pilihan_menu_perubahan_dokter;
import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login_akun_dokter extends JFrame
{

    public JPanel panel_login_akun_dokter;
    private JLabel judul;
    private JLabel email;
    private JLabel password;
    private JTextField input_email;
    private JPasswordField input_password;
    private JButton tombol_login;

    public login_akun_dokter() {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        judul_input_email();
        input_email();
        judul_input_password();
        input_password();
        tombol_login();
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

    public void judul_input_email()
    {
        email = new JLabel("email        = ");
        email.setBounds(140,90, 100,30);
        add(email);
    }

    public void input_email()
    {
        input_email = new JTextField();
        input_email.setBounds(220,90, 100,30);
        add(input_email);
    }

    public void judul_input_password()
    {
        password = new JLabel("Password = ");
        password.setBounds(140,130, 100,30);
        add(password);

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
                String Input_Email = input_email.getText();
                String Input_Password = input_password.getText();
                proses_login_akun_dokter(Input_Email, Input_Password);
            }
        });
    }
    public void proses_login_akun_dokter(String input_email,String input_password )
    {
        int nilai_cek = object_deklarasi.Controller_Dokter.cek_data(input_email, input_password);

        if (nilai_cek == 1)
        {
          pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
          gui_pilihan_menu.setVisible(true);
        }
        else
        {
            System.out.println("inputan anda salah / tidak ada");
            login_akun_dokter gui_pilihan_menu = new login_akun_dokter();
            gui_pilihan_menu.setVisible(true);
        }
    }
}
