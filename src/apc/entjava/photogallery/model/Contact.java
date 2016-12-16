package apc.entjava.photogallery.model;

        import javax.persistence.*;

/**
 * Created by Adrian on 10/12/2016.
 */
@Entity
@Table(name = "contact")
public class Contact {

    private int contactId;
    private String email;
    private String description;


    public Contact(int contactId, String email, String description) {
        this.contactId = contactId;
        this.email = email;
        this.description = description;
    }

    public Contact() {
    }

    @Id
    @GeneratedValue
    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    @Column( nullable=false, length=255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column( nullable=false, length=1000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
