package rumah_sakit;

import rumah_sakit.dokter.pilihan_menu_dokter;
import rumah_sakit.dokter.proses_pilihan_menu_dokter.registrasi_akun_dokter;
import rumah_sakit.pasien.pilihan_menu_pasien;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Pilihan_Menu extends JFrame
{
    Scanner input = new Scanner(System.in);
    public JPanel pilihan_menu;
    private JButton tombol_untuk_pasien;
    private JButton tombol_untuk_dokter;
    private JButton tombol_untuk_exit_program;
    private JLabel Aplikasi_Pendaftaran_Pasien_Rumah_Sakit;

    public Pilihan_Menu() {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        tombol_untuk_dokter();
        Tombol_untuk_pasien();
        Tombol_Untuk_Exit();
    }

    private void judul()
    {
        Aplikasi_Pendaftaran_Pasien_Rumah_Sakit = new JLabel("Aplikasi Pendaftaran Pasien Rumah Sakit");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        Aplikasi_Pendaftaran_Pasien_Rumah_Sakit.setBounds(X,y,width,height);

        add(Aplikasi_Pendaftaran_Pasien_Rumah_Sakit);
    }

    private void tombol_untuk_dokter()
    {
        tombol_untuk_dokter = new JButton("Dokter");
        tombol_untuk_dokter.setBounds(230,90,100,30);
        add(tombol_untuk_dokter);
        tombol_untuk_dokter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilihan_menu_dokter gui_pilihan_menu_dokter = new pilihan_menu_dokter();
                gui_pilihan_menu_dokter.setVisible(true);
            }
        });
    }

    private void Tombol_untuk_pasien()
    {
        tombol_untuk_pasien = new JButton("Pasien");
        tombol_untuk_pasien.setBounds(230,130,100,30);
        add(tombol_untuk_pasien);
        tombol_untuk_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilihan_menu_pasien gui_pilihan_menu_pasien = new pilihan_menu_pasien();
                gui_pilihan_menu_pasien.setVisible(true);
            }
        });
    }

    private void Tombol_Untuk_Exit()
    {
        tombol_untuk_exit_program = new JButton("EXIT");
        tombol_untuk_exit_program.setBounds(230,170,100,30);
        add(tombol_untuk_exit_program);
        tombol_untuk_exit_program.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        {

        }
    }

}
