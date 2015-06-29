package pe.uni.fiis.aplicativo.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import pe.uni.fiis.aplicativo.bean.*;
import pe.uni.fiis.aplicativo.dao.ComprobanteDao;
import pe.uni.fiis.aplicativo.dao.mapper.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 28/06/2015.
 */
public class ComprobanteDaoimpl implements ComprobanteDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void addComprobante(Usuario usuario) {

    }

    public List<Comprobante> obtenerComprobante(Usuario usuario) {
        List<Comprobante> comprobantes=new ArrayList<Comprobante>();
        Venta venta;
        LoteDeproducto loteDeproducto;
        Producto producto;
        List<DetalleVenta> detalleVentas;
        String sql="Select * From Comprobante Where idUsuario=? ";
        comprobantes=jdbcTemplate.query(sql,new Object[]{usuario.getIdUsuario()},new ComprobanteMapper());
        for (int i=0;i<comprobantes.size();i++){
            venta=obtenerVenta(comprobantes.get(i).getVenta().getIdVenta(),usuario);
            detalleVentas=obtenerDetalles(venta.getIdVenta(),usuario);
            for(int j=0;j<detalleVentas.size();j++){
                loteDeproducto=obtenerLoteDeproducto(detalleVentas.get(i).getLoteDeproducto().getIdLoteDeProducto(), usuario);
                producto=obtenerProducto(loteDeproducto.getProducto().getIdProducto(),usuario);
                loteDeproducto.setProducto(producto);
                detalleVentas.get(j).setLoteDeproducto(loteDeproducto);
            }
            venta.setDetalleVenta(detalleVentas);
        }
        return comprobantes;
    }

    public Venta obtenerVenta(Integer idVenta,Usuario usuario){
        String sql="Select * From Venta Where idUsuario=? And idVenta=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{usuario.getIdUsuario(),idVenta},new VentaMapper());
    }

    public List<DetalleVenta> obtenerDetalles(Integer idVenta,Usuario usuario){
        String sql="Select * From DetalleVenta Where idUsuario=? And idVenta=?";
        List<DetalleVenta> detalleVentas=new ArrayList<DetalleVenta>();
        detalleVentas=jdbcTemplate.query(sql,new Object[]{usuario.getIdUsuario(),idVenta},new DetalleVentaMapper());
        return detalleVentas;
    }
    public LoteDeproducto obtenerLoteDeproducto(Integer idLoteDeProducto,Usuario u){
        String sql="Select * From DetalleVenta Where idUsuario=? And idLoteDeProducto=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{u.getIdUsuario(),idLoteDeProducto},new LoteDeproductoMapper());
    }
    public Producto obtenerProducto(Integer idProducto,Usuario usuario){
        String sql="Select * From Producto Where idUsuario=? And idProducto=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{usuario.getIdUsuario(),idProducto},new ProductoMapper());
    }
}
