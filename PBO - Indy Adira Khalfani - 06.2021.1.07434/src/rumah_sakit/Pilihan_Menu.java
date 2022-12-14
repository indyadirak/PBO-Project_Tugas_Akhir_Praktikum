package rumah_sakit;

import java.util.Scanner;

public class Pilihan_Menu implements interface_menu
{
    Scanner input = new Scanner(System.in);
    public void pilihan_menu()
    {
        System.out.println("1. dokter");
        System.out.println("2. pasien");
        System.out.println("3. exit");
        System.out.print("masukkan pilihan : ");
        int input_pilihan_menu = input.nextInt();
        proses_pilihan_menu( input_pilihan_menu);
    }

    public void proses_pilihan_menu(int input_pilihan_menu)
    {
        switch (input_pilihan_menu)
        {
            case 1:
            {
                new pilihan_menu_dokter().pilihan_menu();
                break;
            }
            case 2:
            {
                new pilihan_menu_pasien().pilihan_menu();
                break;
            }
            case 3:
            {
                break;
            }
            default:
            {
                System.out.println("maaf, inputan anda salah.");
                pilihan_menu();
                break;
            }
        }
    }
}
