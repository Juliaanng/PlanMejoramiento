package Modelo;

import java.sql.*;

public class UsuarioDao implements Validar  {
    
    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;    
    
    @Override 
    public int validar(Usuario usu) {
            String sql = "Select * from Usuario where correo=? and contrasenna=?";
            try{
                con=cn.getConexion();
                ps=con.prepareStatement(sql);
                ps.setString(1, usu.getCorreo());
                ps.setString(1, usu.getContrasenna());
                rs=ps.executeQuery();
                while (rs.next()) {
                usu.setCorreo(rs.getString("correo"));
                usu.setContrasenna(rs.getString("contrasenna"));            
            }
                if (r==1){
                    return 1;
                } else {
                    return 0;
                }
            } catch (Exception e){
                  return  0;
            }
               
    }
}
    
   


