package rumah_sakit.dokter;

import rumah_sakit.Pilihan_Menu;
import rumah_sakit.dokter.proses_pilihan_menu_dokter.login_akun_dokter;
import rumah_sakit.dokter.proses_pilihan_menu_dokter.registrasi_akun_dokter;
import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class pilihan_menu_dokter  extends JFrame
{
    Scanner input = new Scanner(System.in);
    private JButton tombol_register_akun_dokter;
    private JButton tombol_login_dokter;
    private JButton tombol_kembali_ke_menu_sebelumnya;
    public JPanel panel_pilihan_menu_dokter;

    public pilihan_menu_dokter() {
        tombol_register_akun_dokter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrasi_akun_dokter gui_pilihan_menu_dokter = new registrasi_akun_dokter();
                gui_pilihan_menu_dokter.setContentPane(gui_pilihan_menu_dokter.panel_registrasi_akun_dokter);
                gui_pilihan_menu_dokter.setSize(900, 900 );
                gui_pilihan_menu_dokter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu_dokter.setVisible(true);
            }
        });
        tombol_kembali_ke_menu_sebelumnya.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pilihan_Menu gui_pilihan_menu = new Pilihan_Menu();
                gui_pilihan_menu.setContentPane(gui_pilihan_menu.pilihan_menu);
                gui_pilihan_menu.setSize(900, 900 );
                gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu.setVisible(true);
            }
        });
        tombol_login_dokter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login_akun_dokter gui_pilihan_menu = new login_akun_dokter();
                gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_login_akun_dokter);
                gui_pilihan_menu.setSize(900, 900 );
                gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu.setVisible(true);
            }
        });
    }




    public void perubahan_password_pasien()
    {
        System.out.print("masukkan email     : ");
        String email = input.next();
        System.out.print("masukkan password baru : ");
        String password_baru = input.next();
        proses_perubahan_password_pasien(email, password_baru);
    }

    public void proses_perubahan_password_pasien(String email,String password_baru)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_password_pasien(email, password_baru);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil dirubah");
        }
        else
        {
            System.out.println("data tidak berhasil dirubah...");
        }
    }

    public void perubahan_alamat_pasien()
    {
        System.out.print("masukkan email     : ");
        String email = input.next();
        System.out.print("masukkan alamat baru : ");
        String alamat_baru = input.next();
        proses_perubahan_alamat_pasien(email, alamat_baru);
    }

    public void proses_perubahan_alamat_pasien(String email,String password_baru)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_alamat_pasien(email, password_baru);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil dirubah");
        }
        else
        {
            System.out.println("data tidak berhasil dirubah...");
        }
    }

    public void verifikasi_data_pasien()
    {
        System.out.print("masukkan email     : ");
        String email = input.next();
        proses_verifikasi_data_pasien(email);
    }

    public void proses_verifikasi_data_pasien(String email)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.verifikasi_data_pasien(email);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil diverifikasi");
        }
        else
        {
            System.out.println("data tidak berhasil diverifikasi...");
        }
    }

    public void proses_menampilkan_data_pasien()
    {
        object_deklarasi.Controller_Dokter.menampilkan_data_pasien();
    }

    public void menghapus_akun_pasien_page()
    {
        System.out.print("masukkan email pasien : ");
        String inputan_email = input.next();
        proses_menghapus_pasien(inputan_email);

    }

    public void proses_menghapus_pasien(String inputan_email)
    {
        int nilai_pengecekan = object_deklarasi.Controller_Dokter.menghapus_akun_pasien(inputan_email);

        if (nilai_pengecekan == 1)
        {
            System.out.println("data berhasil dihapus");
        }
        else
        {
            System.out.println("data tidak berhasil dihapus");
        }
    }
}
