package pe.uni.fiis.aplicativo.bean;

/**
 * Created by User on 20/06/2015.
 */
public class Comprobante {
    private Integer idComprobante;
    private Venta venta;
    private String nombreCliente;
    private String tipodeComprobante;
    private String rucCliente;
    private Integer idUsuario;

    public Integer getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(Integer idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipodeComprobante() {
        return tipodeComprobante;
    }

    public void setTipodeComprobante(String tipodeComprobante) {
        this.tipodeComprobante = tipodeComprobante;
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        this.rucCliente = rucCliente;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
