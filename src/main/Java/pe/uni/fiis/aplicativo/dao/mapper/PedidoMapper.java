package pe.uni.fiis.aplicativo.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.uni.fiis.aplicativo.bean.Pedido;
import pe.uni.fiis.aplicativo.bean.Proveedor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 28/06/2015.
 */
public class PedidoMapper implements RowMapper<Pedido> {
    public Pedido mapRow(ResultSet resultSet, int i) throws SQLException {
        Pedido pedido=new Pedido();
        pedido.setIdPedido(resultSet.getInt("idPedido"));
        pedido.setProveedor(new Proveedor());
        pedido.getProveedor().setIdProveedor(resultSet.getInt("idProveedor"));
        pedido.setFechaDepedido(resultSet.getString("fechaDePedido"));
        pedido.setTotalPagado(resultSet.getDouble("totalPagado"));
        pedido.setIdUsuario(resultSet.getInt("idUsuario"));
        return pedido;
    }
}
