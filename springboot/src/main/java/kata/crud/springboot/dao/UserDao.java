package kata.crud.springboot.dao;

import kata.crud.springboot.model.User;
import java.util.List;


public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User getUserById(int id);
}
