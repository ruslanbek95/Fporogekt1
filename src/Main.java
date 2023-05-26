import company.MyException;
import company.dao.UserDao;
import company.model.User;
import company.servise.impl.UserServiceImpl;
import enums.Gender;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Ruslan",27, Gender.MALE);
        User user1=new User(2,"Bektursun",22,Gender.MALE);
        User user2=new User(3, "Aida",18,Gender.FEMALE);
        UserServiceImpl userService = new UserServiceImpl();
        userService.add(user);
        userService.add(user1);
        userService.add(user2);
        System.out.println(userService.getAllUsers());
        try {
    System.out.println(userService.findById(4));
}catch (MyException e){
    System.out.println(e.getMessage());
}

    }

}