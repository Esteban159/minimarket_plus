package pe.uni.fiis.aplicativo.dao;

import pe.uni.fiis.aplicativo.bean.Usuario;

import java.util.List;

/**
 * Created by User on 20/06/2015.
 */
public interface UsuarioDao {
    public List<Usuario> obtener(Usuario u);
    public void addusuario(Usuario u);
}


