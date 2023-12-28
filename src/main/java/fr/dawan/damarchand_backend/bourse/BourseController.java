package fr.dawan.damarchand_backend.bourse;


import fr.dawan.damarchand_backend.Metier.MetierDto;
import fr.dawan.damarchand_backend.Metier.MetierService;
import fr.dawan.damarchand_backend.generic.GenericController;
import fr.dawan.damarchand_backend.inventory.InventoryDto;
import fr.dawan.damarchand_backend.inventory.InventoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("bourses")
public class BourseController extends GenericController<BourseDto, BourseService> {

    public BourseController(BourseService service) {
        super(service);
    }
}
