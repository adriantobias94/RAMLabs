package apc.entjava.photogallery;

import apc.entjava.photogallery.dao.ContactDao;
import apc.entjava.photogallery.model.Contact;
import apc.entjava.photogallery.businesslogic.ContactInterface;
import javax.faces.bean.ManagedBean;


/**
 * Created by Adrian on 10/12/2016.
 */
@ManagedBean


public class ContactBean {

    private Contact contact;

    private ContactInterface contactInterface = new ContactDao();



    public Contact getContact() {
        if(this.contact==null) {
            this.contact = new Contact();
        }
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


    public String submit(){
        this.contactInterface.addContact(contact);

        return "index";


    }
}
