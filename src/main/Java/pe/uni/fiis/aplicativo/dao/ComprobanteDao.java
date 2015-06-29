package pe.uni.fiis.aplicativo.dao;

import pe.uni.fiis.aplicativo.bean.Comprobante;
import pe.uni.fiis.aplicativo.bean.Usuario;

import java.util.List;

/**
 * Created by User on 28/06/2015.
 */
public interface ComprobanteDao {
    public void addComprobante(Usuario usuario);
    public List<Comprobante> obtenerComprobante(Usuario usuario);
}
