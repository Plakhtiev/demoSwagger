package com.swagger.demoswagger.controller;

import com.swagger.demoswagger.model.User;
import org.apache.catalina.loader.ResourceEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserController {
    @RequestMapping(method = RequestMethod.GET, path = "/user")
    public ResponseEntity<User> getUser(String id) {
        System.out.println("id = " + id);
        if("1".equals(id)) {
            User user = new User("1", "Jaroslav");
            return ResponseEntity.ok(user);

        } else {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Not found");
        }
    }
}
