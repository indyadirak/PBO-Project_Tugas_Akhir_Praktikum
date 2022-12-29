package rumah_sakit.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proses_verifikasi_data_pasien extends JFrame{
    private JTextField input_email;
    private JButton selesaiButton;
    public JPanel panel;

    public proses_verifikasi_data_pasien() {
        selesaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Email = input_email.getText();
                proses_verifikasi_data_pasien(Email);
            }
        });
    }

    public void proses_verifikasi_data_pasien(String email)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.verifikasi_data_pasien(email);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil diverifikasi");
            pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_pilihan_menu);
            gui_pilihan_menu.setSize(900, 900);
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            System.out.println("data tidak berhasil diverifikasi...");
            proses_verifikasi_data_pasien gui_pilihan_menu = new proses_verifikasi_data_pasien();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel);
            gui_pilihan_menu.setSize(900, 900);
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }
    }
}
