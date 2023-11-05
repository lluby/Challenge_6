package com.example.Challenge_6.repository;

import com.example.Challenge_6.enumeration.ERole;
import com.example.Challenge_6.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Long> {

    Optional<Roles> findByRoleName(ERole name);
}
