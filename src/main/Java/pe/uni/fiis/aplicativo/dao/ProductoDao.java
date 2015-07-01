package pe.uni.fiis.aplicativo.dao;

import pe.uni.fiis.aplicativo.bean.LoteDeproducto;
import pe.uni.fiis.aplicativo.bean.Producto;
import pe.uni.fiis.aplicativo.bean.Usuario;

import java.util.List;

/**
 * Created by User on 28/06/2015.
 */
public interface ProductoDao {
    public List<LoteDeproducto>  extraerLotes(String c,String m,Usuario u);
    public Producto extraerProducto(String c, String m,Usuario u);
}

