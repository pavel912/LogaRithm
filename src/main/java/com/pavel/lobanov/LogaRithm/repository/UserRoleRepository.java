package com.pavel.lobanov.LogaRithm.repository;

import com.pavel.lobanov.LogaRithm.domain.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
}
