package pe.uni.fiis.aplicativo.bean;

/**
 * Created by User on 20/06/2015.
 */
public class Producto {
    private Integer idProducto;
    private String nombreDeProducto;
    private String marcaDeProducto;
    private Double precioDeVenta;
    private Integer idUsuario;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreDeProducto() {
        return nombreDeProducto;
    }

    public void setNombreDeProducto(String nombreDeProducto) {
        this.nombreDeProducto = nombreDeProducto;
    }

    public String getMarcaDeProducto() {
        return marcaDeProducto;
    }

    public void setMarcaDeProducto(String marcaDeProducto) {
        this.marcaDeProducto = marcaDeProducto;
    }

    public Double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(Double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
