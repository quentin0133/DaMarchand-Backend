package fr.dawan.damarchand_backend.bourse;

import fr.dawan.damarchand_backend.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BourseMapper extends GenericMapper<Bourse, BourseDto> {

}
