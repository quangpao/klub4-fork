package com.database;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import DAO.UserDAO;


public class DatabaseTests {
    
    @DisplayName("Test database connection")
    void testDatabaseConnection() {

        assertEquals(true, UserDAO.checkRegister("database@gmail.com"));

    }

    @DisplayName("Insert user")
    void testInsertUser() {
        String password = "1292131232";
        assertEquals(true, UserDAO.registerUser("Thử Database", "database@gmail.com", password, Date.valueOf("1999-12-12"), "Hà Nội"));
    }
    
    @DisplayName("Test BCrypt")
    void testBCrypt() {
        String password = "1292131232";
        assertEquals(true, UserDAO.checkLogin("database@gmail.com", password));
        
    }

    @DisplayName("Delete user")
    void testDeleteUser() {
        assertEquals(true, UserDAO.deleteUser(
                UserDAO.getUserByEmail("database@gmail.com").getUserID()));

    }
}
