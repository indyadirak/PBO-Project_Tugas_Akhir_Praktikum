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
        index =  controller_utama.Model_Pasien.proses_menampilkan_data_pasien_2(inputan_email,inputan_password);
        return index;
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
