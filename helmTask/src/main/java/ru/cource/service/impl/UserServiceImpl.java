package ru.cource.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cource.model.User;
import ru.cource.repository.UserRepository;
import ru.cource.service.UserService;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) throws SQLException {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) throws SQLException {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(String username) throws SQLException{
        userRepository.deleteUserByUsername(username);
    }

    @Override
    public User getUser(String username) throws SQLException{
        return userRepository.findUserByUsername(username);
    }

    @Override
    public User getUser(Long id) throws SQLException{
        return userRepository.findUserById(id);
    }

    @Override
    public List<User> getAllUsers() throws SQLException{
        return userRepository.findAll();
    }
}