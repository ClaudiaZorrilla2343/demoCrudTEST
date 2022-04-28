package com.crud.democrud.controllers;

import com.crud.democrud.dtos.RolDTO;
import com.crud.democrud.dtos.UserDTO;
import com.crud.democrud.models.Rol;
import com.crud.democrud.services.Rol.IRolService;
import com.crud.democrud.services.User.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("/3000")
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class RolContoller {
    private final IRolService service;

    @GetMapping("/{id}")
    public RolDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<RolDTO> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping
    public void save(@RequestBody RolDTO user) {
        service.save(user);
    }

    @PutMapping
    public void put(@RequestBody RolDTO user) {
        service.put(user);
    }
}
