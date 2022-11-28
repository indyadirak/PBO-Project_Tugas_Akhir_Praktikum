package entity;

import entity.biodata_rumah_sakit;

public class Data_Dokter_Rumah_Sakit extends biodata_rumah_sakit
{
    //digunakan untuk menyimpan data dokter+
    protected String nip;

    public Data_Dokter_Rumah_Sakit(String nama, String email, String password, String nip) {
        super(nama, email, password);
        this.nip = nip;
    }


    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
