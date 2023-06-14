package com.layouts;

import java.util.Scanner;
import com.control.DbControl;

public class InsertData {
    public static void showInsertData(){
        try {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("SILAHKAN INPUT PRODUK YANG INGIN ANDA TAMBAHKAN");
            System.out.println("-----------------------------------------------");
            System.out.println("NAMA PRODUK");
            String name = sc.nextLine();
            System.out.println("HARGA PRODUK");
            long harga = sc.nextInt();
            System.out.println("JUMLAH PRODUKK");
            int jumlah = sc.nextInt();
            System.out.println("------------------------------------");
            if (DbControl.insertDB(name, harga, jumlah)) {
                System.out.println("BERHASIL MENAMBAHKAN PRODUK");
                
            }else{
                System.out.println("GAGAL MENAMBAHKAN DATA");
            }
            System.out.println("------------------------------------");
            Menu.showMenu();
            sc.close();
        
        } catch (Exception e) {
            InsertData.showInsertData();
        }
    }
}
