package com.oop.reguler.SiRental.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {

  private String DB_URL = "jdbc:mysql://localhost:3306/dbsirental";
  private String username;
  private String password;
  private Connection connection;

  public ConnectionManager() {
    this.username = "root";
    this.password = "";
  }

  public String getDB_URL() {
    return DB_URL;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public Connection connect() {
    if (connection == null) {
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(getDB_URL(),
                getUsername(), getPassword());
      } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(ConnectionManager.class.getName())
                .log(Level.SEVERE, null, ex);
      }
    }
    return connection;
  }

  public Connection disconnect() {
    try {
      connection.close();
    } catch (SQLException ex) {
      Logger.getLogger(ConnectionManager.class.getName())
              .log(Level.SEVERE, null, ex);
    }
    return connection;
  }
}
