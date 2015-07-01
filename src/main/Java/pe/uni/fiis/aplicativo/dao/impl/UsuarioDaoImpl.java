package pe.uni.fiis.aplicativo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.uni.fiis.aplicativo.bean.Usuario;
import pe.uni.fiis.aplicativo.dao.UsuarioDao;
import pe.uni.fiis.aplicativo.dao.mapper.UsuarioMapper;

import java.util.List;

/**
 * Created by User on 20/06/2015.
 */
@Repository
public class UsuarioDaoImpl implements UsuarioDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void addusuario(Usuario u) {
        String sql = "Insert Into Usuario values (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{u.getIdUsuario(), u.getNombre(), u.getCui(),
                u.getContrasenha(),
                u.getTelefono(), u.getEmail(), u.getNombreMinimarket(),u.getDireccionMinimarket()});
    }
    public List<Usuario> obtener(Usuario u){
        String sql="Select * FROM Usuario ";

        return jdbcTemplate.query(sql, new UsuarioMapper());
    }
}


