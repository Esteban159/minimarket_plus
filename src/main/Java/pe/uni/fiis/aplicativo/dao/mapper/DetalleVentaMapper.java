package pe.uni.fiis.aplicativo.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.uni.fiis.aplicativo.bean.DetalleVenta;
import pe.uni.fiis.aplicativo.bean.LoteDeproducto;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 28/06/2015.
 */
public class DetalleVentaMapper implements RowMapper<DetalleVenta> {

    public DetalleVenta mapRow(ResultSet resultSet, int i) throws SQLException {
        DetalleVenta detalleVenta=new DetalleVenta();
        detalleVenta.setIdDetalleVenta(resultSet.getInt("idDetalleVenta"));
        detalleVenta.setIdVenta(resultSet.getInt("idVenta"));
        detalleVenta.setCantidadComprada(resultSet.getInt("cantidadComprada"));
        detalleVenta.setTotalPagado(resultSet.getDouble("totalPagado"));
        detalleVenta.setLoteDeproducto(new LoteDeproducto());
        detalleVenta.getLoteDeproducto().setIdLoteDeProducto(resultSet.getInt("idLoteDeProducto"));
        return detalleVenta;
    }
}
