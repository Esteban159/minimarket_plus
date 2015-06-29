package pe.uni.fiis.aplicativo.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.uni.fiis.aplicativo.bean.Comprobante;
import pe.uni.fiis.aplicativo.bean.Venta;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 28/06/2015.
 */
public class ComprobanteMapper implements RowMapper<Comprobante> {
    public Comprobante mapRow(ResultSet resultSet, int i) throws SQLException {
        Comprobante comprobante=new Comprobante();
        comprobante.setIdComprobante(resultSet.getInt("idComprobante"));
        comprobante.setVenta(new Venta());
        comprobante.getVenta().setIdVenta(resultSet.getInt("idVenta"));
        comprobante.setNombreCliente(resultSet.getString("nombreCliente"));
        comprobante.setTipodeComprobante(resultSet.getString("tipoDeComprobante"));
        comprobante.setRucCliente(resultSet.getString("rucCliente"));
        return comprobante;
    }
}
