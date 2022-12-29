package rumah_sakit.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proses_perubahan_alamat_pasien extends JFrame
{
    public JPanel Panel_perubahan_alamat_pasien;
    private JLabel judul;
    private JTextField Input_email;
    private JTextField Input_alamat_baru;
    private JButton tombol_selesai;

    public proses_perubahan_alamat_pasien() {
        tombol_selesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Input_Email = Input_email.getText();
                String Input_Alamat_Baru = Input_alamat_baru.getText();
                proses_perubahan_alamat_pasien(Input_Email, Input_Alamat_Baru);
            }
        });
    }

    public void proses_perubahan_alamat_pasien(String email, String password_baru)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_alamat_pasien(email, password_baru);
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
            proses_perubahan_alamat_pasien gui_pilihan_menu = new proses_perubahan_alamat_pasien();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu. Panel_perubahan_alamat_pasien);
            gui_pilihan_menu.setSize(900, 900 );
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }
    }
}
