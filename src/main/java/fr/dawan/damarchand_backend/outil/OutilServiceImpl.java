package fr.dawan.damarchand_backend.outil;

import fr.dawan.damarchand_backend.generic.GenericServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//@Service
//@Slf4j // Crée automatiquement un logger pour la classe
public class OutilServiceImpl extends GenericServiceImpl<Outil, OutilRepository, OutilDto, OutilMapper> implements OutilService {


    public OutilServiceImpl(OutilRepository repository, OutilMapper mapper) {
        super(repository, mapper);
    }

}
