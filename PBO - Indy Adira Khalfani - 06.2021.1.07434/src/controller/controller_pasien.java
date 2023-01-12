package controller;

import view.pasien.Login_Pasien;
import view.pasien.pilihan_menu_pasien;
import view.pasien.tampilkan_data_pasien;

import javax.swing.table.DefaultTableModel;

public class controller_pasien
{
    int index;
    public void proses_registrasi_pasien( String inputan_nama ,String inputan_email,String inputan_password,String inputan_alamat_rumah)
    {
        controller_utama.Model_Pasien.proses_registrasi_pasien(inputan_nama, inputan_email, inputan_password, inputan_alamat_rumah);
        pilihan_menu_pasien gui_pilihan_menu_pasien = new pilihan_menu_pasien();
        gui_pilihan_menu_pasien.setVisible(true);
    }
    public void proses_login_data_pasien(String inputan_email, String inputan_password)
    {
        int hasil_pengecekan = 0;
        for (int perulangan = 0; perulangan < controller_utama.Model_Pasien.data_pasien_rumah_sakit.size(); perulangan++)
        {
            if (controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getEmail().equals(inputan_email) && controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getPassword().equals(inputan_password))
            {
                index = perulangan;
                hasil_pengecekan = 1;
                tampilkan_data_pasien gui = new tampilkan_data_pasien();
                gui.setVisible(true);
            }
        }

        if (hasil_pengecekan == 0)
        {
            Login_Pasien gui_login_pasien = new Login_Pasien();
            gui_login_pasien.setVisible(true);
        }

    }

    public String mendapat_nama()
    {
        return controller_utama.Model_Pasien.getnama(index);
    }

    public String mendapat_email()
    {
        return controller_utama.Model_Pasien.getemail(index);
    }
    public String mendapat_alamat()
    {
        return controller_utama.Model_Pasien.getalamat(index);
    }

    public String mendapat_verifikasi()
    {
        return controller_utama.Model_Pasien.getverifikasi(index);
    }

    public DefaultTableModel menampilkan_data_keseluruhan()
    {
        DefaultTableModel tabel_data = new DefaultTableModel();
        Object[] kolom = {"Nama", "Email", "Alamat", "Verifikasi"};
        tabel_data.setColumnIdentifiers(kolom);
        for (int perulangan = 0 ; perulangan <controller_utama.Model_Pasien.data_pasien_rumah_sakit.size(); perulangan++)
        {
            Object[] data = new Object[4];
            data[0] = controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getNama();
            data[1] = controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getEmail();
            data[2] = controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getAlamat();
            data[3] = controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getVerifikasi();
            tabel_data.addRow(data);
        }
        return tabel_data;
    }


}
