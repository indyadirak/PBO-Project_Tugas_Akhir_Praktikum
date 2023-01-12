package view.dokter;

import view.Pilihan_Menu;
import view.dokter.proses_pilihan_menu_dokter.login_akun_dokter;
import view.dokter.proses_pilihan_menu_dokter.registrasi_akun_dokter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class pilihan_menu_dokter  extends JFrame
{
    Scanner input = new Scanner(System.in);
    private JLabel judul ;
    private JButton tombol_register_akun_dokter;
    private JButton tombol_login_dokter;
    private JButton tombol_kembali_ke_menu_sebelumnya;
    public JPanel panel_pilihan_menu_dokter;

    public pilihan_menu_dokter()
    {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);

        judul();
        tombol_registrasi_dokter();
        tombol_login_dokter();
        Tombol_kembali_ke_menu_sebelumnya();
    }

    public void judul()
    {
        judul = new JLabel("Aplikasi Pendaftaran Pasien Rumah Sakit");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        judul.setBounds(X,y,width,height);

        add(judul);
    }

    public void tombol_registrasi_dokter()
    {
        tombol_register_akun_dokter = new JButton("register akun dokter");
        tombol_register_akun_dokter.setBounds(150, 90,230,30);
        add(tombol_register_akun_dokter);
        tombol_register_akun_dokter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrasi_akun_dokter gui_registrasi_akun_dokter = new registrasi_akun_dokter();
                gui_registrasi_akun_dokter.setVisible(true);
            }
        });
    }
    public void tombol_login_dokter()
    {
        tombol_login_dokter = new JButton("login akun dokter");
        tombol_login_dokter.setBounds(150,130,230,30);
        add(tombol_login_dokter);
        tombol_login_dokter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login_akun_dokter gui_login_akun_dokter = new login_akun_dokter();
                gui_login_akun_dokter.setVisible(true);
            }
        });

    }

    public void Tombol_kembali_ke_menu_sebelumnya()
    {
        tombol_kembali_ke_menu_sebelumnya = new JButton("kembali ke menu sebelumnya");
        tombol_kembali_ke_menu_sebelumnya.setBounds(150,170,230,30);
        add(tombol_kembali_ke_menu_sebelumnya);
        tombol_kembali_ke_menu_sebelumnya.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pilihan_Menu gui_pilihan_menu = new Pilihan_Menu();
                gui_pilihan_menu.setVisible(true);
            }
        });
    }
}
