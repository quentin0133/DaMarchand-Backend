package fr.dawan.damarchand_backend.bourse;

import fr.dawan.damarchand_backend.generic.GenericServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//@Service
//@Slf4j // Crée automatiquement un logger pour la classe
public class BourseServiceImpl extends GenericServiceImpl<Bourse, BourseRepository, BourseDto, BourseMapper> implements BourseService {


    public BourseServiceImpl(BourseRepository repository, BourseMapper mapper) {
        super(repository, mapper);
    }

}
