package rumah_sakit.pasien;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Login_Pasien extends JFrame
{
    Scanner input = new Scanner(System.in);
    private JLabel judul;
    public JPanel panel_login_pasien;
    private JPasswordField input_password;
    private JTextField input_email;
    private JButton tombol_login;

    public Login_Pasien() {
        tombol_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Input_Email = input_email.getText();
                String Input_Password = input_password.getText();
                pilihan_menu_pasien gui_pilihan_menu_pasien = new pilihan_menu_pasien();
                proses_login_pasien(Input_Email,Input_Password);
                gui_pilihan_menu_pasien.setContentPane(gui_pilihan_menu_pasien.Pilihan_Menu_Pasien);
                gui_pilihan_menu_pasien.setSize(900, 900 );
                gui_pilihan_menu_pasien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu_pasien.setVisible(true);
            }
        });
    }



    public void proses_login_pasien(String inputan_email, String inputan_password)
    {
        int hasil_pengecekan;
        hasil_pengecekan = object_deklarasi.Controller_Pasien.proses_menampilkan_data_pasien_2(inputan_email, inputan_password);

        if (hasil_pengecekan == 0)
        {
            System.out.println("maaf, data yang diinput tidak ada / salah....");
        }
    }

}
