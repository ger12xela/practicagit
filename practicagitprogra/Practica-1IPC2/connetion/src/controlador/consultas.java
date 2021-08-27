package controlador;


import java.sql.ResultSet;
import java.sql.PreparedStatement; 

public class consultas extends conexion{

    public boolean autenticacion(String USUARIO, String Contraseña){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from usuarios where usuario = ? and password = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, USUARIO);
            pst.setString(2, Contraseña);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)) return true;
            
        } catch (Exception e) {
            //TODO: handle exception
            System.err.println("error------ Fatal");
        }

        return false;
    }
    
}
