package ru.cource.service;

import ru.cource.model.User;
import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void createUser(User user) throws SQLException;
    void updateUser(User user) throws SQLException;
    void deleteUser(String username) throws SQLException;
    User getUser(String username) throws SQLException;
    User getUser(Long id) throws SQLException;
    List<User> getAllUsers() throws SQLException;
}