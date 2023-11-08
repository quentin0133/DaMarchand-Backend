package fr.dawan.daMarchand_backend;

import fr.dawan.daMarchand_backend.entities.*;
import fr.dawan.daMarchand_backend.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RepositoryRunner implements CommandLineRunner {

    @Autowired(required = false)
    private ItemRepository repoItem;
    @Autowired(required = false)
    private InventoryRepository repoInventory;
    @Autowired(required = false)
    private BourseRepository repoBourse;
    @Autowired(required = false)
    private JoueurRepository repoJoueur;
    @Autowired(required = false)
    private VilleRepository repoVille;

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Chargement des Objects dans la BDD");
        repoItem.saveAndFlush(new Item("Pierre", ":rock:", 4.0));
        repoItem.saveAndFlush(new Item("Bois", ":wood:", 2.0));
        repoItem.saveAndFlush(new Item("Champignon", ":mushroom:", 6.0));
        repoItem.saveAndFlush(new Item("Pomme", ":apple:", 8.0));
        repoItem.saveAndFlush(new Item("Orange", ":tangerine:", 10.0));
        repoItem.saveAndFlush(new Item("Citron", ":lemon:", 9.0));
        repoItem.saveAndFlush(new Item("Tomate", ":tomato:", 8.5));
        repoItem.saveAndFlush(new Item("Carotte", ":carrot:", 7.5));
        repoItem.saveAndFlush(new Item("Onion", ":onion:", 8.0));
        repoItem.saveAndFlush(new Item("Pain", ":bread:", 5.0));
        repoItem.saveAndFlush(new Item("Viande de Qualité", ":meat_on_bone:", 15.0));
        repoItem.saveAndFlush(new Item("Beurre", ":butter:", 11.0));
        repoItem.saveAndFlush(new Item("Fromage", ":cheese:", 8.5));
        repoItem.saveAndFlush(new Item("Oeuf", ":egg:", 5.0));
        repoItem.saveAndFlush(new Item("Pierre Précieuse", ":gem:", 115.0));
        repoItem.saveAndFlush(new Item("Steak", ":cut_of_meat:", 30.0));

        /*Item a1 = new Item("Pierre", ":rock:", 4.0);
        Item a2 = new Item("Bois", ":wood:", 2.0);
        Item a3 = new Item("Champignon", ":mushroom:", 6.0);
        Item a4 = new Item("Pomme", ":apple:", 8.0);
        Item a5 = new Item("Orange", ":tangerine:", 10.0);
        Item a6 = new Item("Citron", ":lemon:", 9.0);
        Item a7 = new Item("Tomate", ":tomato:", 8.5);
        Item a8 = new Item("Carotte", ":carrot:", 7.5);
        Item a9 = new Item("Onion", ":onion:", 8.0);
        Item a10 = new Item("Pain", ":bread:", 5.0);
        Item a11 = new Item("Viande de Qualité", ":meat_on_bone:", 15.0);
        Item a12 = new Item("Beurre", ":butter:", 11.0);
        Item a13 = new Item("Fromage", ":cheese:", 8.5);
        Item a14 = new Item("Oeuf", ":egg:", 5.0);
        Item a15 = new Item("Pierre Précieuse", ":gem:", 115.0);
        Item a16 = new Item("Steak", ":cut_of_meat:", 30.0);
        repoItem.save(a1);
        repoItem.save(a2);
        repoItem.save(a3);
        repoItem.save(a4);
        repoItem.save(a5);
        repoItem.save(a6);
        repoItem.save(a7);
        repoItem.save(a8);
        repoItem.save(a9);
        repoItem.save(a10);
        repoItem.save(a11);
        repoItem.save(a12);
        repoItem.save(a13);
        repoItem.save(a14);
        repoItem.save(a15);
        repoItem.save(a16);

        //Inventory inventaire = new Inventory(true,true,1);



        /*System.out.println("Chargement des Taux dans la BDD");
        List<Bourse> Taux = new ArrayList<>();
        Taux.add(new Bourse(a1, 0.05));
        Taux.add(new Bourse(a2, -0.22));
        Taux.add(new Bourse(a3, 0.26));
        Taux.add(new Bourse(a4, -0.32));
        Taux.add(new Bourse(a5, 0.25));
        Taux.add(new Bourse(a6, -0.18));
        Taux.add(new Bourse(a7, -0.09));
        Taux.add(new Bourse(a8, 0.5));
        Taux.add(new Bourse(a9, 0.78));
        Taux.add(new Bourse(a10, -0.28));
        Taux.add(new Bourse(a11, 0.11));
        Taux.add(new Bourse(a12, -0.34));
        Taux.add(new Bourse(a13, 0.56));
        Taux.add(new Bourse(a14, -0.16));
        Taux.add(new Bourse(a15, -0.45));
        Taux.add(new Bourse(a16, 0.34));

        repoBourse.saveAllAndFlush(Taux);*/


        /*List<Bourse> Taux2 = new ArrayList<>();
        Taux2.add(new Bourse(new Item("Fromage", ":cheese:", 8.5), 0.2));
        Taux2.add(new Bourse(new Item("Pomme", ":apple:", 8.0), -0.15));
        Taux2.add(new Bourse(new Item("Citron", ":lemon:", 9.0), 0.5));
        Taux2.add(new Bourse(new Item("Pierre Précieuse", ":gem:", 115.0), +0.05));
        repoBourse.saveAllAndFlush(Taux2);
        List<Bourse> Taux3 = new ArrayList<>();
        Taux3.add(new Bourse(new Item("Carotte", ":carrot:", 7.5), 0.2));
        Taux3.add(new Bourse(new Item("Citron", ":lemon:", 9.0), -0.15));
        Taux3.add(new Bourse(new Item("Champignon", ":mushroom:", 6.0), 0.5));
        Taux3.add(new Bourse(new Item("Pierre Précieuse", ":gem:", 115.0), -0.05));
        repoBourse.saveAllAndFlush(Taux3);
        List<Bourse> Taux4 = new ArrayList<>();
        Taux4.add(new Bourse(new Item("Pierre", ":rock:", 4.0), 0.2));
        Taux4.add(new Bourse(new Item("Pomme", ":apple:", 8.0), -0.15));
        Taux4.add(new Bourse(new Item("Carotte", ":carrot:", 7.5), 0.5));
        Taux4.add(new Bourse(new Item("Pierre Précieuse", ":gem:", 115.0), +0.25));
        repoBourse.saveAllAndFlush(Taux4);*/

       /* System.out.println("Chargement des Villes dans la BDD");
        repoVille.saveAndFlush(new Ville(Taux,"La Capitale"));
        repoVille.saveAndFlush(new Ville(Taux,"Le Village du Vent"));
        repoVille.saveAndFlush(new Ville(Taux,"Le Patelin en ruines"));
        repoVille.saveAndFlush(new Ville(Taux,"Village de la Guilde des Marchands"));*/

        /*Map inv1 = new HashMap<>();
        inv1.put(6,"Pierre Précieuse");
        inv1.
        Inventory inventaire1 = new Inventory(false,false,0,inv1);*/

       // System.out.println("Chargement de deux Joueurs dans la BDD");
        //Joueur joueur1 = new Joueur(6,null,5,0,0,15,)
        //Joueur joueur2 = new Joueur(3,"La Capitale",2508,105,96,278,)



        /*lst = repo.findByPrixLessThan(30.0);
        for(Article a: lst) {
            System.out.println(a);
        }

        lst = repo.findByDescriptionLike("d___%");
        for(Article a: lst) {
            System.out.println(a);
        }*/
    }
}
