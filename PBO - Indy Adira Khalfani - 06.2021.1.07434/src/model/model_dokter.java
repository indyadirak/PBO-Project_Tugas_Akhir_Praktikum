package model;

import entity.Data_Dokter_Rumah_Sakit;

import java.util.ArrayList;

public class model_dokter
{
    ArrayList <Data_Dokter_Rumah_Sakit> data_dokter_rumah_sakit = new ArrayList<>();

    public void input_data(Data_Dokter_Rumah_Sakit data_dokter_rumah_sakit)
    {
        this.data_dokter_rumah_sakit.add(data_dokter_rumah_sakit);
    }

    public int cek_data(String input_email,String input_password)
    {
        int kondisi = 0;
        for (int perulangan = 0; perulangan < data_dokter_rumah_sakit.size(); perulangan++)
        {
            if (data_dokter_rumah_sakit.get(perulangan).getEmail().equals(input_email) && data_dokter_rumah_sakit.get(perulangan).getPassword().equals(input_password))
            {
                kondisi = 1;
            }

        }
        return kondisi;
    }
}
