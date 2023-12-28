package fr.dawan.damarchand_backend.inventory;


import fr.dawan.damarchand_backend.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("inventories")
public class InventoryController extends GenericController<InventoryDto, InventoryService> {

    public InventoryController(InventoryService service) {
        super(service);
    }
}
