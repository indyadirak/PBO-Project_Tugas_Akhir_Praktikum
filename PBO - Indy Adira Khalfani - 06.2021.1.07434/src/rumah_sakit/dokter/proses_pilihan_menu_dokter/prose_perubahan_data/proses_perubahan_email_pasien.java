package rumah_sakit.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proses_perubahan_email_pasien extends JFrame
{

    public JPanel panel_proses_perubahan_email_pasien;
    private JLabel judul;
    private JTextField input_email_lama;
    private JPasswordField input_nilai_baru;
    private JButton tombol_selesai;

    public proses_perubahan_email_pasien() {
        tombol_selesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Input_Email_Lama = input_email_lama.getText();
                String Input_Email_Baru = input_nilai_baru.getText();
                proses_perubahan_email_pasien(Input_Email_Lama, Input_Email_Baru);
            }
        });
    }

    public void proses_perubahan_email_pasien(String email, String email_baru)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_email_pasien(email, email_baru);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil dirubah");
            pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_pilihan_menu);
            gui_pilihan_menu.setSize(900, 900 );
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            System.out.println("data tidak berhasil dirubah...");
            proses_perubahan_email_pasien gui_pilihan_menu = new proses_perubahan_email_pasien();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_proses_perubahan_email_pasien);
            gui_pilihan_menu.setSize(900, 900);
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }
    }
}
