package rumah_sakit.pasien;


import rumah_sakit.Pilihan_Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class pilihan_menu_pasien extends JFrame
{
    Scanner input = new Scanner(System.in);
    private JButton tombol_registrasi_pasien;
    private JButton tombol_login_pasien;
    private JButton tombol_kembali_ke_menu_sebelumnya;
    private JLabel judul;
    public JPanel Pilihan_Menu_Pasien;

    public pilihan_menu_pasien()
    {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        tombol_registrasi_pasien();
        tombol_login_pasien();
        tombol_kembali_ke_menu_sebelumnya();

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

    public void tombol_registrasi_pasien()
    {
        tombol_registrasi_pasien = new JButton("registrasi pasien");
        tombol_registrasi_pasien.setBounds(170,90,200,30);
        add(tombol_registrasi_pasien);
        tombol_registrasi_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registrasi_Pasien gui_pilihan_menu = new Registrasi_Pasien();
                gui_pilihan_menu.setVisible(true);
            }
        });
    }

    public void tombol_login_pasien()
    {
        tombol_login_pasien = new JButton("login pasien");
        tombol_login_pasien.setBounds(170,130,200,30);
        add(tombol_login_pasien);
        tombol_login_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login_Pasien gui_login_pasien = new Login_Pasien();
                gui_login_pasien.setVisible(true);
            }
        });
    }

    public void tombol_kembali_ke_menu_sebelumnya()
    {
        tombol_kembali_ke_menu_sebelumnya = new JButton("kembali ke menu utama");
        tombol_kembali_ke_menu_sebelumnya.setBounds(170, 170, 200, 30);
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
