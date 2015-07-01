package pe.uni.fiis.aplicativo.bean;

/**
 * Created by User on 20/06/2015.
 */
public class DetalleVenta {
    private Integer idDetalleVenta;
    private Integer idVenta;
    private Integer cantidadComprada;
    private Double totalPagado;
    private LoteDeproducto loteDeproducto;
    private Integer idUsuario;

    public Integer getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(Integer idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Integer getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(Integer cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public Double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(Double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LoteDeproducto getLoteDeproducto() {
        return loteDeproducto;
    }

    public void setLoteDeproducto(LoteDeproducto loteDeproducto) {
        this.loteDeproducto = loteDeproducto;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }
}
