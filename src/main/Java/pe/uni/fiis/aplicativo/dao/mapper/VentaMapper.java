package pe.uni.fiis.aplicativo.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.uni.fiis.aplicativo.bean.Venta;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 28/06/2015.
 */
public class VentaMapper implements RowMapper<Venta> {
    public Venta mapRow(ResultSet resultSet, int i) throws SQLException {
        Venta venta=new Venta();
        venta.setIdVenta(resultSet.getInt("idVenta"));
        venta.setTotalPagado(resultSet.getDouble("totalPagado"));
        venta.setFechaDeventa(resultSet.getString("fechaDeVenta"));
        venta.setIdUsuario(resultSet.getInt("idusuario"));
        return venta;
    }
}
