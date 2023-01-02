package controller;

public class controller_pasien
{
    int index;
    public void proses_registrasi_pasien( String inputan_nama ,String inputan_email,String inputan_password,String inputan_alamat_rumah)
    {
        controller_utama.Model_Pasien.proses_registrasi_pasien(inputan_nama, inputan_email, inputan_password, inputan_alamat_rumah);
    }
    public int proses_menampilkan_data_pasien_2(String inputan_email, String inputan_password)
    {
        int hasil_pengecekan = 0;
        for (int perulangan = 0; perulangan < controller_utama.Model_Pasien.data_pasien_rumah_sakit.size(); perulangan++)
        {
            if (controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getEmail().equals(inputan_email) && controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getPassword().equals(inputan_password))
            {
                System.out.println("nomor"+(perulangan+1));
                System.out.println("nama       : "+controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getNama());
                System.out.println("email      : "+controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getEmail());
                System.out.println("alamat     : "+controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getAlamat());
                System.out.println("verifikasi : "+controller_utama.Model_Pasien.data_pasien_rumah_sakit.get(perulangan).getVerifikasi());
                hasil_pengecekan = 1;
            }
        }
        return  hasil_pengecekan;

    }

    public String mendapat_nama()
    {
        return controller_utama.Model_Pasien.getnama();
    }

    public String mendapat_email()
    {
        return controller_utama.Model_Pasien.getemail();
    }
    public String mendapat_alamat()
    {
        return controller_utama.Model_Pasien.getalamat();
    }

    public String mendapat_verifikasi()
    {
        return controller_utama.Model_Pasien.getverifikasi();
    }




}
