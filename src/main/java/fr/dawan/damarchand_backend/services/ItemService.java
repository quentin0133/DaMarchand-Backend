package fr.dawan.damarchand_backend.services;

import fr.dawan.damarchand_backend.dtos.ItemDTO;

import java.util.List;

public interface ItemService {

    List<ItemDTO> getAllBaseItems();

    ItemDTO findById(long id);

    ItemDTO saveOrUpdate (ItemDTO item);
}