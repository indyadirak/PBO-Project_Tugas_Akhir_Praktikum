package model;

import controller.controller_utama;
import entity.data_Pasien_Rumah_Sakit;

import java.util.ArrayList;

public class model_pasien
{

    public ArrayList<data_Pasien_Rumah_Sakit> data_pasien_rumah_sakit = new ArrayList<>();
    public void proses_perubahan_data_nama_pasien(int index, String nama)
    {
        data_pasien_rumah_sakit.get(index).setNama(nama);
    }

    public void proses_perubahan_data_email_pasien(int index, String email_baru)
    {
        data_pasien_rumah_sakit.get(index).setEmail(email_baru);
    }

    public void proses_perubahan_data_password_pasien(int index, String password_baru)
    {
        data_pasien_rumah_sakit.get(index).setPassword(password_baru);
    }

    public void proses_perubahan_data_alamat_pasien(int index, String alamat_baru)
    {
        data_pasien_rumah_sakit.get(index).setAlamat(alamat_baru);
    }

    public void proses_verifikasi_data_pasien(int index)
    {
        data_pasien_rumah_sakit.get(index).setVerifikasi("telah diverifikasi");
    }

    public void proses_registrasi_pasien( String inputan_nama ,String inputan_email,String inputan_password,String inputan_alamat_rumah)
    {
        data_pasien_rumah_sakit.add(new data_Pasien_Rumah_Sakit(inputan_nama,inputan_email,inputan_password,"sedang diverifikasi",inputan_alamat_rumah));
    }

    public void proses_menghapus_akun_pasien(int index)
    {
        data_pasien_rumah_sakit.remove(index);
    }
    public String getemail(int index){
        return data_pasien_rumah_sakit.get(index).getEmail();
    }
    public String getnama(int index)
    {
        return data_pasien_rumah_sakit.get(index).getNama();
    }

    public String getalamat(int index)
    {
        return data_pasien_rumah_sakit.get(index).getAlamat();
    }

    public String getverifikasi(int index)
    {
        return data_pasien_rumah_sakit.get(index).getVerifikasi();
    }
}
