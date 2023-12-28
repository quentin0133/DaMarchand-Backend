package fr.dawan.damarchand_backend.outil;


import fr.dawan.damarchand_backend.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("outils")
public class OutilController extends GenericController<OutilDto, OutilService> {

    public OutilController(OutilService service) {
        super(service);
    }
}
