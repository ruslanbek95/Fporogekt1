package company.servise.impl;

import company.MyException;
import company.dao.UserDao;
import company.model.User;
import company.servise.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDao();

    @Override
    public void add(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User findById(int id) throws MyException {
      //  int counter = 0;
        User user = null;
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id) {
                user = userDao.getUsers().get(i);
            }
        }
        if (user == null) {
            throw new MyException("is not id");
        }
        return user;

    }


    @Override
    public void delete(int id) {

        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (id == userDao.getUsers().get(i).getId()) {
                try {
                    userDao.getUsers().remove(userDao.getUsers().get(i));
                } catch (Exception e) {
                    throw new MyException("udalenie bolgon jok");
                }
            }

        }
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getUsers();
    }
}
