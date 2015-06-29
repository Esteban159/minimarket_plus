package pe.uni.fiis.aplicativo.dao;

import pe.uni.fiis.aplicativo.bean.Proveedor;
import pe.uni.fiis.aplicativo.bean.Usuario;

import java.util.List;

/**
 * Created by User on 28/06/2015.
 */
public interface ProveedorDao {
    public void addProveedor(Proveedor proveedor,Usuario usuario);
    public List<Proveedor> obtenerProveedores(Usuario usuario);
}
