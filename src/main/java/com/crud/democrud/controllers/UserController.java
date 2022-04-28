package com.crud.democrud.controllers;

import com.crud.democrud.dtos.UserDTO;
import com.crud.democrud.services.User.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UserController {

    private final IUserService service;

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<UserDTO> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping
    public void save(@RequestBody UserDTO user) {
        service.save(user);
    }

    @PutMapping
    public void put(@RequestBody UserDTO user) {
        service.put(user);
    }

}