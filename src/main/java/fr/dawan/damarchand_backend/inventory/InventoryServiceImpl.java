package fr.dawan.damarchand_backend.inventory;

import fr.dawan.damarchand_backend.generic.GenericServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//@Service
//@Slf4j // Crée automatiquement un logger pour la classe
public class InventoryServiceImpl extends GenericServiceImpl<Inventory, InventoryRepository, InventoryDto, InventoryMapper> implements InventoryService {


    public InventoryServiceImpl(InventoryRepository repository, InventoryMapper mapper) {
        super(repository, mapper);
    }

}
