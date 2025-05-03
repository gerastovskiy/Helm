package ru.cource.repository;

import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cource.model.User;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User save(@NonNull User user);
    void deleteUserByUsername(@NonNull String username);
    User findUserById(@NonNull Long id);
    User findUserByUsername(@NonNull String username);
    List<User> findAll();
}
