package apc.entjava.photogallery.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Adrian on 14/12/2016.
 */
public class Items {

    private int itemId;
    private String itemName;
    private String itemPrice;
    private String itemCategory;
    private int itemQuantity;
    private String itemDescription;


    public Items(int itemId, String itemName, String itemPrice, String itemCategory, int itemQuantity, String itemDescription) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
    }
    public Items(){

    }

    @Id
    @GeneratedValue
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Column(nullable = false, length = 360)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Column(nullable = false)
    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Column(nullable = false)
    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    @Column(nullable = false)
    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Column(nullable = false, length = 400)
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

}