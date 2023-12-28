package fr.dawan.damarchand_backend.inventory;

import fr.dawan.damarchand_backend.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface InventoryMapper extends GenericMapper<Inventory, InventoryDto> {

}
