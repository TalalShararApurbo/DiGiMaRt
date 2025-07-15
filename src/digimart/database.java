/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digimart;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ART3M1S
 */
public class database {

    public static Connection connectDB() {

        try {

            Class.forName("com.mysql.jdbc.Drive");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/digimart", "root", "");

            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
