package com.example.movie.service.iplm;

import com.example.movie.model.NameRole;
import com.example.movie.model.Role;
import com.example.movie.reporitory.IRoleRepository;
import com.example.movie.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleService implements IRoleService {
    @Autowired
    IRoleRepository roleRepository;
    @Override
    public Optional<Role> findByName(NameRole name) {
        return roleRepository.findByName(name);
    }
}
