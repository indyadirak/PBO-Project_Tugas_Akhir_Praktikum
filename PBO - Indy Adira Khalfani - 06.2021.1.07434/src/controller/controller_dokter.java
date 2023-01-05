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
      int kondisi = 0;
      for (int perulangan = 0; perulangan < controller_utama.Model_Dokter.data_dokter_rumah_sakit.size(); perulangan++)
      {
          if (controller_utama.Model_Dokter.data_dokter_rumah_sakit.get(perulangan).getEmail().equals(input_email) && controller_utama.Model_Dokter.data_dokter_rumah_sakit.get(perulangan).getPassword().equals(input_password))
          {
              kondisi = 1;
          }

      }
      return kondisi;
  }

  public int perubahan_data_nama_pasien(String email, String nama)
  {
      int status_ditemukan = 0;
      for (int perulangan = 0; perulangan < controller_utama.Model_Pasien.data_pasien_rumah_sakit.size();perulangan++)
      {
          if (controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
          {
              controller_utama.Model_Pasien.proses_perubahan_data_nama_pasien(perulangan,nama);
              status_ditemukan = 1;
          }
      }
      return status_ditemukan;
  }

    public int perubahan_data_email_pasien(String email, String email_baru)
    {
        int status_ditemukan = 0;
        for (int perulangan = 0; perulangan < controller_utama.Model_Pasien.data_pasien_rumah_sakit.size();perulangan++)
        {
            if (controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                controller_utama.Model_Pasien.proses_perubahan_data_email_pasien(perulangan, email_baru);
                status_ditemukan = 1;
            }
        }
        return status_ditemukan;

    }

    public int perubahan_data_password_pasien(String email, String password_baru)
    {
        int status_ditemukan = 0;
        for (int perulangan = 0; perulangan < controller_utama.Model_Pasien.data_pasien_rumah_sakit.size();perulangan++)
        {
            if (controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                controller_utama.Model_Pasien.proses_perubahan_data_password_pasien(index, password_baru);
                status_ditemukan = 1;
            }
        }
        return status_ditemukan;
    }

    public int perubahan_data_alamat_pasien(String email, String alamat_baru)
    {
        int status_ditemukan = 0;
        for (int perulangan = 0; perulangan < controller_utama.Model_Pasien.data_pasien_rumah_sakit.size();perulangan++)
        {
            if (controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                controller_utama.Model_Pasien.proses_perubahan_data_alamat_pasien(perulangan, alamat_baru);
                status_ditemukan = 1;
            }
        }
        return status_ditemukan;
    }

    public int verifikasi_data_pasien(String email)
    {
        int status_ditemukan = 0;
        for (int perulangan = 0; perulangan < controller_utama.Model_Pasien.data_pasien_rumah_sakit.size();perulangan++)
        {
            if (controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                controller_utama.Model_Pasien.proses_verifikasi_data_pasien(index);
                status_ditemukan = 1;
            }
        }
        return status_ditemukan;
    }



    public int menghapus_akun_pasien(String email)
    {
        int status_akun = 0;
        for (int perulangan = 0; perulangan <controller_utama.Model_Pasien.data_pasien_rumah_sakit.size(); perulangan++)
        {
            if (controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                controller_utama.Model_Pasien.proses_menghapus_akun_pasien(perulangan);
                status_akun = 1;
            }
        }
        return  status_akun;
    }
}
