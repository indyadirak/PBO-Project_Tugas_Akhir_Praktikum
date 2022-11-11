package proses;

import entity.Data_Dokter_Rumah_Sakit;
import entity.data_Pasien_Rumah_Sakit;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;
public class Pilihan_Menu implements tampilkan_data_induk
{

    Scanner input = new Scanner(System.in);

    String input_pilihan_menu_dokter, registrasi_email_dokter, registrasi_password_dokter, registrasi_nama_dokter ,registrasi_nip_dokter,login_email_dokter, login_password_dokter, verifikasi_data_pasien = "sedang di verifikasi",input_pilihan_menu_pasien,registrasi_email_pasien, registrasi_password_pasien, login_email_pasien, login_password_pasien, registrasi_nama_pasien, registrasi_alamat_pasien;
    int input_pilihan_menu,input_verifikasi_pasien,input_proses_perubahan_data_pasien;

    ArrayList <Data_Dokter_Rumah_Sakit> data_dokter = new ArrayList <>();
    ArrayList <data_Pasien_Rumah_Sakit> data_pasien = new ArrayList<>();
    public void pilihan_menu()
    {

        System.out.println("pilihan menu");
        System.out.println("1. Dokter. ");
        System.out.println("2. Pasien. ");
        System.out.println("3. exit");
        System.out.println("");
        System.out.printf("masukkan pilihan : ");
        input_pilihan_menu = input.nextInt();
        proses_pilihan_menu();
    }

