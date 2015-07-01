package pe.uni.fiis.aplicativo.bean;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 20/06/2015.
 */
public class Venta {
    private Integer idVenta;
    private Double totalPagado;
    private String fechaDeventa;
    private Comprobante comprobante;
    private List<DetalleVenta> detalleVenta;
    private Integer idUsuario;

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(Double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public String getFechaDeventa() {
        return fechaDeventa;
    }

    public void setFechaDeventa(String fechaDeventa) {
        this.fechaDeventa = fechaDeventa;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public List<DetalleVenta> getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
