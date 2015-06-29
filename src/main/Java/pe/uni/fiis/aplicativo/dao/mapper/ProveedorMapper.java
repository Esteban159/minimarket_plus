package pe.uni.fiis.aplicativo.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.uni.fiis.aplicativo.bean.Proveedor;
import pe.uni.fiis.aplicativo.bean.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 28/06/2015.
 */
public class ProveedorMapper implements RowMapper<Proveedor> {
    public Proveedor mapRow(ResultSet resultSet, int i) throws SQLException {
        Proveedor proveedor=new Proveedor();
        proveedor.setIdProveedor(resultSet.getInt("idProveedor"));
        proveedor.setRubroDeproductos(resultSet.getString("rubroDeProductos"));
        proveedor.setNombreDeempresa(resultSet.getString("nombreDeEmpresa"));
        proveedor.setRucProveedor(resultSet.getString("rucProveedor"));
        proveedor.setTelefono(resultSet.getInt("telefono"));
        proveedor.setIdUsuario(resultSet.getInt("idUsuario"));
        return proveedor;
    }
}
