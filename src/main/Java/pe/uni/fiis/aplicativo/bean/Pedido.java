package pe.uni.fiis.aplicativo.bean;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 20/06/2015.
 */
public class Pedido {
    private Integer idPedido;
    private String fechaDepedido;
    private Double totalPagado;
    private Proveedor proveedor;
    private List<LoteDeproducto> loteDeproducto;
    private Integer idUsuario;

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getFechaDepedido() {
        return fechaDepedido;
    }

    public void setFechaDepedido(String fechaDepedido) {
        this.fechaDepedido = fechaDepedido;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(Double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public List<LoteDeproducto> getLoteDeproducto() {
        return loteDeproducto;
    }

    public void setLoteDeproducto(List<LoteDeproducto> loteDeproducto) {
        this.loteDeproducto = loteDeproducto;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
