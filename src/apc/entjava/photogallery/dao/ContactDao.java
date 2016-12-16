package apc.entjava.photogallery.dao;

import apc.entjava.photogallery.businesslogic.ContactInterface;
import apc.entjava.photogallery.model.Contact;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Adrian on 10/12/2016.
 */
public class ContactDao implements ContactInterface {

    private EntityManagerFactory erd;
    public ContactDao(){
        erd = Persistence.createEntityManagerFactory("PhotoGalleryDb");
    }



    @Override
    public void addContact(Contact contact) {
        EntityManager em = erd.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(contact);
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();

        }
        em.close();
    }
}
