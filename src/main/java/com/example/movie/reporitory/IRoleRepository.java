package com.example.movie.reporitory;

import com.example.movie.model.NameRole;
import com.example.movie.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(NameRole name);

}
