package pe.uni.fiis.aplicativo.dao;

import pe.uni.fiis.aplicativo.bean.LoteDeproducto;
import pe.uni.fiis.aplicativo.bean.Usuario;

import java.util.List;

/**
 * Created by User on 20/06/2015.
 */
public interface LoteDeProductoDao {
    public void addLoteDeProducto(LoteDeproducto loteDeproducto,Usuario usuario);
    public List<LoteDeproducto> obtenerLoteDeProducto(Usuario usuario);


}
