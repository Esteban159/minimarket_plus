package pe.uni.fiis.aplicativo.dao.mapper;

import pe.uni.fiis.aplicativo.bean.LoteDeproducto;
import pe.uni.fiis.aplicativo.bean.Pedido;
import pe.uni.fiis.aplicativo.bean.Producto;
import pe.uni.fiis.aplicativo.bean.Usuario;

import javax.swing.tree.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 27/06/2015.
 */
public class LoteDeproductoMapper implements org.springframework.jdbc.core.RowMapper<LoteDeproducto> {
    public LoteDeproducto mapRow(ResultSet resultSet, int i) throws SQLException {
        LoteDeproducto loteDeproducto=new LoteDeproducto();
        loteDeproducto.setIdLoteDeProducto(resultSet.getInt("idLoteDeProducto"));
        loteDeproducto.setUsuario(new Usuario());
        loteDeproducto.getUsuario().setIdUsuario(resultSet.getInt("idUsuario"));
        loteDeproducto.setProducto(new Producto());
        loteDeproducto.getProducto().setIdProducto(resultSet.getInt("idProducto"));
        loteDeproducto.setPedido(new Pedido());
        loteDeproducto.getPedido().setIdPedido(resultSet.getInt("idPedido"));
        loteDeproducto.setTotalUnidades(resultSet.getInt("totalUnidades"));
        loteDeproducto.setPagoPorunidad(resultSet.getDouble("pagoPorUnidad"));
        loteDeproducto.setTotalpagado(resultSet.getDouble("totalPagado"));
        loteDeproducto.setFechaDeVencimiento(resultSet.getString("fechaDeVencimiento"));
        loteDeproducto.setCantidadRestante(resultSet.getInt("cantidadRestante"));
        loteDeproducto.setCantidadVendida(resultSet.getInt("cantidadVendida"));
        return loteDeproducto;
    }
}
