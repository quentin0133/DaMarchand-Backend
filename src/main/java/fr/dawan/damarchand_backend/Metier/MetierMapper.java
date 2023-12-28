package fr.dawan.damarchand_backend.Metier;

import fr.dawan.damarchand_backend.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MetierMapper extends GenericMapper<Metier, MetierDto> {

}
