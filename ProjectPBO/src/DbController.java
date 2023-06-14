import java.sql.SQLException;

import config.MyConfig;
import java.util.ArrayList;
import java.util.List;
import models.Produk;

public class DbController extends MyConfig {

    public static List<Produk> getDatabase() {
        List<Produk> produkList = new ArrayList<>();
        connection();
        try {
            // query = "SELECT nama, harga, stok FROM db_tabel ORDER BY ID DESC";
            query = "SELECT ID,NAMA, STOCK, HARGA FROM tb_produk";

            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String nama = resultSet.getString("NAMA");
                int harga = resultSet.getInt("HARGA");
                int stock = resultSet.getInt("STOCK");

                Produk produk = new Produk(id, nama, stock, harga);
                produkList.add(produk);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produkList;
    }
    
    public static void updateHarga(int id, long harga) {
        connection();
        query = "UPDATE tb_produk SET HARGA=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, harga);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateJumlah(int id, long jumlah) {
        connection();
        query = "UPDATE tb_produk SET STOCK=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, jumlah);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean insertData(String nama, long harga, int jumlah) {
        connection();
        query = "INSERT INTO tb_produk (NAMA, HARGA, STOCK) VALUES (?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nama);
            preparedStatement.setLong(2, harga);
            preparedStatement.setInt(3, jumlah);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }   
    
        public static void updateNama(int id, String nama) {
        connection();
        query = "UPDATE tb_produk SET NAMA=? WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nama);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
        public static boolean deleteData(int id) {
        connection();
        query = "DELETE FROM tb_produk WHERE ID=?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            int affectedRowDelete = preparedStatement.executeUpdate();
            if (affectedRowDelete > 0) {
                return true;
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}