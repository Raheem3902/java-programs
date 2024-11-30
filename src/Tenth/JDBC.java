package Tenth;

import java.sql.*;
 class JdbcCRUDExample {

    // Database URL, username, and password
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root"; // change this as per your setup
    static final String PASSWORD = "password"; // change this as per your setup

    public static void main(String[] args) {

        // Create a new user
        createUser("John Doe", 25);

        // Read users from database
        readUsers();

        // Update a user's age
        updateUser(1, 30);

        // Delete a user
        deleteUser(1);

        // Read users after CRUD operations
        readUsers();
    }

    // CREATE operation
    public static void createUser(String name, int age) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String query = "INSERT INTO users (name, age) VALUES (?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, name);
                stmt.setInt(2, age);
                int rowsAffected = stmt.executeUpdate();
                System.out.println("Inserted " + rowsAffected + " row(s)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ operation
    public static void readUsers() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String query = "SELECT * FROM users";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
                System.out.println("Users in database:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE operation
    public static void updateUser(int id, int newAge) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String query = "UPDATE users SET age = ? WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, newAge);
                stmt.setInt(2, id);
                int rowsAffected = stmt.executeUpdate();
                System.out.println("Updated " + rowsAffected + " row(s)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE operation
    public static void deleteUser(int id) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String query = "DELETE FROM users WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, id);
                int rowsAffected = stmt.executeUpdate();
                System.out.println("Deleted " + rowsAffected + " row(s)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
