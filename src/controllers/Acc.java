package controllers;

import java.sql.SQLException;

import javax.swing.*;

import database.Database;

public class Acc extends Database {
    public Acc() throws ClassNotFoundException, SQLException {
        super();
    }

    public boolean authentication(String username, String password) throws SQLException {
        String sql = String.format("SELECT * FROM user WHERE username = '%s' AND password = '%s'", username, password);
        this.setQuery(sql);
        this.fetch();
        
        while(this.value.next()) {
            if(this.value.getString("username") != null) {
                return true;
            }
        }
        
        return false;
    }

    public boolean validation(String username) {
        return true;
    }

    public void logout() {
        
    }
}
