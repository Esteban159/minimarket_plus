package pe.uni.fiis.aplicativo.bean;

/**
 * Created by User on 20/06/2015.
 */
public class Usuario {
    private Integer idUsuario;
    private String nombre;
    private Integer cui;
    private String contrasenha;
    private Integer telefono;
    private String email;
    private String nombreMinimarket;
    private String direccionMinimarket;

    public String getNombreMinimarket() {
        return nombreMinimarket;
    }

    public void setNombreMinimarket(String nombreMinimarket) {
        this.nombreMinimarket = nombreMinimarket;
    }

    public String getDireccionMinimarket() {
        return direccionMinimarket;
    }

    public void setDireccionMinimarket(String direccionMinimarket) {
        this.direccionMinimarket = direccionMinimarket;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCui() {
        return cui;
    }

    public void setCui(Integer cui) {
        this.cui = cui;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
