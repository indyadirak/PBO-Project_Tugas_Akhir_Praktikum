package rumah_sakit.dokter.proses_pilihan_menu_dokter;

import rumah_sakit.dokter.proses_pilihan_menu_dokter.prose_perubahan_data.pilihan_menu_perubahan_dokter;
import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login_akun_dokter extends JFrame
{

    public JPanel panel_login_akun_dokter;
    private JTextField input_email;
    private JPasswordField input_password;
    private JButton tombol_login;

    public login_akun_dokter() {
        tombol_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Input_Email = input_email.getText();
                String Input_Password = input_password.getText();
                proses_login_akun_dokter(Input_Email, Input_Password);
            }
        });
    }

    public void login_akun_dokter()
    {
/*        System.out.print("email : ");
        String input_email = input.next();
        System.out.print("password = ");
        String input_password = input.next();
        proses_login_akun_dokter(input_email,input_password);*/
    }

    public void proses_login_akun_dokter(String input_email,String input_password )
    {
        int nilai_cek = object_deklarasi.Controller_Dokter.cek_data(input_email, input_password);

        if (nilai_cek == 1)
        {
          pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_pilihan_menu);
            gui_pilihan_menu.setSize(900, 900 );
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            System.out.println("inputan anda salah / tidak ada");
            login_akun_dokter gui_pilihan_menu = new login_akun_dokter();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_login_akun_dokter);
            gui_pilihan_menu.setSize(900, 900 );
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }
    }
}
