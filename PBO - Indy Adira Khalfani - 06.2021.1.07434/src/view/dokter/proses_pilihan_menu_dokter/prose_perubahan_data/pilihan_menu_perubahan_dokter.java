package view.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import view.dokter.pilihan_menu_dokter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pilihan_menu_perubahan_dokter extends JFrame
{
    private JLabel judul_pilihan_menu;
    private JButton tombol_nama_pasien;
    private JButton tombol_perubahan_email_pasien;
    private JButton tombol_mengganti_password_pasien;
    private JButton tombol_mengganti_alamat_pasien;
    private JButton tombol_verifikasi_akun_pasien;
    private JButton tombol_menghapus_akun_pasien;
    private JButton tombol_log_out;
    private JButton tombol_tampilkan_data_keseluruhan;
    public JPanel panel_pilihan_menu;

    public pilihan_menu_perubahan_dokter() {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        tombol_perubahan_nama();
        tombol_perubahan_email();
        tombol_perubahan_password();
        tombol_perubahan_alamat();
        tombol_verifikasi_data_pasien();
        tombol_delete_data_pasien();
        tombol_log_out();
        tombol_tampilkan_data();
    }

    public void judul()
    {
        judul_pilihan_menu = new JLabel("pilihan menu perubahan data pasien");
        judul_pilihan_menu.setBounds(150,50,300,30);
        add(judul_pilihan_menu);

    }

    public void tombol_perubahan_nama()
    {
        tombol_nama_pasien = new JButton("nama pasien");
        tombol_nama_pasien.setBounds(170,90,200,30);
        add(tombol_nama_pasien);
        tombol_nama_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_perubahan_nama_pasien gui_proses_perubahan_nama_pasien = new proses_perubahan_nama_pasien();
                gui_proses_perubahan_nama_pasien.setVisible(true);
            }
        });
    }

    public void tombol_perubahan_email()
    {
        tombol_perubahan_email_pasien = new JButton("email pasien");
        tombol_perubahan_email_pasien.setBounds(170, 130,200,30);
        add(tombol_perubahan_email_pasien);
        tombol_perubahan_email_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_perubahan_email_pasien gui_proses_perubahan_email_pasien = new proses_perubahan_email_pasien();
                gui_proses_perubahan_email_pasien.setVisible(true);
            }
        });
    }

    public void tombol_perubahan_password()
    {
        tombol_mengganti_password_pasien = new JButton("password pasien");
        tombol_mengganti_password_pasien.setBounds(170,170,200,30);
        add(tombol_mengganti_password_pasien);
        tombol_mengganti_password_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_perubahan_password_dokter gui_proses_perubahan_password_dokter = new proses_perubahan_password_dokter();
                gui_proses_perubahan_password_dokter.setVisible(true);
            }
        });
    }

    public void tombol_perubahan_alamat()
    {
        tombol_mengganti_alamat_pasien = new JButton("alamat pasien");
        tombol_mengganti_alamat_pasien.setBounds(170, 210, 200,30);
        add(tombol_mengganti_alamat_pasien);
        tombol_mengganti_alamat_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_perubahan_alamat_pasien gui_proses_perubahan_alamat_pasien = new proses_perubahan_alamat_pasien();
                gui_proses_perubahan_alamat_pasien.setVisible(true);
            }
        });
    }

    public void tombol_verifikasi_data_pasien()
    {
        tombol_verifikasi_akun_pasien = new JButton("verifikasi pasien");
        tombol_verifikasi_akun_pasien.setBounds(170,250,200,30);
        add(tombol_verifikasi_akun_pasien);
        tombol_verifikasi_akun_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_verifikasi_data_pasien gui_proses_verifikasi_data_pasien = new proses_verifikasi_data_pasien();
                gui_proses_verifikasi_data_pasien.setVisible(true);
            }
        });
    }

    public void tombol_delete_data_pasien()
    {
        tombol_menghapus_akun_pasien = new JButton("menghapus pasien");
        tombol_menghapus_akun_pasien.setBounds(170,290,200,30);
        add(tombol_menghapus_akun_pasien);
        tombol_menghapus_akun_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menghapus_akun_pasien_page gui_menghapus_akun_pasien_page = new menghapus_akun_pasien_page();
                gui_menghapus_akun_pasien_page.setVisible(true);
            }
        });
    }

    public void tombol_log_out()
    {
        tombol_log_out = new JButton("log out");
        tombol_log_out.setBounds(170, 330,200,30);
        add(tombol_log_out);
        tombol_log_out.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilihan_menu_dokter gui_pilihan_menu_dokter = new pilihan_menu_dokter();
                gui_pilihan_menu_dokter.setVisible(true);
            }
        });
    }

    public void tombol_tampilkan_data()
    {
        tombol_tampilkan_data_keseluruhan = new JButton("tampilkan data keseluruhan");
        tombol_tampilkan_data_keseluruhan.setBounds(170,370,200,30);
        add(tombol_tampilkan_data_keseluruhan);
        tombol_tampilkan_data_keseluruhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proses_menampilkan_data_pasien_keseluruhan Proses_Menampilkan_Data_Keseluruhan = new proses_menampilkan_data_pasien_keseluruhan();
                Proses_Menampilkan_Data_Keseluruhan.setVisible(true);
            }
        });
    }
}
