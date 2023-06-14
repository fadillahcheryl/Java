package com.layouts;

import java.util.Scanner;
import com.control.DbControl;
import com.models.Produk;

public class UpdateData {
    public static void showUpdateData(String nama){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("SILAHKAN PILIH PRODUK YANG INGIN ANDA UBAH ");
        DbControl.getDatabase();
        System.out.print("Pilih Nama Produk: ");
        nama = sc.nextLine();
        
        
        System.out.println("SILAHKAN UPDATE PRODUK DIVASHOP ");
        System.out.println("----------------------------------------------");
        System.out.println("1. UPDATE NAMA ");
        System.out.println("2. UPDATE HARGA ");
        System.out.println("3. UPDATE JUMLAH ");
        System.out.println("----------------------------------------------");
        System.out.print("Pilih Menu Produk Aksesoris: ");

        try {
            
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                showEditNama(nama);
                    break;
                case 2:
                showEditHarga(nama);
                break;
                case 3:
                showEditStok(nama);
                break;
                default:
                System.out.println("MAAF NAMA YANG DIPILIH TIDAK TERSEDIA");
                Menu.showMenu();
            }
            System.out.println("----------------------------------------------");
            Menu.showMenu();
            sc.close();   
        } catch (Exception e) {
           System.out.println("Silahkan input produk dengan benar");
           Menu.showMenu();
        }
    }

    public static void showEditNama(String nama){
        Scanner sc = new Scanner(System.in);

        Produk produk = DbControl.getProdukbyNama(nama);

        System.out.println("----------------------------------------------");
        System.out.println("EDIT NAMA ");
        System.out.println("----------------------------------------------");
        System.out.println( "NAMA AWAL: "+ produk.getNama());
        System.out.println("----------------------------------------------");
        System.out.println("NAMA BARU: ");
        String namaBaru = sc.nextLine();
        DbControl.updateNamaDB(produk.getId(), namaBaru);

        System.out.println("----------------------------------------------");
        System.out.println("BERHASIL UPDATE NAMA PRODUK");
        System.out.println("----------------------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditHarga(String nama){
        Scanner sc = new Scanner(System.in);

        Produk produk = DbControl.getProdukbyNama(nama);

        System.out.println("----------------------------------------------");
        System.out.println("EDIT HARGA ");
        System.out.println("----------------------------------------------");
        System.out.println( "HARGA AWAL: "+ produk.getHarga());
        System.out.println("----------------------------------------------");
        System.out.println("HARGA BARU: ");
        long hargaBaru = sc.nextInt();
        DbControl.updateHargaDB(produk.getId(), hargaBaru);

        System.out.println("----------------------------------------------");
        System.out.println("BERHASIL UPDATE HARGA PRODUK");
        System.out.println("----------------------------------------------");
        Menu.showMenu();
        sc.close();
    }
    public static void showEditStok(String nama){
        Scanner sc = new Scanner(System.in);

        Produk produk = DbControl.getProdukbyNama(nama);

        System.out.println("----------------------------------------------");
        System.out.println("EDIT JUMLAH ");
        System.out.println("----------------------------------------------");
        System.out.println( "JUMLAH AWAL: "+ produk.getStok());
        System.out.println("----------------------------------------------");
        System.out.println("JUMLAH BARU: ");
        int stokBaru = sc.nextInt();
        DbControl.updateStokDB(produk.getId(), stokBaru);

        System.out.println("----------------------------------------------");
        System.out.println("BERHASIL UPDATE JUMLAH PRODUK");
        System.out.println("----------------------------------------------");
        Menu.showMenu();
        sc.close();
    }
}
