package com.example.movie.service;

import com.example.movie.model.NameRole;
import com.example.movie.model.Role;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(NameRole name);

}
