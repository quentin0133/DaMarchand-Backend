package fr.dawan.damarchand_backend.joueur;

import fr.dawan.damarchand_backend.generic.GenericServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//@Service
//@Slf4j // Crée automatiquement un logger pour la classe
public class JoueurServiceImpl extends GenericServiceImpl<Joueur, JoueurRepository, JoueurDto, JoueurMapper> implements JoueurService {


    public JoueurServiceImpl(JoueurRepository repository, JoueurMapper mapper) {
        super(repository, mapper);
    }

}
