package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Roles;
import com.example.demo.repository.RoleRepository;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    // CREATE ROLE
    public String createRole(Roles role) {
        roleRepository.save(role);
        return "Role created successfully";
    }

    // GET ALL ROLES
    public List<Roles> getAllRoles() {
        return roleRepository.findAll();
    }

    // GET ROLE BY ID
    public Roles getRoleById(int id) {
        return roleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found"));
    }

    // DELETE ROLE
    public String deleteRole(int id) {
        roleRepository.deleteById(id);
        return "Role deleted successfully";
    }
}
