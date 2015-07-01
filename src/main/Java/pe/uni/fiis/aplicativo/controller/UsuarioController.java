package pe.uni.fiis.aplicativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pe.uni.fiis.aplicativo.bean.Usuario;
import pe.uni.fiis.aplicativo.service.UsuarioService;

import java.util.List;

/**
 * Created by User on 29/06/2015.
 */
@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService service;
    public void setService(UsuarioService service) {
        this.service = service;
    }
    @RequestMapping(value = "/usuario",method = RequestMethod.GET)
    public String iniciarUsuario(ModelMap model) {
        return "otro";
    }
        @RequestMapping(value = "/agregar-usuario",method = RequestMethod.GET)
    public String agregarUsuario(@RequestParam("miatributo") String atributo,ModelMap model){
        Usuario usuario=new Usuario();
        usuario.setCui(12123);
        usuario.setContrasenha("1213");
        usuario.setEmail(atributo);
        usuario.setNombre("dwhdw");
        usuario.setDireccionMinimarket("dwddvs");
        usuario.setNombreMinimarket("dwdbwdb");
        usuario.setTelefono(4313313);
        service.serviceaddusuario(usuario);
        model.addAttribute("jusuario",usuario);
        return "usuario";
    }
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String iniciando(ModelMap model){
        return "inicio";
    }

    @RequestMapping(value="/hola",method = RequestMethod.GET)
    public String registrando(ModelMap model){
        return "registro";
    }
    @RequestMapping(value="/registrando",method=RequestMethod.GET)
    public String iregistro(@RequestParam("nombre") String nombre,@RequestParam("apellido") String apellido,
                            @RequestParam("telefono") Integer telefono,@RequestParam("cui") Integer cui,
                            @RequestParam("contrasenha") String contrasenha,
                            @RequestParam("nombreMinimarket") String nombreMinimarket,@RequestParam("direccionMinimarket") String direccionMinimarket,
                            @RequestParam("email") String email
                            ,ModelMap model){
        Usuario usuario=new Usuario();
        usuario.setTelefono(telefono);
        usuario.setDireccionMinimarket(direccionMinimarket);
        usuario.setContrasenha(contrasenha);
        usuario.setNombreMinimarket(nombreMinimarket);
        usuario.setEmail(email);
        usuario.setCui(cui);
        usuario.setNombre(nombre+ " "+apellido);
        service.serviceaddusuario(usuario);
        return "inicio";
    }
    @RequestMapping(value="/validando",method = RequestMethod.GET)
    public String validar(@RequestParam("usuario") String usuario, @RequestParam("contrasenha") String contrasenha,ModelMap model){
        Usuario usuario1=new Usuario();
        usuario1.setEmail(usuario);
        usuario1.setContrasenha(contrasenha);
        List<Usuario> lista=service.serviceobtener(usuario1);
        int n=lista.size();
        int p=0;
        for(int i=0;i<n;i++){
            if(usuario1.getEmail().equals(lista.get(i).getEmail()) && usuario1.getContrasenha().equals(lista.get(i).getContrasenha()) ){
                p=1;
                i=n;
            }
        }
        if(p==1){
            return "registro";
        }
        else{
            return "inicio";
        }

    }
}
