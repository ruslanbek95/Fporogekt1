package company.servise;

import company.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    void add(User user);
    User findById(int id);
    void delete(int id);
    List<User> getAllUsers();
}
