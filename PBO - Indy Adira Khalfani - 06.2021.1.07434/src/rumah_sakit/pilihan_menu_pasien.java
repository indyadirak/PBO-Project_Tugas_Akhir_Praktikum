package rumah_sakit;

import java.util.Scanner;

public class pilihan_menu_pasien implements interface_menu
{
    Scanner input = new Scanner(System.in);
    public void pilihan_menu()
    {
        System.out.println("pilihan menu dokter");
        System.out.println("1. register");
        System.out.println("2. login");
        System.out.println("3. kembali ke menu sebelumnya.");
        System.out.print("masukkan pilihan : ");
        int inputan_pilihan_menu = input.nextInt();
        proses_pilihan_menu(inputan_pilihan_menu);
    }

    public void proses_pilihan_menu(int inputan_pilihan_menu)
    {
        switch (inputan_pilihan_menu)
        {
            case 1:
            {
                registrasi_pasien();
                pilihan_menu();
                break;
            }
            case 2:
            {
                login_pasien();
                pilihan_menu();
                break;
            }
            case 3:
            {
                new Pilihan_Menu().pilihan_menu();
                break;
            }
            default:
            {
                System.out.println("mohon maaf, pilihan anda tidak ada....");
                pilihan_menu();
                break;
            }
        }
    }

    public void registrasi_pasien()
    {
        System.out.println("masukkan : ");
        System.out.print("1. nama         = ");
        String inputan_nama = input.next();
        System.out.print("2. email        = ");
        String inputan_email = input.next();
        System.out.print("3. password     = ");
        String inputan_password =input.next();
        System.out.print("4. alamat rumah = ");
        String inputan_alamat_rumah = input.next();
        proses_registrasi_pasien(inputan_nama,inputan_email,inputan_password,inputan_alamat_rumah);
    }

    public void proses_registrasi_pasien( String inputan_nama ,String inputan_email,String inputan_password,String inputan_alamat_rumah)
    {
        object_deklarasi.Controller_Pasien.proses_registrasi_pasien(inputan_nama, inputan_email, inputan_password, inputan_alamat_rumah);
    }

    public void login_pasien()
    {
        System.out.println("masukkan : ");
        System.out.print("1. email    =  ");
        String inputan_email = input.next();
        System.out.print("2. password = ");
        String inputan_password = input.next();
        proses_login_pasien(inputan_email,inputan_password);
    }

    public void proses_login_pasien(String inputan_email, String inputan_password)
    {
        int hasil_pengecekan;
        hasil_pengecekan = object_deklarasi.Controller_Pasien.proses_menampilkan_data_pasien_2(inputan_email, inputan_password);

        if (hasil_pengecekan == 0)
        {
            System.out.println("maaf, data yang diinput tidak ada / salah....");
        }
    }

}
