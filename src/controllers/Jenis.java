package controllers;

import java.sql.SQLException;
import database.Database;

public class Jenis extends Database{
    
    public Jenis() throws SQLException, ClassNotFoundException {
        super();
    }
    
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM Jenis";
        this.setQuery(sql);
        this.fetch();
    }
    
    public String[][] showJenis() throws SQLException {
        String[][] data = new String[this.lenJenis()][2];
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            data[i][0] = this.value.getString("Jenis");
            data[i][1] = this.value.getString("Keunggulan");
            i++;
        }
        return data;
    }
    
    public int lenJenis() throws SQLException {
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }
}
