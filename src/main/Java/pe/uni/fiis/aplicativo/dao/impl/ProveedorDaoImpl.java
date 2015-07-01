package pe.uni.fiis.aplicativo.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import pe.uni.fiis.aplicativo.bean.Proveedor;
import pe.uni.fiis.aplicativo.bean.Usuario;
import pe.uni.fiis.aplicativo.dao.ProveedorDao;
import pe.uni.fiis.aplicativo.dao.mapper.ProveedorMapper;

import java.util.List;

/**
 * Created by User on 28/06/2015.
 */
public class ProveedorDaoImpl implements ProveedorDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void addProveedor(Proveedor proveedor,Usuario usuario) {
        String sql="Insert Into Proveedor values(idProveedor=?,rubroDeProductoa=?,nombreDeEmpresa=?,rucProveedor=?,telefono=?";
        jdbcTemplate.update(sql,proveedor.getIdProveedor(),proveedor.getRubroDeproductos(),proveedor.getNombreDeempresa(),proveedor.getRucProveedor(),proveedor.getTelefono(),proveedor.getIdUsuario());

    }

    public List<Proveedor> obtenerProveedores(Usuario usuario) {
        String sql="Select * From Proveedor Where idUsuario=?";
        return jdbcTemplate.query(sql,new Object[]{usuario.getIdUsuario()},new ProveedorMapper());
    }
}
