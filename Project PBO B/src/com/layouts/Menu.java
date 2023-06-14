package com.layouts;

import java.util.Scanner;

public class Menu {
    public static void showMenu(){
        System.out.println("----------SELAMAT DATANG DI COFFEE SHOP----------");
        System.out.println("1] READ DATA ");
        System.out.println("2] INSERT DATA ");
        System.out.println("3] EDIT DATA ");
        System.out.println("4] DELETE DATA ");
        System.out.println("5] EXIT ");
        System.out.println("-------------------------------------------------");
        System.out.print("SILAHKAN PILIH ANGKA:  ");
        SelectMenu();
    }
    public static void SelectMenu(){
        Scanner sc = new Scanner(System.in);
        try {
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                ReadData.showReadData();
                break;
                case 2:
                InsertData.showInsertData();
                break;
                case 3:
                UpdateData.showUpdateData(null);
                break;
                case 4:
                DeleteData.showDeleteData();
                break;
                case 5:
                System.out.println("------------------------------------------");
                System.out.println("TERIMA KASIH DAN SAMPAI JUMPA");
                break;
    
                default:
                System.out.println("MAAF MENU TIDAK ADA DI PILIHAN");
                Menu.showMenu();
                break;
     
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("INPUTAN HARUS BERUPA ANGKA");
            showMenu();
        }
        
        
    }
}
