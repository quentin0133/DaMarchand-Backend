package fr.dawan.damarchand_backend.joueur;

import fr.dawan.damarchand_backend.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface JoueurMapper extends GenericMapper<Joueur, JoueurDto> {

}
