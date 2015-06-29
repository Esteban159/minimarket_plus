package pe.uni.fiis.aplicativo.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.uni.fiis.aplicativo.bean.Producto;
import pe.uni.fiis.aplicativo.bean.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 28/06/2015.
 */
public class ProductoMapper implements RowMapper<Producto> {

    public Producto mapRow(ResultSet resultSet, int i) throws SQLException {
        Producto producto=new Producto();
        producto.setIdProducto(resultSet.getInt("idProducto"));
        producto.setNombreDeProducto(resultSet.getString("nombreProducto"));
        producto.setMarcaDeProducto(resultSet.getString("marcaDeProducto"));
        producto.setPrecioDeVenta(resultSet.getDouble("precioDeVenta"));
        producto.setIdUsuario(resultSet.getInt("idUsuario"));
        return producto;
    }
}
