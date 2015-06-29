package pe.uni.fiis.aplicativo.dao;

import pe.uni.fiis.aplicativo.bean.LoteDeproducto;
import pe.uni.fiis.aplicativo.bean.Pedido;
import pe.uni.fiis.aplicativo.bean.Usuario;

import java.util.List;

/**
 * Created by User on 28/06/2015.
 */
public interface PedidoDao {
    public void addPedido(Pedido pedido,Usuario usuario);
    public List<Pedido> obtenerPedido(Usuario usuario);
    public void addLoteDeProducto(LoteDeproducto loteDeProducto,Usuario usuario);
    public List<LoteDeproducto> obtenerLoteDeProducto(Pedido pedido,Usuario usuario);
}
