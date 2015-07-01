package pe.uni.fiis.aplicativo.service;

import pe.uni.fiis.aplicativo.bean.Usuario;

import java.util.List;

/**
 * Created by User on 29/06/2015.
 */
public interface UsuarioService {
    public List<Usuario> serviceobtener(Usuario u);
    public void serviceaddusuario(Usuario u);
}
