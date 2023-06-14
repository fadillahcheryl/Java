package com.layouts;

import java.util.Scanner;
import com.control.DbControl;

public class ReadData {
    public static void showReadData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("DATA PRODUK COFFEE SHOP");
        DbControl.getDatabase();
        System.out.println("------------------------------------");
        
        System.out.println("1. MENU ");
        System.out.println("2. EXIT "); 
        System.out.print("Pilih: ");
        try {
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                Menu.showMenu();
                    break;
                case 2:
                System.out.println("------------------------------------------");
                System.out.println("SAMPAI JUMPA");
                System.out.println("------------------------------------------");
                System.exit(selectMenu);
                break;
            
                default:
                System.out.println("---------------------------------------------");
                System.out.println("MAAF MENU YANG DIPILIH TIDAK TERSEDIA");
                ReadData.showReadData();
                    break;
            }
            
        } catch (Exception e) {
            System.out.println(("---------------------------------------------"));
               System.out.println("MASUKKAN INPUTAN BERUPA ANGKA");
               ReadData.showReadData();
        }
    
        System.out.println(("------------------------------------"));
        Menu.showMenu();
        sc.close();
    }
}
