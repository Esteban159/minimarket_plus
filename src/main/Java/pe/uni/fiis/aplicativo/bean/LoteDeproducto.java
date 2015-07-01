package pe.uni.fiis.aplicativo.bean;

import java.util.Date;

/**
 * Created by User on 20/06/2015.
 */
public class LoteDeproducto {
    private Integer idLoteDeProducto;
    private Usuario usuario;
    private Producto producto;
    private Pedido pedido;
    private Integer totalUnidades;
    private Double pagoPorunidad;
    private Double Totalpagado;
    private String fechaDeVencimiento;
    private Integer cantidadVendida;
    private Integer cantidadRestante;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public Integer getIdLoteDeProducto() {
        return idLoteDeProducto;
    }

    public void setIdLoteDeProducto(Integer idLoteDeProducto) {
        this.idLoteDeProducto = idLoteDeProducto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getTotalUnidades() {
        return totalUnidades;
    }

    public void setTotalUnidades(Integer totalUnidades) {
        this.totalUnidades = totalUnidades;
    }

    public Double getPagoPorunidad() {
        return pagoPorunidad;
    }

    public void setPagoPorunidad(Double pagoPorunidad) {
        this.pagoPorunidad = pagoPorunidad;
    }

    public Double getTotalpagado() {
        return Totalpagado;
    }

    public void setTotalpagado(Double totalpagado) {
        Totalpagado = totalpagado;
    }

    public Integer getCantidadRestante() {
        return cantidadRestante;
    }

    public void setCantidadRestante(Integer cantidadRestante) {
        this.cantidadRestante = cantidadRestante;
    }

    public Integer getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Integer cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
}
