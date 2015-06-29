package pe.uni.fiis.aplicativo.factory;

import pe.uni.fiis.aplicativo.dao.UsuarioDao;
import pe.uni.fiis.aplicativo.dao.impl.UsuarioDaoimpl;

/**
 * Created by User on 29/06/2015.
 */
public class ConsultaFactory {

        private static UsuarioDao dao;
        public static UsuarioDao getInstance(){
            if (dao == null){
                dao = new UsuarioDaoimpl();
            }
            return dao;
        }
}
