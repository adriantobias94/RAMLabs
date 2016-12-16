package apc.entjava.photogallery;

import apc.entjava.photogallery.businesslogic.ItemService;
import apc.entjava.photogallery.dao.ProductDao;
import apc.entjava.photogallery.model.Items;

/**
 * Created by Adrian on 15/12/2016.
 */
public class ItemBean {

    private Items item;
    private ItemService itemService = new ProductDao();
    private String itemName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Items getItem() {
        if(this.item==null) {
            this.item = new Items();
        }
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }


    private String addItem(){

        this.itemService.addItems(item);
        return "index";
    }
    private String deleteItem(){

        this.itemService.deleteItem(itemName);
        return "index";
    }


}
