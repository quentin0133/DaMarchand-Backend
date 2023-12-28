package fr.dawan.damarchand_backend.item;

import fr.dawan.damarchand_backend.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ItemMapper extends GenericMapper<Item, ItemDto> {

}
