package com.ateneo.uaaptickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ateneo.uaaptickets.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>
{
	Role findByName(String name);
}
