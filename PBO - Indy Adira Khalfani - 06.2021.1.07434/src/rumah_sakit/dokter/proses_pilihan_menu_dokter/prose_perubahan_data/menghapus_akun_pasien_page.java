package rumah_sakit.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menghapus_akun_pasien_page extends JFrame{
    public JPanel Panel;
    private JLabel judul;
    private JTextField input_email;
    private JButton selesaiButton;
public menghapus_akun_pasien_page() {
        selesaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Input_Email = input_email.getText();
                proses_menghapus_pasien(Input_Email);
            }
        });
    }
    public void proses_menghapus_pasien(String inputan_email)
    {
        int nilai_pengecekan = object_deklarasi.Controller_Dokter.menghapus_akun_pasien(inputan_email);

        if (nilai_pengecekan == 1)
        {
            System.out.println("data berhasil dihapus");
            pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_pilihan_menu);
            gui_pilihan_menu.setSize(900, 900 );
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }
        else
        {
            System.out.println("data tidak berhasil dihapus");
            menghapus_akun_pasien_page gui_pilihan_menu = new menghapus_akun_pasien_page();
            gui_pilihan_menu.setContentPane(gui_pilihan_menu.Panel);
            gui_pilihan_menu.setSize(900, 900 );
            gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_pilihan_menu.setVisible(true);
        }

    }

}
