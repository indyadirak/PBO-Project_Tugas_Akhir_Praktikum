package rumah_sakit.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import rumah_sakit.dokter.pilihan_menu_dokter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pilihan_menu_perubahan_dokter extends JFrame
{
    private JLabel judul_di_menu_perubahan_dokter;
    private JLabel judul_pilihan_menu;
    private JButton tombol_nama_pasien;
    private JButton tombol_perubahan_email_pasien;
    private JButton tombol_mengganti_password_pasien;
    private JButton tombol_mengganti_alamat_pasien;
    private JButton tombol_verifikasi_akun_pasien;
    private JButton tombol_menghapus_akun_pasien;
    private JButton tombol_kembali_ke_menu_sebelumnya;
    public JPanel panel_pilihan_menu;

    public pilihan_menu_perubahan_dokter() {
        tombol_nama_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_perubahan_nama_pasien gui_pilihan_menu = new proses_perubahan_nama_pasien();
                gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_perubahan_nama_pasien);
                gui_pilihan_menu.setSize(900, 900);
                gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu.setVisible(true);
            }
        });
        tombol_perubahan_email_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_perubahan_email_pasien gui_pilihan_menu = new proses_perubahan_email_pasien();
                gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_proses_perubahan_email_pasien);
                gui_pilihan_menu.setSize(900, 900);
                gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu.setVisible(true);
            }
        });
        tombol_mengganti_password_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_perubahan_password_dokter gui_pilihan_menu = new proses_perubahan_password_dokter();
                gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_proses_perubahan_password_dokter);
                gui_pilihan_menu.setSize(900, 900);
                gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu.setVisible(true);
            }
        });
        tombol_mengganti_alamat_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_perubahan_alamat_pasien gui_pilihan_menu = new proses_perubahan_alamat_pasien();
                gui_pilihan_menu.setContentPane(gui_pilihan_menu. Panel_perubahan_alamat_pasien);
                gui_pilihan_menu.setSize(900, 900 );
                gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu.setVisible(true);
            }
        });
        tombol_verifikasi_akun_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_verifikasi_data_pasien gui_pilihan_menu = new proses_verifikasi_data_pasien();
                gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel);
                gui_pilihan_menu.setSize(900, 900);
                gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu.setVisible(true);
            }
        });
        tombol_menghapus_akun_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menghapus_akun_pasien_page gui_pilihan_menu = new menghapus_akun_pasien_page();
                gui_pilihan_menu.setContentPane(gui_pilihan_menu.Panel);
                gui_pilihan_menu.setSize(900, 900 );
                gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu.setVisible(true);
            }
        });
        tombol_kembali_ke_menu_sebelumnya.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilihan_menu_dokter gui_pilihan_menu_dokter = new pilihan_menu_dokter();
                gui_pilihan_menu_dokter.setContentPane(gui_pilihan_menu_dokter.panel_pilihan_menu_dokter);
                gui_pilihan_menu_dokter.setSize(900, 900 );
                gui_pilihan_menu_dokter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu_dokter.setVisible(true);
            }
        });

    }
}
