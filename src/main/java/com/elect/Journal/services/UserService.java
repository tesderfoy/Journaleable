package com.elect.Journal.services;

import com.elect.Journal.models.User;
import com.elect.Journal.models.enums.Role;
import com.elect.Journal.repositories.UserRepos;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepos userRepos;
    private  final PasswordEncoder passwordEncoder;

    public  boolean  createTeacher(User user ){
        String login = user.getLogin();
        if (userRepos.findByLogin(login)!= null) return false;
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(Role.ROLE_TEACHER);
        log.info("Create teacher with login: {}", login);
        return true;
    }

    public  boolean  createStudent(User user ){
        String login = user.getLogin();
        if (userRepos.findByLogin(login)!= null) return false;
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(Role.ROLE_STUDENT);
        log.info("Create student with login: {}", login);
        return true;
    }

}
