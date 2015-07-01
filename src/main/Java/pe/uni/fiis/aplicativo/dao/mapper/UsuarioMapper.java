package pe.uni.fiis.aplicativo.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.uni.fiis.aplicativo.bean.Usuario;


import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 27/06/2015.
 */
public class UsuarioMapper implements RowMapper<Usuario> {
    public Usuario mapRow(ResultSet resulset, int size)throws SQLException {
        Usuario u=new Usuario();
        u.setIdUsuario(resulset.getInt("idUsuario"));
        u.setNombre(resulset.getString("nombre"));
        u.setCui(resulset.getInt("cui"));
        u.setContrasenha(resulset.getString("contrasenha"));
        u.setTelefono(resulset.getInt("telefono"));
        u.setEmail(resulset.getString("email"));
        u.setNombreMinimarket(resulset.getString("nombreMinimarket"));
        u.setDireccionMinimarket(resulset.getString("direccionMinimarket"));
        return u;
    }
}


