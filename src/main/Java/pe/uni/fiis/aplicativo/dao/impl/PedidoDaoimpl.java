package pe.uni.fiis.aplicativo.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import pe.uni.fiis.aplicativo.bean.LoteDeproducto;
import pe.uni.fiis.aplicativo.bean.Pedido;
import pe.uni.fiis.aplicativo.bean.Proveedor;
import pe.uni.fiis.aplicativo.bean.Usuario;
import pe.uni.fiis.aplicativo.dao.PedidoDao;
import pe.uni.fiis.aplicativo.dao.impl.LoteDeProductoDaoimpl;
import pe.uni.fiis.aplicativo.dao.mapper.LoteDeproductoMapper;
import pe.uni.fiis.aplicativo.dao.mapper.PedidoMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 28/06/2015.
 */
public class PedidoDaoimpl implements PedidoDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void addPedido(Pedido pedido, Usuario usuario) {
        String sql="Insert Into Pedido values(idPedido=?,idProveedor=?,fechaDePedido=?,totalPagado=?";
        jdbcTemplate.update(sql,new Object[]{pedido.getIdPedido(),pedido.getProveedor().getIdProveedor(),pedido.getFechaDepedido(),pedido.getTotalPagado(),usuario.getIdUsuario()});
        for(int i=0;i<pedido.getLoteDeproducto().size();i++){
            addLoteDeProducto(pedido.getLoteDeproducto().get(i),usuario);
        }
    }
    public void addLoteDeProducto(LoteDeproducto loteDeProducto,Usuario usuario) {
        String sql="Insert into LoteDeProducto values(?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{loteDeProducto.getIdLoteDeProducto(),usuario.getIdUsuario(),
                loteDeProducto.getPedido().getIdPedido(),loteDeProducto.getTotalUnidades(),loteDeProducto.getPagoPorunidad(),loteDeProducto.getTotalpagado(),loteDeProducto.getFechaDeVencimiento(), loteDeProducto.getCantidadRestante(), loteDeProducto.getCantidadVendida()});
    }

    public List<Pedido> obtenerPedido(Usuario usuario) {
        List<LoteDeproducto> loteDeproductos=new ArrayList<LoteDeproducto>();
        List<Pedido> pedido=new ArrayList<Pedido>();
        String sql="Select * From Pedido Where idUsuario=?";
        pedido=jdbcTemplate.query(sql,new Object[]{usuario.getIdUsuario()},new PedidoMapper());
        for(int i=0;i<pedido.size();i++){
            pedido.get(i).setLoteDeproducto(obtenerLoteDeProducto(pedido.get(i),usuario));
        }
        return pedido;
    }

    public List<LoteDeproducto> obtenerLoteDeProducto(Pedido pedido,Usuario usuario) {
        String sql="Select * From Pedido Where idUsuario=? AND idPedido=?";
        return jdbcTemplate.query(sql,new Object[]{usuario.getIdUsuario(),pedido.getIdPedido()},new LoteDeproductoMapper());
    }

}
