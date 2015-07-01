package pe.uni.fiis.aplicativo.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import pe.uni.fiis.aplicativo.bean.LoteDeproducto;
import pe.uni.fiis.aplicativo.bean.Producto;
import pe.uni.fiis.aplicativo.bean.Usuario;
import pe.uni.fiis.aplicativo.dao.ProductoDao;
import pe.uni.fiis.aplicativo.dao.mapper.LoteDeproductoMapper;
import pe.uni.fiis.aplicativo.dao.mapper.ProductoMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 28/06/2015.
 */
public class ProductoDaoImpl implements ProductoDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public List<LoteDeproducto> extraerLotes(String c,String m,Usuario u) {
        Producto producto;
        List<LoteDeproducto> lista=new ArrayList<LoteDeproducto>();
        producto=extraerProducto(c,m,u);
        String sql="Select * From LoteDeProducto Where idProducto=? And idUsuario=?";
        lista=jdbcTemplate.query(sql,new Object[]{producto.getIdProducto(),u.getIdUsuario()},new LoteDeproductoMapper());
        for(int i=0;i<lista.size();i++) {
            lista.get(i).setProducto(producto);
        }
        return lista;
    }

    public Producto extraerProducto(String c, String m,Usuario usuario) {
        String sql="Select * From Producto Where nombreDeProducto=? And marcaDeProducto=? And idUsuario=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{c,m,usuario.getIdUsuario()},new ProductoMapper());
    }
}
