package com.sda.spring.demo.service;

import com.sda.spring.demo.exception.RoleNotFoundException;
import com.sda.spring.demo.model.Role;
import com.sda.spring.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getRoles(){
        return roleRepository.findAll();
    }

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public Role getRoleById(Long id) {
        Role author = roleRepository.findById(id).orElseThrow(
                () -> new RoleNotFoundException(id)
        );
        return author;
    }

/*
    public Optional<Role> getRoleById(Long id) {
        return roleRepository.findById(id);
    }
*/
}
