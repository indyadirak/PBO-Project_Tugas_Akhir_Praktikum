package model;

import entity.data_Pasien_Rumah_Sakit;

import java.util.ArrayList;

public class model_pasien
{
    ArrayList<data_Pasien_Rumah_Sakit> data_pasien_rumah_sakit = new ArrayList<>();
    public int proses_perubahan_data_nama_pasien(String email, String nama)
    {
        int status_ditemukan = 0;
        for (int perulangan = 0; perulangan < data_pasien_rumah_sakit.size();perulangan++)
        {
            if (data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                data_pasien_rumah_sakit.get(perulangan).setNama(nama);
               status_ditemukan = 1;
            }
        }
        return status_ditemukan;
    }

    public int proses_perubahan_data_email_pasien(String email, String email_baru)
    {
        int status_ditemukan = 0;
        for (int perulangan = 0; perulangan < data_pasien_rumah_sakit.size();perulangan++)
        {
            if (data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                data_pasien_rumah_sakit.get(perulangan).setEmail(email_baru);
                status_ditemukan = 1;
            }
        }
        return status_ditemukan;
    }

    public int proses_perubahan_data_password_pasien(String email, String password_baru)
    {
        int status_ditemukan = 0;
        for (int perulangan = 0; perulangan < data_pasien_rumah_sakit.size();perulangan++)
        {
            if (data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                data_pasien_rumah_sakit.get(perulangan).setPassword(password_baru);
                status_ditemukan = 1;
            }
        }
        return status_ditemukan;
    }

    public int proses_perubahan_data_alamat_pasien(String email, String alamat_baru)
    {
        int status_ditemukan = 0;
        for (int perulangan = 0; perulangan < data_pasien_rumah_sakit.size();perulangan++)
        {
            if (data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                data_pasien_rumah_sakit.get(perulangan).setAlamat(alamat_baru);
                status_ditemukan = 1;
            }
        }
        return status_ditemukan;
    }

    public int proses_verifikasi_data_pasien(String email)
    {
        int status_ditemukan = 0;
        for (int perulangan = 0; perulangan < data_pasien_rumah_sakit.size();perulangan++)
        {
            if (data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                data_pasien_rumah_sakit.get(perulangan).setVerifikasi("data telah diverifikasi");
                status_ditemukan = 1;
            }
        }
        return status_ditemukan;
    }

    public void proses_menampilkan_data_pasien()
    {
        for (int perulangan = 0; perulangan < data_pasien_rumah_sakit.size(); perulangan++)
        {
            System.out.println("==============================================");
            System.out.println("nomor"+(perulangan+1));
            System.out.println("nama       : "+data_pasien_rumah_sakit.get(perulangan).getNama());
            System.out.println("email      : "+data_pasien_rumah_sakit.get(perulangan).getEmail());
            System.out.println("alamat     : "+data_pasien_rumah_sakit.get(perulangan).getAlamat());
            System.out.println("verifikasi : "+data_pasien_rumah_sakit.get(perulangan).getVerifikasi());
            System.out.println("==============================================");
        }
    }

    public void proses_registrasi_pasien( String inputan_nama ,String inputan_email,String inputan_password,String inputan_alamat_rumah)
    {
        data_pasien_rumah_sakit.add(new data_Pasien_Rumah_Sakit(inputan_nama,inputan_email,inputan_password,"data anda sedang diverifikasi",inputan_alamat_rumah));
    }

    public int proses_menampilkan_data_pasien_2(String inputan_email, String inputan_password)
    {
        int hasil_pengecekan = 0;
        for (int perulangan = 0; perulangan < data_pasien_rumah_sakit.size(); perulangan++)
        {
            if (data_pasien_rumah_sakit.get(perulangan).getEmail().equals(inputan_email) && data_pasien_rumah_sakit.get(perulangan).getPassword().equals(inputan_password))
            {
                System.out.println("==============================================");
                System.out.println("nama       : "+data_pasien_rumah_sakit.get(perulangan).getNama());
                System.out.println("email      : "+data_pasien_rumah_sakit.get(perulangan).getEmail());
                System.out.println("alamat     : "+data_pasien_rumah_sakit.get(perulangan).getAlamat());
                System.out.println("verifikasi : "+data_pasien_rumah_sakit.get(perulangan).getVerifikasi());
                System.out.println("==============================================");
                hasil_pengecekan = 1;
            }
        }
        return  hasil_pengecekan;
    }

    public int proses_menghapus_akun_pasien(String email)
    {
        int status_akun = 0;
        for (int perulangan = 0; perulangan < data_pasien_rumah_sakit.size(); perulangan++)
        {
            if (data_pasien_rumah_sakit.get(perulangan).getEmail().equals(email))
            {
                data_pasien_rumah_sakit.remove(perulangan);
                status_akun = 1;
            }
        }
        return  status_akun;
    }
}
