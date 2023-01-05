package rumah_sakit.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proses_perubahan_password_dokter extends JFrame{
    public JPanel panel_proses_perubahan_password_dokter;
    private JLabel judul;
    private JLabel judul_email;
    private JLabel judul_password;
    private JPasswordField input_password_baru;
    private JTextField input_email;
    private JButton tombol_selesai;
    public proses_perubahan_password_dokter() {

        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        text_email();
        input_email();
        text_password();
        input_password();
        tombol_selesai();
    }

    public void judul()
    {
        judul = new JLabel("proses perubahan password pasien");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        judul.setBounds(X,y,width,height);
        add(judul);
    }

    public void text_email()
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

    public void text_password()
    {
        judul_password = new JLabel("password = ");
        judul_password.setBounds(140,130, 100,30);
        add(judul_password);
    }

    public void input_password()
    {
        input_password_baru = new JPasswordField();
        input_password_baru.setBounds(220, 130, 100, 30);
        add(input_password_baru);
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
            String password_baru = input_password_baru.getText();
            proses_perubahan_password_pasien(email,password_baru);
         }
     });
    }
    public void proses_perubahan_password_pasien(String email,String password_baru)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_password_pasien(email, password_baru);
        if (nilai_check == 1)
        {
            pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            proses_perubahan_password_dokter gui_proses_perubahan_password_dokter = new proses_perubahan_password_dokter();
            gui_proses_perubahan_password_dokter.setVisible(true);
        }
    }
}
