package fr.dawan.damarchand_backend.item;

import fr.dawan.damarchand_backend.generic.GenericServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//@Service
//@Slf4j // Crée automatiquement un logger pour la classe
public class ItemServiceImpl extends GenericServiceImpl<Item, ItemRepository, ItemDto, ItemMapper> implements ItemService {


    public ItemServiceImpl(ItemRepository repository, ItemMapper mapper) {
        super(repository, mapper);
    }

}
