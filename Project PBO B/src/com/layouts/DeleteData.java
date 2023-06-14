package com.layouts;

import java.util.Scanner;
import com.control.DbControl;

public class DeleteData {
    public static void showDeleteData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("SILAHKAN PILIH DATA YANG INGIN ANDA HAPUS ");
        DbControl.getDatabase();
        System.out.println("----------------------------------------------");
        System.out.print("PILIH NAMA PRODUK YANG INGIN ANDA HAPUS: ");
        String nama = sc.nextLine();
        System.out.println("----------------------------------------------");
       
        if (DbControl.deletDB(nama)) {
            System.out.println("BERHASIL MENGHAPUS DATA");
            
        }else{
            System.out.println("GAGAL MENGHAPUS DATA");
            DeleteData.showDeleteData();

        }
        Menu.showMenu();
        sc.close();   
    }
}
