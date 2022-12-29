import rumah_sakit.Pilihan_Menu;

import javax.swing.*;


public class Main {
    public static void main(String[] args)
    {
        Pilihan_Menu gui_pilihan_menu = new Pilihan_Menu();
        gui_pilihan_menu.setContentPane(gui_pilihan_menu.pilihan_menu);
        gui_pilihan_menu.setSize(900, 900 );
        gui_pilihan_menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui_pilihan_menu.setVisible(true);

    }
}