package SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Conectar conexion = new Conectar();
        Connection cn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            cn = conexion.conectar();
            stm = cn.createStatement();
            rs = stm.executeQuery("SELECT * FROM DIETAS-");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}