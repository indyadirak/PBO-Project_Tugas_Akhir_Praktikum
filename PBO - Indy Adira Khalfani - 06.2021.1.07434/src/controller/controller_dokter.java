package controller;

import entity.Data_Dokter_Rumah_Sakit;

public class controller_dokter
{
    int index = 0 ;
  public void input_data(String input_nama,String input_email,String input_password,String input_nip)
  {
      controller_utama.Model_Dokter.input_data(new Data_Dokter_Rumah_Sakit(input_nama,input_email,input_password,input_nip));
  }
  public int cek_data(String input_email,String input_password)
  {
      return controller_utama.Model_Dokter.cek_data(input_email,input_password);
  }

  public int perubahan_data_nama_pasien(String email, String nama)
  {
      return controller_utama.Model_Pasien.proses_perubahan_data_nama_pasien(email, nama);
  }

    public int perubahan_data_email_pasien(String email, String email_baru)
    {
        return controller_utama.Model_Pasien.proses_perubahan_data_email_pasien(email, email_baru);
    }

    public int perubahan_data_password_pasien(String email, String password_baru)
    {
        return controller_utama.Model_Pasien.proses_perubahan_data_password_pasien(email, password_baru);
    }

    public int perubahan_data_alamat_pasien(String email, String alamat_baru)
    {
        return controller_utama.Model_Pasien.proses_perubahan_data_alamat_pasien(email, alamat_baru);
    }

    public int verifikasi_data_pasien(String email)
    {
        return controller_utama.Model_Pasien.proses_verifikasi_data_pasien(email);
    }

    public void menampilkan_data_pasien()
    {
        controller_utama.Model_Pasien.proses_menampilkan_data_pasien();
    }

    public int menghapus_akun_pasien(String email)
    {
        return controller_utama.Model_Pasien.proses_menghapus_akun_pasien(email);
    }
}
