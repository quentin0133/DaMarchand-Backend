package fr.dawan.damarchand_backend.outil;

import fr.dawan.damarchand_backend.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OutilMapper extends GenericMapper<Outil, OutilDto> {

}
