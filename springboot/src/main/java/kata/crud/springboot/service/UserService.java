package kata.crud.springboot.service;

import kata.crud.springboot.model.User;
import java.util.List;


public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User getUserById(int id);
}


