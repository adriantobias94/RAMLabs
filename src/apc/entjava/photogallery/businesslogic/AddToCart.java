package apc.entjava.photogallery.businesslogic;

import apc.entjava.photogallery.model.Product;

import java.util.List;

/**
 * Created by jacobcat on 12/2/2016.
 */
public interface AddToCart {
    public Product findProducts(String id);
    public List<Product> getProducts();

}
