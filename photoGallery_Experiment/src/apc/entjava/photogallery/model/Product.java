package apc.entjava.photogallery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by jacobcat on 12/2/2016.
 */
@Entity
public class Product {

    private int productId;
    private String productName;
    private int productPrice;
    private int productQuantity;
    private String productDescription;

    public Product() {
    }

    public Product(int productId, String productName, int productPrice,
                   int productQuantity, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productDescription = productDescription;

    }

     @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(nullable = false, length = 50)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Column(nullable = false)
    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }


    @Column(nullable = false, length = 3)
    public int getProductQuantity() {
        return productQuantity;
    }


    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Column(nullable = false)
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

}