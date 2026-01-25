package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Roles;
import com.example.demo.services.RoleService;

@RestController
@RequestMapping("/admin")
public class RoleController {

    @Autowired
    private RoleService roleService;

    // CREATE ROLE
    @PostMapping("/add")
    public String addRole(@RequestBody Roles role) {
        return roleService.createRole(role);
    }

    // GET ALL ROLES
    @GetMapping("/all")
    public List<Roles> getAllRoles() {
        return roleService.getAllRoles();
    }

    // GET ROLE BY ID
    @GetMapping("/{id}")
    public Roles getRoleById(@PathVariable int id) {
        return roleService.getRoleById(id);
    }

    // DELETE ROLE
    @DeleteMapping("/delete/{id}")
    public String deleteRole(@PathVariable int id) {
        return roleService.deleteRole(id);
    }
}
