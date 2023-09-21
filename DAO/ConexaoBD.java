package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {

    private static final String URL = ("jdbc:mysql://127.0.0.1:3306/bancodedados");
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection conn;
    
    public static Connection conectaBD() {

        try {
            if (conn == null) {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                return conn;
            }else {
                return conn;
            }
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Houve um erro ao tentar conectar ao banco de dados");
            return null;
        }

        

    }

}
