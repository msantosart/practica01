package practica01_examen.practica01.service;

import practica01_examen.practica01.entity.estado;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import practica01_examen.practica01.repository.estadoRepository;

@Service
public class estadoService implements IestadoService {

    public static List<practica01_examen.practica01.controller.estado> getAllestado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveEstado(practica01_examen.practica01.controller.estado estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static practica01_examen.practica01.controller.estado getEstadoById(Long idEstado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Autowired /*enlazar tipos de elemntos y objetos
    en este caso enlaza nuestro servicio con el repositorio
    para poder instanciar el objetos abajo 
    */
    private estadoRepository estadoRepository;

    @Override 
    public List<estado> listEstado() {
        return (List<estado>) estadoRepository.findAll();
    }

}
