package rumah_sakit.pasien;

import rumah_sakit.object_deklarasi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class tampilkan_data_pasien extends JFrame
{

    public JPanel panel;
    private JLabel judul;
    private JTextPane panel_isian;
    private JButton exitButton;
    private JLabel sub_judul;

    public tampilkan_data_pasien() {
    panel_isian.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            super.componentResized(e);
            panel_isian.setText(informasi_data());
        }
    });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilihan_menu_pasien gui_pilihan_menu_pasien = new pilihan_menu_pasien();
                gui_pilihan_menu_pasien.setContentPane(gui_pilihan_menu_pasien.Pilihan_Menu_Pasien);
                gui_pilihan_menu_pasien.setSize(900, 900 );
                gui_pilihan_menu_pasien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui_pilihan_menu_pasien.setVisible(true);
            }
        });
    }
    public String informasi_data()
    {
        String Text = "nama  = " + object_deklarasi.Controller_Pasien.mendapat_nama()+ "\n" + "Email = " + object_deklarasi.Controller_Pasien.mendapat_email()+"\n"+ "alamat = " + object_deklarasi.Controller_Pasien.mendapat_alamat()+"\n"+"verifikasi = "+ object_deklarasi.Controller_Pasien.mendapat_verifikasi();
        return Text;
    }
}
