package br.com.fiap.savemo.controller;

import br.com.fiap.savemo.entity.User;
import br.com.fiap.savemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/{userId}")
    public User findUserById(@PathVariable Long userId) {
        return userRepository.findById(userId).get();
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping(value = "/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User user) {
        User userToUpdate = userRepository.findById(userId).get();
        userToUpdate.setUserName(user.getUserName());
        userToUpdate.setUserPassword(user.getUserPassword());
        userToUpdate.setUserPhone(user.getUserPhone());
        userToUpdate.setUserEmail(user.getUserEmail());
        return userToUpdate;
    }

    @DeleteMapping(value = "/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userRepository.deleteById(userId);
    }
}
