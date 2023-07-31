package br.com.iagompinheiro.usersdept.controller;

import br.com.iagompinheiro.usersdept.entities.User;
import br.com.iagompinheiro.usersdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findById(id).get();

    }

    @PostMapping("/user")
    public User created( @RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable Long id) {
         userRepository.deleteById(id);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user) {
        return userRepository.save(user);
    }


}
