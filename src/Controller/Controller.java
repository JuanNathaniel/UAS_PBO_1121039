/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CategoryUser;
import Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TUF GAMING
 */
public class Controller {

    static DatabaseHandler conn = new DatabaseHandler();

    public static boolean insertNew(User user) {
        conn.connect();
        String query = "INSERT INTO users(username, useremail, userpass,usergender, usercategory) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getUseremail());
            stmt.setString(3, user.getUserpass());
            stmt.setString(4, user.getUsergender());
            stmt.setInt(5, user.getUsercategory());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil insert");
            return (true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal insert");
            e.printStackTrace();
            return (false);
        }
    }
    
    //get all categoryname
    public static ArrayList<CategoryUser> getAllcUsers() {
        ArrayList<CategoryUser> cusers = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM categoryuser";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                CategoryUser user = new CategoryUser();
                user.setCategoryid(rs.getInt("categoryid"));
                user.setCategoryname(rs.getString("categoryname"));
                //
                cusers.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (cusers);
    }
    
    public static User getUser(String email, String pass) {
        conn.connect();
        String query = "SELECT * FROM users WHERE useremail='" + email + "' AND userpass ='"+ pass +"';";
        User user = new User();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                user.setUsername(rs.getString("username"));
                user.setUseremail(rs.getString("useremail"));
                user.setUserpass(rs.getString("userpass"));
                user.setUsergender(rs.getString("usergender"));
                user.setUsercategory(rs.getInt("usercategory"));
                //
                JOptionPane.showMessageDialog(null, "Data ditemukan");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gaketemu");
            e.printStackTrace();
        }
        return (user);
    }
    
    // SELECT ALL from table users
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM users";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setUserid(rs.getInt("userid"));
                user.setUsername(rs.getString("username"));
                user.setUseremail(rs.getString("useremail"));
                user.setUserpass(rs.getString("userpass"));
                user.setUsergender(rs.getString("usergender"));
                user.setUsercategory(rs.getInt("usercategory"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }
}
