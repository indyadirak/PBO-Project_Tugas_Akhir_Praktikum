package view.dokter.proses_pilihan_menu_dokter.prose_perubahan_data;

import view.object_deklarasi;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proses_menampilkan_data_pasien_keseluruhan extends JFrame
{
    private JLabel judul;
    private JTable panel_isian;
    private JScrollPane panel_Scroll = new JScrollPane(panel_isian);
    private JButton exitButton;

    public JPanel panel;

    public proses_menampilkan_data_pasien_keseluruhan()
    {
        setTitle("aplikasi rumah sakit");
        setSize(600,600);
        setLayout(null);
        judul();
        area_teks();
        tombol_keluar();
    }
    private void judul()
    {
        judul = new JLabel("Aplikasi Pendaftaran Pasien Rumah Sakit");
        int X = 150;
        int y= 50;
        int width = 300;
        int height = 30;
        judul.setBounds(X,y,width,height);

        add(judul);
    }
    public void area_teks()
    {
        panel_isian = new JTable();
        TableModel tabel_model = object_deklarasi.Controller_Pasien.menampilkan_data_keseluruhan();
        panel_isian.setModel(tabel_model);

        JScrollPane scroll_panel = new JScrollPane(panel_isian);
        scroll_panel.setBounds( 1,90,500,120);
        add(scroll_panel);

    }

    public void tombol_keluar()
    {
        exitButton = new JButton("exit");
        exitButton.setBounds(350,  250,100,30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilihan_menu_perubahan_dokter gui_pilihan_menu = new pilihan_menu_perubahan_dokter();
                gui_pilihan_menu.setVisible(true);
            }
        });
        add(exitButton);
    }
}
