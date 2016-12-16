package apc.entjava.photogallery.dao;

import apc.entjava.photogallery.businesslogic.AddToCart;
import apc.entjava.photogallery.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by jacobcat on 12/2/2016.
 */

public class ProductDao implements AddToCart {

    private EntityManagerFactory emf;
    public ProductDao() {
        emf = Persistence.createEntityManagerFactory("PhotoGalleryDb");
    }


    @Override
    public Product findProducts(String id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Product product =
                    em.createQuery("select p from Product p where p.productId = :product_id",
                            Product.class)
                            .setParameter("product_id", id)
                            .getSingleResult();
            em.getTransaction().commit();
            em.close();
            return product;
        }
        catch(Exception e) {
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }

    @Override
    public List<Product> getProducts() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            List<Product> product =
                    em.createQuery("from Product", Product.class).getResultList();
            em.getTransaction().commit();
            em.close();
            return product;
        }
        catch(Exception e) {
            em.getTransaction().rollback();
            em.close();
            return null;
        }
    }
}
