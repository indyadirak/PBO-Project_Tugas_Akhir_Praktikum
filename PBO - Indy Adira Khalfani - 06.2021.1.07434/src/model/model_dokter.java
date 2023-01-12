package model;

import entity.Data_Dokter_Rumah_Sakit;

import java.util.ArrayList;

public class model_dokter
{
    public ArrayList <Data_Dokter_Rumah_Sakit> data_dokter_rumah_sakit = new ArrayList<>();

    public void input_data(Data_Dokter_Rumah_Sakit data_dokter_rumah_sakit)
    {
        this.data_dokter_rumah_sakit.add(data_dokter_rumah_sakit);
    }

    public String menampilkan_nama(int index)
    {
        return data_dokter_rumah_sakit.get(index).getNama();
    }
    public String menampilkan_npm(int index)
    {
        return data_dokter_rumah_sakit.get(index).getNip();
    }

}
