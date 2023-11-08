package fr.dawan.daMarchand_backend.repositories;


import fr.dawan.daMarchand_backend.entities.Inventory;
import fr.dawan.daMarchand_backend.entities.Item;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query(value = "SELECT a FROM Item a")
    List<Item> findAllBaseItems();
//@Param("model") String model
   // "SELECT l FROM Livre l WHERE l.anneeSortie = ROUND((SELECT AVG(l2.anneeSortie) FROM Livre l2 JOIN l2.categorie c WHERE c=:categorie))"

/*public List<Livre> findByAvgAnnee(Categorie categorie) {
        TypedQuery<Livre> query = em.createQuery("SELECT l FROM Livre l WHERE l.anneeSortie = ROUND((SELECT AVG(l2.anneeSortie) FROM Livre l2 JOIN l2.categorie c WHERE c=:categorie))", Livre.class);
        query.setParameter("categorie", categorie);
        //System.out.println(query.getResultList());
        return query.getResultList();*/

// SELECT item.nom, item.emoji, inventory_item.amount FROM `item` INNER JOIN `inventory_item` WHERE inventory_id = 3 AND inventory_item.item_id = item.id GROUP BY item.nom;
// "UPDATE Article a SET a.prix=a.prix*1.1 WHERE a.prix>:prixmin"


    /*
    * UPDATE
    t1
SET
    t1.c1 = t2.c2,
    t1.c2 = expression,
    ...
FROM
    t1
    [INNER | LEFT] JOIN t2 ON join_predicate
WHERE
    where_predicate;
    *
    * */
    /*
    * UPDATE InventoryItem ii
    * SET
    * ii.item_id = :item
    * ii.inventory_id = :inventory
    * ii.amount = :amount
    * WHERE
    *
    * */
/*
    @Query(value = "UPDATE InventoryItem ii SET ii.item_id = :item, ii.inventory_id = :inventory, ii.amount = :amount")
    void addItemToInventoryJoueur(@Param("inventory") Inventory inventory,@Param("item") Item item, @Param("amount") int amount);
*/
    @Query(value = "SELECT a FROM Item a")
    void removeItemToInventoryJoueur();

    @Query(value = "SELECT a FROM Item a")
    void addItemToInventoryVille();

    @Query(value = "SELECT a FROM Item a")
    void removeItemToInventoryVille();
}
