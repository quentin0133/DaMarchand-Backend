package fr.dawan.damarchand_backend.ville;

import fr.dawan.damarchand_backend.generic.GenericServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//@Service
//@Slf4j // Crée automatiquement un logger pour la classe
public class VilleServiceImpl extends GenericServiceImpl<Ville, VilleRepository, VilleDto, VilleMapper> implements VilleService {


    public VilleServiceImpl(VilleRepository repository, VilleMapper mapper) {
        super(repository, mapper);
    }

}
