package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Test1", "Test11", (byte) 25);
        userService.saveUser("Test2", "Test22", (byte) 27);
        userService.saveUser("Test3", "Test33", (byte) 31);
        userService.saveUser("Test4", "Test44", (byte) 18);

        List<User> allUsers = userService.getAllUsers();
        for (User user: allUsers) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
