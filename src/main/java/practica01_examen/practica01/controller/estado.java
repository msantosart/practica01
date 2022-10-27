
package practica01_examen.practica01.controller;

//Anadir import faltante del Entitiy (tiraba error)
import practica01_examen.practica01.service.IestadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class estado {
    
    @Autowired
    private IestadoService estadoServive;
    
    

    
    
}