    public void proses_pilihan_menu()
    {
        switch (input_pilihan_menu)
        {
            case 1:
            {
                pilihan_menu_dokter();
                break;
            }
            case 2:
            {
                pilihan_menu_pasien();
                break;
            }
            case 3:
            {
                System.out.println("anda segera keluar.....");
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
    public void pilihan_menu_dokter()
    {
        input_pilihan_menu_dokter = null;
        System.out.println("pilihan menu dokter : ");
        System.out.println("");
        System.out.println("1. Registrasi.");
        System.out.println("2. login.");
        System.out.println("3. kembali ke menu sebelumnya");
        System.out.printf("masukkan pilihan : ");
        input_pilihan_menu_dokter = input.next();
        proses_pilihan_menu(input_pilihan_menu_dokter);
    }


    public void proses_pilihan_menu( String input_pilihan_menu_2)
    {
        switch (input_pilihan_menu_2)
        {
            case "1":
            {
                Proses_registrasi_dokter();
                pilihan_menu_dokter();
                break;
            }
            case "2":
            {
                Proses_Login_Dokter();
                break;
            }

            case "3":
            {
                pilihan_menu();
                break;
            }
            default:
            {
                System.out.println("mohon maaf, pilihan anda tidak ada....");
                pilihan_menu_dokter();
                break;
            }
        }
    }

    public void Proses_registrasi_dokter()
    {

        System.out.println("Registrasi :");
        System.out.printf("email    = ");
        registrasi_email_dokter = input.next();
        System.out.printf("password = ");
        registrasi_password_dokter = input.next();
        System.out.println("nama    = ");
        registrasi_nama_dokter = input.next();
        System.out.println("NIP     = ");
        registrasi_nip_dokter = input.next();
        data_dokter.add(new Data_Dokter_Rumah_Sakit(registrasi_nama_dokter,registrasi_email_dokter,registrasi_password_dokter,registrasi_nip_dokter));
    }

    public void Proses_Login_Dokter()
    {
        System.out.println("Login : ");
        System.out.printf("email    = ");
        login_email_dokter = input.next();
        System.out.printf("password = ");
        login_password_dokter= input.next();
        proses_pengecekan_login_dokter();
    }

    public void proses_pengecekan_login_dokter()
    {
        boolean status_pencarian = false;
        for (int perulangan = 0; perulangan < data_dokter.toArray().length;perulangan++)
        {
            if (data_dokter.get(perulangan).getEmail().equals(login_email_dokter) && data_dokter.get(perulangan).getPassword().equals(login_password_dokter))
            {
                System.out.println("selamat datang Dr. "+ data_dokter.get(perulangan).getNama());
                System.out.println("dengan NIP "+ data_dokter.get(perulangan).getNip());
                proses_perubahan_data_pasien();
                status_pencarian = true;
            }
        }


        if (status_pencarian != true)
        {
            System.out.println("maaf email/password anda salah atau tidak ketemy");
            Proses_Login_Dokter();
        }
    }


    public void proses_perubahan_data_pasien()
    {
        System.out.println("menu merubah data :");
        System.out.println("1. email");
        System.out.println("2. password");
        System.out.println("3. nama.");
        System.out.println("4. alamat.");
        System.out.println("5. verifikasi data");
        System.out.println("6. kembali ke menu sebelumnya.");
        System.out.println("");
        System.out.printf("masukkan inputan : ");
        input_proses_perubahan_data_pasien = input.nextInt();

        proses_inputan_perubahan_data_pasien();

    }
    public void proses_inputan_perubahan_data_pasien()
    {
        switch (input_proses_perubahan_data_pasien)
        {
            case 1:
            {
                proses_perubahan_email();
                proses_perubahan_data_pasien();
                break;
            }
            case 2:
            {
                proses_perubahan_password();
                proses_perubahan_data_pasien();;
                break;
            }
            case 3:
            {
                proses_perubahan_nama();
                proses_perubahan_data_pasien();
                break;
            }
            case 4:
            {
                proses_perubahan_alamat();
                proses_perubahan_data_pasien();
                break;
            }
            case 5:
            {
                verifikasi_pasien();
                proses_perubahan_data_pasien();
                break;
            }
            case 6:
            {
                pilihan_menu_dokter();
                break;
            }
            default:
            {
                System.out.println("maaf, inputan anda salah, silakan pilih inputan lagi.....");
                proses_perubahan_data_pasien();
            }
        }
    }

    public void proses_perubahan_email()
    {
        String email_yang_dicari;
        boolean check_ketemu_email = false;

        System.out.printf("email yang ingin diubah : ");
        email_yang_dicari = input.next();

        //sistem pencarian
        for (int perulangan = 0; perulangan < data_pasien.toArray().length; perulangan++)
        {
            if (data_pasien.get(perulangan).getEmail().equals(email_yang_dicari))
            {
                String perubahan_email;
                System.out.println("email terdahulu    : "+data_pasien.get(perulangan).getEmail());
                System.out.printf("masukkan email baru : ");
                perubahan_email = input.next();
                data_pasien.get(perulangan).setEmail(perubahan_email);
                check_ketemu_email = true;
            }
        }

        if (check_ketemu_email == false)
        {
            System.out.println("mohon maaf, yang anda cari tidak ketemu/salah");
        }

    }

    public void  proses_perubahan_password()
    {
        String email_yang_dicari;
        boolean check_ketemu_email = false;

        System.out.printf("masukkan email password yang ingin diubah : ");
        email_yang_dicari = input.next();

        //sistem pencarian
        for (int perulangan = 0; perulangan < data_pasien.toArray().length; perulangan++)
        {
            if (data_pasien.get(perulangan).getEmail().equals(email_yang_dicari))
            {
                String perubahan_password;
                System.out.printf("masukkan password baru : ");
                perubahan_password = input.next();
                data_pasien.get(perulangan).setEmail(perubahan_password);
                check_ketemu_email = true;
            }
        }

        if (check_ketemu_email == false)
        {
            System.out.println("mohon maaf, yang anda cari tidak ketemu/salah");
        }

    }

    public void proses_perubahan_nama()
    {
        boolean check_validasi_pencarian_nama = false;
        String perubahan_nama,pencarian_nama;

        System.out.printf("masukkan nama yang ingin dirubah");
        pencarian_nama = input.next();

        for (int perulangan = 0; perulangan < data_pasien.toArray().length; perulangan++)
        {
            if (data_pasien.get(perulangan).getNama().equals(pencarian_nama))
            {
                System.out.println("data nama sebelumnya : "+data_pasien.get(perulangan).getNama());
                System.out.printf("masukkan nama baru    : ");
                perubahan_nama = input.next();
                data_pasien.get(perulangan).setNama(perubahan_nama);
                check_validasi_pencarian_nama = true;
            }
        }

        if (check_validasi_pencarian_nama == false)
        {
            System.out.printf("mohon maaf, nama yang anda cari tidak ada/salah");
        }
    }

    public void proses_perubahan_alamat()
    {
        boolean check_verifikasi_perubahan_alamat = false;
        String alamat_yang_dicari;

        System.out.printf("masukkan alamat sebelumnya : ");
        alamat_yang_dicari = input.next();

        for (int perulangan = 0; perulangan < data_pasien.toArray().length; perulangan++)
        {
            if (data_pasien.get(perulangan).getAlamat().equals(alamat_yang_dicari))
            {
                String perubahan_alamat;
                System.out.println("data alamat sebelumnya : "+data_pasien.get(perulangan).getAlamat());
                System.out.printf("masukkan alamat baru    : ");
                perubahan_alamat = input.next();
                data_pasien.get(perulangan).setAlamat(perubahan_alamat);
                check_verifikasi_perubahan_alamat = true;
            }
        }

        if (check_verifikasi_perubahan_alamat == false)
        {
            System.out.println("maaf alamat yang anda cari tidak ada/salah, silakan inputkan kembali");
        }
    }

    public void verifikasi_pasien()
    {
        String email_yang_dicari;
        boolean check_ketemu_email = false;

        System.out.printf("masukkan email untuk verifikasi data : ");
        email_yang_dicari = input.next();

        //sistem pencarian
        for (int perulangan = 0; perulangan < data_pasien.toArray().length; perulangan++)
        {
            if (data_pasien.get(perulangan).getEmail().equals(email_yang_dicari))
            {
                System.out.println("verifikasi data pasien apakah disetujui ?");
                System.out.println("1. Ya");
                System.out.println("2. tidak");
                System.out.println("");
                System.out.printf("masukkan pilihan = ");
                input_verifikasi_pasien = input.nextInt();

                check_ketemu_email = true;
                proses_verifikasi_pasien(perulangan);
            }
        }

        if (check_ketemu_email == false)
        {
            System.out.println("mohon maaf, yang anda cari tidak ketemu/salah");
        }


    }

    public void proses_verifikasi_pasien(int nomor)
    {
        if (input_verifikasi_pasien == 1)
        {
            data_pasien.get(nomor).setVerifikasi("telah disetujui") ;
            proses_perubahan_data_pasien();
        }
        else if (input_verifikasi_pasien == 2)
        {
            data_pasien.get(nomor).setVerifikasi("tidak disetujui");
            proses_perubahan_data_pasien();
        }
        else
        {
            System.out.println("mohon maaf anda salah input");
            verifikasi_pasien();
        }
    }

    public void pilihan_menu_pasien()
    {
        System.out.println("pilihan menu pasien");
        System.out.println("1. registrasi");
        System.out.println("2. login");
        System.out.println("3. kembali ke menu awal.");
        System.out.println("");
        System.out.printf("masukkan nomor : ");
        input_pilihan_menu_pasien = input.next();
        proses_pilihan_menu_pasien();
    }

    public void proses_pilihan_menu_pasien()
    {
        switch (input_pilihan_menu_pasien)
        {
            case "1":
            {
                registrasi_pasien();
                pilihan_menu_pasien();
                break;
            }
            case "2":
            {
                login_pasien();
                break;
            }
            case "3":
            {
                pilihan_menu();
                break;
            }
        }
    }

    public void registrasi_pasien()
    {
        System.out.println("registrasi pasien");
        System.out.printf("Email    = ");
        registrasi_email_pasien = input.next();
        System.out.printf("Password = ");
        registrasi_password_pasien = input.next();
        System.out.print("nama    = ");
        registrasi_nama_pasien = input.next();
        System.out.print("alamat  = ");
        registrasi_alamat_pasien = input.next();
        data_pasien.add(new data_Pasien_Rumah_Sakit(registrasi_nama_pasien,registrasi_email_pasien, registrasi_password_pasien,"sedang diverifikasi",registrasi_alamat_pasien));
    }

    public void login_pasien()
    {
        System.out.println("login pasien : ");
        System.out.printf("Email    = ");
        login_email_pasien = input.next();
        System.out.printf("Password = ");
        login_password_pasien = input.next();
        proses_login_pasien();
    }

    public void proses_login_pasien()
    {
        boolean check_proses_login_pasien = false;

        for (int perulangan = 0; perulangan < data_pasien.toArray().length; perulangan++)
        {
            if (data_pasien.get(perulangan).getEmail().equals(login_email_pasien) && data_pasien.get(perulangan).getPassword().equals(login_password_pasien))
            {
                System.out.println("nama anda = "+data_pasien.get(perulangan).getNama());
                System.out.println("alamat    = "+data_pasien.get(perulangan).getAlamat());
                System.out.println("status verifikasi anda " + data_pasien.get(perulangan).getVerifikasi());
                System.out.println("silakan tekan enter, untuk kembali ke menu...");
                new java.util.Scanner(System.in).nextLine();

                check_proses_login_pasien = true;
                pilihan_menu_pasien();

            }
        }

        if (check_proses_login_pasien == false)
        {
            System.out.println("email atau password anda salah.");
            login_pasien();
        }
    }





}