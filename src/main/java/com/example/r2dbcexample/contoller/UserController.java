package com.example.r2dbcexample.contoller;

import com.example.r2dbcexample.model.Users;
import com.example.r2dbcexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity getAllUsers(){
       return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity save(@RequestBody Users users){
        Users users1=new Users();
        users1.setId(UUID.randomUUID());
        users1.setName(users.getName());
        users1.setUsername(users.getUsername());
        users1.setAsNew();
        users1.setNewProduct(true);
        userRepository.save(users1).subscribe();
        return ResponseEntity.ok("oj");
    }
}
