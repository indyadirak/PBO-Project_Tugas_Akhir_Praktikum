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
    private JTextField input_nama_dokter;
    private JTextField input_email_dokter;
    private JPasswordField input_password_dokter;
    private JTextField input_NIP_Dokter;
    private JButton tombol_Daftar;

    public registrasi_akun_dokter() {
        tombol_Daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Input_Nama_Dokter = input_nama_dokter.getText();
                String Input_Email_Dokter = input_email_dokter.getText();
                String Input_Password_Dokter = input_password_dokter.getText();
                String Input_NIP_Dokter = input_NIP_Dokter.getText();
                object_deklarasi.Controller_Dokter.input_data(Input_Nama_Dokter, Input_Email_Dokter, Input_Password_Dokter, Input_NIP_Dokter);
                pilihan_menu_dokter gui_pilihan_menu_dokter = new pilihan_menu_dokter();
                gui_pilihan_menu_dokter.setContentPane(gui_pilihan_menu_dokter.panel_pilihan_menu_dokter);
                gui_pilihan_menu_dokter.setSize(900, 900 );
                gui_pilihan_menu_dokter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu_dokter.setVisible(true);
            }
        });
    }
}
