package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EstudianteDAO implements Validar{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public int validar(Estudiante est){
        int r=0;
        String sql = "Select * from estudiante where nombre = ? and email = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getNom());
            ps.setString(2, est.getEmail());
            rs = ps.executeQuery();
            while(rs.next()){
                r = r+1;
                est.setNom(rs.getString("nombre"));
                est.setNom(rs.getString("email"));
            }
            if(r==1){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e){
            return 0;
        }
        
    }
    
}
