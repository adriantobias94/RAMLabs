package apc.entjava.photogallery;

import apc.entjava.photogallery.businesslogic.ItemService;
import apc.entjava.photogallery.dao.ItemDao;
import apc.entjava.photogallery.model.Items;

import javax.faces.bean.ManagedBean;

/**
 * Created by Adrian on 17/12/2016.
 */

@ManagedBean
public class ItemBean {
    private int itemId;
    private String itemName;
    private String itemPrice;
    private String itemCategory;
    private int itemQuantity;
    private String itemDescription;


    private Items items;

    private ItemService itemService = new ItemDao();

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public String deleteItem(){

        this.itemService.deleteItem(items.getItemId());

        return "index";
    }
}
