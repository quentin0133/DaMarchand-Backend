package fr.dawan.damarchand_backend.services;


import fr.dawan.damarchand_backend.dtos.ItemDTO;
import fr.dawan.damarchand_backend.entities.Item;
import fr.dawan.damarchand_backend.repositories.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository repository;

    @Autowired
    ModelMapper mapper;


    public  List<ItemDTO> getAllBaseItems() {
        return repository.getAllBaseItems().stream().map(a-> mapper.map(a,ItemDTO.class) ).toList();
    }

    @Override
    public ItemDTO findById(long id) {
        return mapper.map(repository.findById(id).get(),ItemDTO.class);
    }

    @Override
    public ItemDTO saveOrUpdate(ItemDTO itemDTO) {
        Item a=mapper.map(itemDTO, Item.class);
        System.out.println(a);
        return mapper.map(repository.saveAndFlush(a),ItemDTO.class);
    }

}


