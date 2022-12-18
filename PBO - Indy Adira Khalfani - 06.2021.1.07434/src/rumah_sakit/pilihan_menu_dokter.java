package rumah_sakit;

import controller.controller_dokter;

import java.util.Scanner;

public class pilihan_menu_dokter implements interface_menu
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
                registrasi_akun_dokter();
                pilihan_menu();
                break;
            }
            case 2:
            {
                login_akun_dokter();
                break;
            }
            case 3:
            {
                new Pilihan_Menu().pilihan_menu();
                break;
            }
        }
    }

    public void registrasi_akun_dokter()
    {
        System.out.println("masukkan :");
        System.out.print("1. nama      = ");
        String input_nama = input.next();
        System.out.print("2. Email     = ");
        String input_email = input.next();
        System.out.print("3. password  = ");
        String input_password = input.next();
        System.out.print("4. nip       = ");
        String input_nip = input.next();
        proses_registrasi_akun_dokter(input_nama,input_email,input_password,input_nip);
    }

    public void proses_registrasi_akun_dokter(String input_nama,String input_email,String input_password,String input_nip)
    {
        object_deklarasi.Controller_Dokter.input_data(input_nama,input_email,input_password,input_nip);
    }

    public void login_akun_dokter()
    {
        System.out.print("email : ");
        String input_email = input.next();
        System.out.print("password = ");
        String input_password = input.next();
        proses_login_akun_dokter(input_email,input_password);
    }

    public void proses_login_akun_dokter(String input_email,String input_password )
    {
        int nilai_cek = object_deklarasi.Controller_Dokter.cek_data(input_email, input_password);

        if (nilai_cek == 1)
        {
            pilihan_menu_perubahan_dokter();
        }
        else
        {
            System.out.println("inputan anda salah / tidak ada");
            login_akun_dokter();
        }
    }
// tugas, menambah delete akun
    public void pilihan_menu_perubahan_dokter()
    {
        System.out.println("pilihan menu : ");
        System.out.println("1. merubah data nama pasien");
        System.out.println("2. merubah data email pasien");
        System.out.println("3. merubah data password pasien");
        System.out.println("4. merubah data alamat pasien");
        System.out.println("5. memverifikasi data pasien");
        System.out.println("6. melihat data pasien");
        System.out.println("7. menghapus akun pasien");
        System.out.println("8. kembali ke menu sebelumnya.");
        System.out.println(" ");
        System.out.print("masukkan pilihan menu : ");
        int inputan_pilihan_menu_perubahan_dokter = input.nextInt();
        proses_pilihan_menu_perubahan_dokter(inputan_pilihan_menu_perubahan_dokter);
    }

    public void proses_pilihan_menu_perubahan_dokter(int inputan_pilihan_menu_perubahan_dokter)
    {
        switch (inputan_pilihan_menu_perubahan_dokter)
        {
            case 1:
            {
                perubahan_nama_pasien();
                pilihan_menu_perubahan_dokter();
                break;
            }
            case 2:
            {
                perubahan_nama_email();
                pilihan_menu_perubahan_dokter();
                break;
            }
            case 3:
            {
                perubahan_password_pasien();
                pilihan_menu_perubahan_dokter();
                break;
            }
            case 4:
            {
                perubahan_alamat_pasien();
                pilihan_menu_perubahan_dokter();
            }
            case 5:
            {
                verifikasi_data_pasien();
                pilihan_menu_perubahan_dokter();
            }
            case 6:
            {
                proses_menampilkan_data_pasien();
                pilihan_menu_perubahan_dokter();
            }
            case 7:
            {
                menghapus_akun_pasien_page();
                pilihan_menu_perubahan_dokter();
            }
            case 8:
            {
                pilihan_menu();
                break;
            }
            default:
            {
                System.out.println("mohon maaf, pilihan anda tidak ada....");
                pilihan_menu_perubahan_dokter();
                break;
            }
        }
    }

    public void perubahan_nama_pasien()
    {
        System.out.print("masukkan email     : ");
        String email = input.next();
        System.out.print("masukkan nama baru : ");
        String nama = input.next();
        proses_perubahan_nama_pasien(email, nama);
    }

    public void proses_perubahan_nama_pasien(String email,String nama)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_nama_pasien(email, nama);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil dirubah");
        }
        else
        {
            System.out.println("data tidak berhasil dirubah...");
        }
    }

    public void perubahan_nama_email()
    {
        System.out.print("masukkan email     : ");
        String email = input.next();
        System.out.print("masukkan email baru : ");
        String email_baru = input.next();
        proses_perubahan_email_pasien(email, email_baru);
    }

    public void proses_perubahan_email_pasien(String email,String email_baru)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_email_pasien(email, email_baru);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil dirubah");
        }
        else
        {
            System.out.println("data tidak berhasil dirubah...");
        }
    }

    public void perubahan_password_pasien()
    {
        System.out.print("masukkan email     : ");
        String email = input.next();
        System.out.print("masukkan password baru : ");
        String password_baru = input.next();
        proses_perubahan_password_pasien(email, password_baru);
    }

    public void proses_perubahan_password_pasien(String email,String password_baru)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_password_pasien(email, password_baru);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil dirubah");
        }
        else
        {
            System.out.println("data tidak berhasil dirubah...");
        }
    }

    public void perubahan_alamat_pasien()
    {
        System.out.print("masukkan email     : ");
        String email = input.next();
        System.out.print("masukkan alamat baru : ");
        String alamat_baru = input.next();
        proses_perubahan_alamat_pasien(email, alamat_baru);
    }

    public void proses_perubahan_alamat_pasien(String email,String password_baru)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.perubahan_data_alamat_pasien(email, password_baru);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil dirubah");
        }
        else
        {
            System.out.println("data tidak berhasil dirubah...");
        }
    }

    public void verifikasi_data_pasien()
    {
        System.out.print("masukkan email     : ");
        String email = input.next();
        proses_verifikasi_data_pasien(email);
    }

    public void proses_verifikasi_data_pasien(String email)
    {
        int nilai_check;

        nilai_check = object_deklarasi.Controller_Dokter.verifikasi_data_pasien(email);
        if (nilai_check == 1)
        {
            System.out.println("data berhasil diverifikasi");
        }
        else
        {
            System.out.println("data tidak berhasil diverifikasi...");
        }
    }

    public void proses_menampilkan_data_pasien()
    {
        object_deklarasi.Controller_Dokter.menampilkan_data_pasien();
    }

    public void menghapus_akun_pasien_page()
    {
        System.out.print("masukkan email pasien : ");
        String inputan_email = input.next();
        proses_menghapus_pasien(inputan_email);

    }

    public void proses_menghapus_pasien(String inputan_email)
    {
        int nilai_pengecekan = object_deklarasi.Controller_Dokter.menghapus_akun_pasien(inputan_email);

        if (nilai_pengecekan == 1)
        {
            System.out.println("data berhasil dihapus");
        }
        else
        {
            System.out.println("data tidak berhasil dihapus");
        }
    }
}
