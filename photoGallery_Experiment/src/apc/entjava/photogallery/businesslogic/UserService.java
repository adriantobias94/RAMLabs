package apc.entjava.photogallery.businesslogic;

import apc.entjava.photogallery.model.User;

import java.util.List;

/**
 * Created by jacobcat on 12/2/2016.
 */
public interface UserService {
    void register(User newUser);
    User login(String userName, String password);
    public User findUsers(String id);
    public List<User> getUsers();


}
