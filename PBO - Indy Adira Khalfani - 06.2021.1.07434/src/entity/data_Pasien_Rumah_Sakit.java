package entity;

import entity.biodata_rumah_sakit;

public class data_Pasien_Rumah_Sakit extends biodata_rumah_sakit
{
    protected String verifikasi,alamat;


    public data_Pasien_Rumah_Sakit(String nama, String email, String password, String verifikasi, String alamat) {
        super(nama, email, password);
        this.verifikasi = verifikasi;
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getVerifikasi() {
        return verifikasi;
    }

    public void setVerifikasi(String verifikasi) {
        this.verifikasi = verifikasi;
    }
}