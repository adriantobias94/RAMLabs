package apc.entjava.photogallery.businesslogic;

import apc.entjava.photogallery.model.Items;

/**
 * Created by Adrian on 15/12/2016.
 */
public interface ItemService {
    void addItems(Items newItems);
    Items findItem(String itemName);
    void deleteItem(String itemName);
}
