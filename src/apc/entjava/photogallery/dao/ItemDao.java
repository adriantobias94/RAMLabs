package apc.entjava.photogallery.dao;

import apc.entjava.photogallery.businesslogic.ItemService;
import apc.entjava.photogallery.model.Items;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

/**
 * Created by Adrian on 17/12/2016.
 */
public class ItemDao implements ItemService {

    private EntityManagerFactory erd;
    public ItemDao(){
        erd = Persistence.createEntityManagerFactory("PhotoGalleryDb");
    }
    public void deleteItem(int itemID){

        EntityManager em = erd.createEntityManager();

        Items items;
        em.getTransaction().begin();

        try{
            items = em.find(Items.class, itemID);
            em.remove(items);
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
        }
        em.close();
    }
}
