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

    public pilihan_menu_pasien() {
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
        tombol_login_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login_Pasien gui_login_pasien = new Login_Pasien();
                gui_login_pasien.setContentPane(gui_login_pasien.panel_login_pasien);
                gui_login_pasien.setSize(900, 900 );
                gui_login_pasien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_login_pasien.setVisible(true);
            }
        });
        tombol_registrasi_pasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registrasi_Pasien gui_pilihan_menu = new Registrasi_Pasien();
                gui_pilihan_menu.setContentPane(gui_pilihan_menu.panel_registrasi_pasien);
                gui_pilihan_menu.setSize(900, 900 );
                gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu.setVisible(true);
            }
        });
    }

   /* public void pilihan_menu()
    {
        System.out.println("pilihan menu dokter");
        System.out.println("1. register");
        System.out.println("2. login");
        System.out.println("3. kembali ke menu sebelumnya.");
        System.out.print("masukkan pilihan : ");
        int inputan_pilihan_menu = input.nextInt();
        proses_pilihan_menu(inputan_pilihan_menu);
    }

    public void proses_pilihan_menu(int inputan_pilihan_menu)
    {
        switch (inputan_pilihan_menu)
        {
            case 1:
            {
                new Registrasi_Pasien().registrasi_pasien();
                pilihan_menu();
                break;
            }
            case 2:
            {
                new Login_Pasien().login_pasien();
                pilihan_menu();
                break;
            }
            case 3:
            {
                new Pilihan_Menu().pilihan_menu();
                break;
            }
            default:
            {
                System.out.println("mohon maaf, pilihan anda tidak ada....");
                pilihan_menu();
                break;
            }
        }
    }*/




}
