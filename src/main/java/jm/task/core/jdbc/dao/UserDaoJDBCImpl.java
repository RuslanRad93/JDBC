package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    private final Connection connection = Util.getConnection();

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
//
//        try (Statement statement = connection.createStatement()) {
//            String sql = """
//                    create table if not exists users(
//                    id serial primary key ,
//                    name varchar ,
//                    lastName varchar ,
//                    age int
//                    )
//                    """;
//            statement.execute(sql);
//            System.out.println("Таблица создана");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }


    public void dropUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            String sql = """
//                    drop table if exists users
//                    """;
//            statement.execute(sql);
//            System.out.println("Таблица удалена");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        String sql = """
//                insert into users (name, lastName, age) values (?,?,?)
//                """;
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//            System.out.println("Пользователь с именем " + name + " добавлен в базу данных");
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void removeUserById(long id) {
//        String sql = """
//                delete from users where id = ?
//                """;
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//            System.out.println("Пользователь удален");
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public List<User> getAllUsers() {
//        List<User> allUsers = new ArrayList<>();
//        String sql = """
//                select id, name, lastName, age from users
//                """;
//        try (Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("age"));
//                allUsers.add(user);
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return allUsers;
    }

    public void cleanUsersTable() {
//        String sql = """
//                truncate table users
//                """;
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sql);
//            System.out.println("Таблица очищена");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}
