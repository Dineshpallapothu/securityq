package com.dinesh.repo;

import com.dinesh.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface Userrepo extends JpaRepository<User,String> {
    Optional<User> findByEmail(String email);
}
