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
        tombol_untuk_exit_program.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        tombol_untuk_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilihan_menu_pasien gui_pilihan_menu_pasien = new pilihan_menu_pasien();
                gui_pilihan_menu_pasien.setContentPane(gui_pilihan_menu_pasien.Pilihan_Menu_Pasien);
                gui_pilihan_menu_pasien.setSize(900, 900 );
                gui_pilihan_menu_pasien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu_pasien.setVisible(true);
            }
        });
        tombol_untuk_dokter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pilihan_menu_dokter gui_pilihan_menu_dokter = new pilihan_menu_dokter();
                gui_pilihan_menu_dokter.setContentPane(gui_pilihan_menu_dokter.panel_pilihan_menu_dokter);
                gui_pilihan_menu_dokter.setSize(900, 900 );
                gui_pilihan_menu_dokter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu_dokter.setVisible(true);
            }
        });
    }
}
