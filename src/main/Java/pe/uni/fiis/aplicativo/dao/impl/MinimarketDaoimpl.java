package pe.uni.fiis.aplicativo.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import pe.uni.fiis.aplicativo.bean.Minimarket;
import pe.uni.fiis.aplicativo.bean.Usuario;
import pe.uni.fiis.aplicativo.dao.MinimarketDao;

/**
 * Created by User on 27/06/2015.
 */
public class MinimarketDaoimpl implements MinimarketDao{
    /*private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void addminimarket(Minimarket minimarket) {
        String sql = "Insert Into minimarket values (?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,minimarket.getIdMinimarket(),minimarket.getUsuario().getIdUsuario(),minimarket.getNombre(),minimarket.getDireccion());

    }*/
}
