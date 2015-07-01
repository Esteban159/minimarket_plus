package pe.uni.fiis.aplicativo.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import pe.uni.fiis.aplicativo.bean.LoteDeproducto;
import pe.uni.fiis.aplicativo.bean.Usuario;
import pe.uni.fiis.aplicativo.dao.LoteDeProductoDao;
import pe.uni.fiis.aplicativo.dao.mapper.UsuarioMapper;

import java.util.List;

/**
 * Created by User on 20/06/2015.
 */
public class LoteDeProductoDaoImpl implements LoteDeProductoDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void addLoteDeProducto(LoteDeproducto loteDeProducto,Usuario usuario) {
        String sql="Insert into LoteDeProducto values(?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{loteDeProducto.getIdLoteDeProducto(),usuario.getIdUsuario(),
                loteDeProducto.getPedido().getIdPedido(),loteDeProducto.getTotalUnidades(),loteDeProducto.getPagoPorunidad(),loteDeProducto.getTotalpagado(),loteDeProducto.getFechaDeVencimiento(), loteDeProducto.getCantidadRestante(), loteDeProducto.getCantidadVendida()});
    }

    public List<LoteDeproducto> obtenerLoteDeProducto(Usuario usuario) {
        return null;
    }
}
