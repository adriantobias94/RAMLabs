package apc.entjava.photogallery;

import apc.entjava.photogallery.businesslogic.AddToCart;
import apc.entjava.photogallery.dao.ProductDao;
import apc.entjava.photogallery.model.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 * Created by Rafael on 12/14/2016.
 */
@ManagedBean
@SessionScoped

public class ProductBean {

    private List<Product> products;
    private String productId;


    public List<Product> getProducts() {
        products = lookupService.getProducts();
        return products;
    }

    public String getProductId() { return productId; }

    public void setProductId(String productId) {
        this.productId = productId.trim();
        if(this.productId.isEmpty()) {
            this.productId = "(No Products)";
        }
    }


    private static AddToCart lookupService = new ProductDao();

    private Product product;

    public Product getProduct() { return this.product; }
}
