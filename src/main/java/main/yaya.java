package main;

import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class yaya {
    // JDBC driver name and database URL

    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://alrose.cf:3306/al?useUnicode=true&passwordCharacterEncoding=utf-8";

    //  Database credentials
    static String USER = Login.ID0;
    static String PASS = Login.Pass;

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        System.out.println(PASS);
        try {
            //STEP 2: Register JDBC driver
            Class.forName("org.mariadb.jdbc.Driver");
            USER = Login.ID0;
            PASS = Login.Pass;
            //STEP 3: Open a connection
            System.out.println("[Alroes Client | Log] Connecting to a selected database...");
            conn = DriverManager.getConnection(
                    DB_URL, USER, PASS);
            System.out.println("[Alroes Client | Log] Connected database successfully...");
            Login.frm.dispose();
            screen.main(args);
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
            System.out.println("[Alroes Client | ERROR] "+se);
            JOptionPane.showMessageDialog(null,"사용자 아이디가 없거나 비밀번호 또는 아이디가 틀렸습니다","로그인",JOptionPane.ERROR_MESSAGE);
            return;
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            System.out.println("[Alroes Client | ERROR] "+e);
            return;
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                System.out.println("[Alroes Client | ERROR] "+se);
                JOptionPane.showMessageDialog(null,"사용자 아이디가 없거나 비밀번호 또는 아이디가 틀렸습니다","로그인",JOptionPane.ERROR_MESSAGE);
                return;
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
                System.out.println("[Alroes Client | ERROR] "+se);
                return;
            }//end finally try
        }//end try
        System.out.println("[Alroes Client | Log] Connection has been finished");Connection conn = null;
        Statement stmt = null;
        System.out.println(PASS);
        try {
            //STEP 2: Register JDBC driver
            Class.forName("org.mariadb.jdbc.Driver");
            USER = Login.ID0;
            PASS = Login.Pass;
            //STEP 3: Open a connection
            System.out.println("[Alroes Client | Log] Connecting to a selected database...");
            conn = DriverManager.getConnection(
                    DB_URL, USER, PASS);
            System.out.println("[Alroes Client | Log] Connected database successfully...");
            Login.frm.dispose();
            screen.main(args);
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
            System.out.println("[Alroes Client | ERROR] "+se);
            JOptionPane.showMessageDialog(null,"사용자 아이디가 없거나 비밀번호 또는 아이디가 틀렸습니다","로그인",JOptionPane.ERROR_MESSAGE);
            return;
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            System.out.println("[Alroes Client | ERROR] "+e);
            return;
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                System.out.println("[Alroes Client | ERROR] "+se);
                JOptionPane.showMessageDialog(null,"사용자 아이디가 없거나 비밀번호 또는 아이디가 틀렸습니다","로그인",JOptionPane.ERROR_MESSAGE);
                return;
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
                System.out.println("[Alroes Client | ERROR] "+se);
                return;
            }//end finally try
        }//end try
        System.out.println("[Alroes Client | Log] Connection has been finished");
    }//end main

}//end JDBCExample
