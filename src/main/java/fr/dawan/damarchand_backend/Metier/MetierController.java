package fr.dawan.damarchand_backend.Metier;


import fr.dawan.damarchand_backend.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("metiers")
public class MetierController extends GenericController<MetierDto, MetierService> {

    public MetierController(MetierService service) {
        super(service);
    }
}
