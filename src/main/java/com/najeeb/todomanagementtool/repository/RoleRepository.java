package com.najeeb.todomanagementtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.najeeb.todomanagementtool.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
