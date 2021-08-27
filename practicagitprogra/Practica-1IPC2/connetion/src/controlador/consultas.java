package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class consultas extends conexion {

    public boolean autenticacion(String USUARIO, String Contraseña) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from usuarios where usuario = ? and password = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, USUARIO);
            pst.setString(2, Contraseña);
            rs = pst.executeQuery();

            if (rs.absolute(1))
                return true;

        } catch (Exception e) {
            System.err.println("error------ Fatal");
        } finally {
            try {
                if (getConexion() != null)
                    getConexion().close();
                if (pst != null)
                    pst.close();
                if (rs != null)
                    rs.close();
                ;

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return false;
    }

}
