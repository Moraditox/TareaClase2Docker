package SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultasSQLImple implements ConsultasSQL {
    public void informacion(){
        Conectar conexion = new Conectar();
        Connection cn = null;
        cn = conexion.conectar();

        System.out.println("----------------------INFORMACION----------------------");
        System.out.println("Con este metodo lo que hacemos es dar informacion sobre");
        System.out.println("las dietas que tienen los departamentos de informatica");
        System.out.println("               y son superiores a 30 euros");
        System.out.println("-------------------------------------------------------");

        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = cn.createStatement();
            rs = stm.executeQuery("SELECT * FROM DIETAS WHERE DEPARTAMENTO = 'Informática' AND CANTIDAD_EUROS > 30");
            while (rs.next()) {
                String ID = rs.getString("ID");
                String EMPLEADO = rs.getString("EMPLEADO");
                String DEPARTAMENTO = rs.getString("DEPARTAMENTO");
                String CANTIDAD_EUROS = rs.getString("CANTIDAD_EUROS");
                String CONCEPTO = rs.getString("CONCEPTO");
                System.out.println(ID + " - " + EMPLEADO + " - " + DEPARTAMENTO + " - " + CANTIDAD_EUROS + " - " + CONCEPTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void incrementar(){
        Conectar conexion = new Conectar();
        Connection cn = null;
        cn = conexion.conectar();

        System.out.println("----------------------INCREMENTAR-----------------------");
        System.out.println("Con este metodo lo que hacemos es incrementar todas las ");
        System.out.println("  dietas del departamento de ventas en un 10% cada una");
        System.out.println("--------------------------------------------------------");

        Statement stm = null;
        ResultSet rs = null;
        try {

            stm = cn.createStatement();
            System.out.println("Antes de la Incrementación");
            rs = stm.executeQuery("SELECT * FROM DIETAS WHERE DEPARTAMENTO = 'Ventas'");
            while (rs.next()) {
                String ID = rs.getString("ID");
                String EMPLEADO = rs.getString("EMPLEADO");
                String DEPARTAMENTO = rs.getString("DEPARTAMENTO");
                String CANTIDAD_EUROS = rs.getString("CANTIDAD_EUROS");
                String CONCEPTO = rs.getString("CONCEPTO");
                System.out.println(ID + " - " + EMPLEADO + " - " + DEPARTAMENTO + " - " + CANTIDAD_EUROS + " - " + CONCEPTO);
            }
            System.out.println("--------------------------------------------------------");
            System.out.println("Despues de la Incrementación");
            int num = stm.executeUpdate("UPDATE DIETAS SET CANTIDAD_EUROS = CANTIDAD_EUROS * 1.10 WHERE DEPARTAMENTO = 'Ventas'");
            rs = stm.executeQuery("SELECT * FROM DIETAS WHERE DEPARTAMENTO = 'Ventas'");
            while (rs.next()) {
                String ID = rs.getString("ID");
                String EMPLEADO = rs.getString("EMPLEADO");
                String DEPARTAMENTO = rs.getString("DEPARTAMENTO");
                String CANTIDAD_EUROS = rs.getString("CANTIDAD_EUROS");
                String CONCEPTO = rs.getString("CONCEPTO");
                System.out.println(ID + " - " + EMPLEADO + " - " + DEPARTAMENTO + " - " + CANTIDAD_EUROS + " - " + CONCEPTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
