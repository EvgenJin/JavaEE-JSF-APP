/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Dao;

import evg.login.Entity.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	public static boolean validate(String user, String password) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            // Oracle SID = orcl , find yours in tnsname.ora
            try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@addr:port:base", user, password)) {
                if (conn != null) {
//                    System.out.println("Connected to the database!");
                    return true;
                } else {
//                    System.out.println("Failed to make connection!");
                    return false;
                }
            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//                return false;
            }
//            finally {}
//            catch (Exception e) {
//                e.printStackTrace();
//            }

            return false;
//		Connection con = null;
//		PreparedStatement ps = null;
//
//		try {
//			con = DataConnect.getConnection();
//			ps = con.prepareStatement("Select uname, password from Users where uname = ? and password = ?");
//			ps.setString(1, user);
//			ps.setString(2, password);
//
//			ResultSet rs = ps.executeQuery();
//
//			if (rs.next()) {
//				//result found, means valid inputs
//				return true;
//			}
//		} catch (SQLException ex) {
//			System.out.println("Login error -->" + ex.getMessage());
//			return false;
//		} finally {
//			DataConnect.close(con);
//		}
//		return false;
	}
}

