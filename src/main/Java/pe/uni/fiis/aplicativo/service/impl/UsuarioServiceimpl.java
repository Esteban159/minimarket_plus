package pe.uni.fiis.aplicativo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.uni.fiis.aplicativo.bean.Usuario;
import pe.uni.fiis.aplicativo.dao.UsuarioDao;
import pe.uni.fiis.aplicativo.service.UsuarioService;

import java.util.List;

/**
 * Created by User on 29/06/2015.
 */
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioDao usuarioDao;
    public List<Usuario> serviceobtener(Usuario u) {
        return usuarioDao.obtener(u);
    }
    public void serviceaddusuario(Usuario u) {
        usuarioDao.addusuario(u);

    }
    public UsuarioDao getUsuarioDao() {
            return usuarioDao;
    }

    public void setUsuarioDao(UsuarioDao usuarioDao) {
            this.usuarioDao = usuarioDao;
    }
}
