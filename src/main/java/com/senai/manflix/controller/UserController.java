package com.senai.manflix.controller;

import com.senai.manflix.model.User;
import com.senai.manflix.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
public class UserController {

    UserRepository userRepository;

    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getOne(@PathVariable(name = "id") Long id){
        return userRepository.findById(id);
    }

    @PostMapping("/user")
    public User insertUser(@RequestBody User user){
        userRepository.save(user);
        return user;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        userRepository.save(user);
        return user;
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable(name = "id") Long id){
        userRepository.deleteById(id);
        return "Deletado com Sucesso!";
    }
}
