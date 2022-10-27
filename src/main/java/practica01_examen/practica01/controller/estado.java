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
import practica01_examen.practica01.service.estadoService;

@Controller
public class estado {

    @Autowired
    private IestadoService estadoServive;

    @GetMapping("/estado")
    public String index(Model model) {
        List<estado> listEstado = estadoService.getAllestado();
        model.addAttribute("titulo", "Tabla Estado");
        model.addAttribute("estado", listEstado);
        return "estado";

    }

    @GetMapping("/estadoN")
    public String crearEstado(Model model) {
        List<estado> listEstado = estadoService.listEstado();
        model.addAttribute("estado", new estado());
        return "crear";

    }

    @PostMapping("/save")
    public String guardarEstado(@ModelAttribute estado estado) {
        estadoService.saveEstado(estado);
        return "redirecty:/persona";
    }

    @GetMapping("/editestado/{id}")
    public String editarEstado(@PathVariable("id") Long idEstado, Model model) {
        estado estado = estadoService.getEstadoById(idEstado);
        List<estado> listaEstado = estadoService.listEstado();
        model.addAtribute("estado", listEstado);
        return "crear";
    }

    @GetMapping("delete/{id}")
    public String eliminarEstado(@PathVariable("id") Long idEstado) {
        estadoService.delete(idEstado);
        return "redirect:/estasdo";

    }
}
