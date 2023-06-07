package com.elect.Journal.repositories;

import com.elect.Journal.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepos extends JpaRepository<User, Long> {
    User findByLogin(String login);
}
