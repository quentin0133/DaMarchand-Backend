package fr.dawan.damarchand_backend.ville;

import fr.dawan.damarchand_backend.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VilleMapper extends GenericMapper<Ville, VilleDto> {

}
