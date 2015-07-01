package pe.uni.fiis.aplicativo.bean;

/**
 * Created by User on 20/06/2015.
 */
public class Proveedor {
    private Integer idProveedor;
    private String rubroDeproductos;
    private String nombreDeempresa;
    private String rucProveedor;
    private Integer telefono;
    private Integer idUsuario;

    public String getNombreDeempresa() {
        return nombreDeempresa;
    }

    public void setNombreDeempresa(String nombreDeempresa) {
        this.nombreDeempresa = nombreDeempresa;
    }

    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getIdProveedor() {

        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRubroDeproductos() {
        return rubroDeproductos;
    }

    public void setRubroDeproductos(String rubroDeproductos) {
        this.rubroDeproductos = rubroDeproductos;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
