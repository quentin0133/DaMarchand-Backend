package fr.dawan.damarchand_backend.item;


import fr.dawan.damarchand_backend.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("items")
public class ItemController extends GenericController<ItemDto, ItemService> {

    public ItemController(ItemService service) {
        super(service);
    }
}
