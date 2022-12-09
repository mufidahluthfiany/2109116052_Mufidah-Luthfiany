package controllers;

import java.sql.SQLException;

import database.Database;

public class Buah extends Database {
    // Constructor untuk Connect ke Database
    public Buah() throws ClassNotFoundException, SQLException {
        super();
    }

    // Create
    public void insertbuah(String buah, String jenis, String harga) throws SQLException {
        String sql = String.format("INSERT INTO buah (Nama_buah, Jenis, Harga) VALUE ('%s', '%s', '%s')", buah, jenis,
                harga);
        this.setQuery(sql);
        this.execute();
    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM buah";
        this.setQuery(sql);
        this.fetch();
    }
    
    // Update
    public void updatebuah (int id, String buah, String jenis, String harga) throws SQLException {
        String sql = String.format("UPDATE buah SET Nama_buah = '%s', Jenis = '%s', Harga = '%s' WHERE ID_buah = %d",
                
                buah, jenis, harga, id);
        this.setQuery(sql);
        this.execute();
    }

    // Delete
    public void deletebuah(int id) throws SQLException {
        String sql = String.format("DELETE FROM buah WHERE ID_buah = %d", id);
        this.setQuery(sql);
        this.execute();
    }

    // Validation untuk mencegah redudansi data
    public boolean checkbuah(String buah) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (this.value.getString("buah") == buah) {
                return false;
            }
        }
        return true;
    }

    // Print buah
    public String[][] showbuah() throws SQLException {
        String[][] data = new String[this.lenbuah()][4];
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            data[i][0] = Integer.toString(this.value.getInt("ID_buah"));
            data[i][1] = this.value.getString("Nama_buah");
            data[i][2] = this.value.getString("Jenis");
            data[i][3] = this.value.getString("Harga");
            i++;
        }
        return data;
    }
    
    public int lenbuah() throws SQLException {
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }
}
