package apc.entjava.photogallery.dao;

import apc.entjava.photogallery.businesslogic.ItemService;
import apc.entjava.photogallery.model.Items;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Adrian on 15/12/2016.
 */
public class ProductDao implements ItemService {

    private EntityManagerFactory erd;

    public ProductDao() {
        erd = Persistence.createEntityManagerFactory("PhotoGalleryDb");
    }

    @Override
    public void addItems(Items newItems) {
        EntityManager em = erd.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(newItems);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();

        }
        em.close();
    }

    @Override
    public Items findItem(String itemName) {
        EntityManager em = erd.createEntityManager();
        em.getTransaction().begin();
        Items c = em.find(Items.class, itemName);
        em.getTransaction().commit();

        return c;
    }
    @Override
    public void deleteItem(String itemName){
        EntityManager em = erd.createEntityManager();
        em.getTransaction().begin();
        Items c = findItem(itemName);
        try {
            em.remove(c);
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();

    }


}



