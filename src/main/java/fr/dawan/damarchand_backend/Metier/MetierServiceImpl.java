package fr.dawan.damarchand_backend.Metier;

import fr.dawan.damarchand_backend.generic.GenericServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//@Service
//@Slf4j // Crée automatiquement un logger pour la classe
public class MetierServiceImpl extends GenericServiceImpl<Metier, MetierRepository, MetierDto, MetierMapper> implements MetierService {


    public MetierServiceImpl(MetierRepository repository, MetierMapper mapper) {
        super(repository, mapper);
    }

}
