package rumah_sakit.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proses_perubahan_nama_pasien extends JFrame
{

    public JPanel panel_perubahan_nama_pasien;
    private JTextField input_email;
    private JTextField input_nama_baru;
    private JButton selesaiButton;
    public proses_perubahan_nama_pasien() {
        selesaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Input_email = input_email.getText();
                String Input_nama_baru = input_nama_baru.getText();
                proses_perubahan_nama_pasien(Input_email, Input_nama_baru);

            }
        });
    }

    public void proses_perubahan_nama_pasien(String email,String nama)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_nama_pasien(email, nama);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil dirubah");
            pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_pilihan_menu);
            gui_pilihan_menu.setSize(900, 900);
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            System.out.println("data tidak berhasil dirubah...");
            proses_perubahan_nama_pasien gui_pilihan_menu = new proses_perubahan_nama_pasien();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_perubahan_nama_pasien);
            gui_pilihan_menu.setSize(900, 900);
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }
    }
}
