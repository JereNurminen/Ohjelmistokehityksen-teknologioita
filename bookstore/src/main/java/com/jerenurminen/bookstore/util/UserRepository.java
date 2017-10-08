package com.jerenurminen.bookstore.util;

import com.jerenurminen.bookstore.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    List<User> findByEmail(String email);
    List<User> findByRole(String role);
    List<User> findById(long id);

}
