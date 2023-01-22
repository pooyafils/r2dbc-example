package com.example.r2dbcexample.repository;

import com.example.r2dbcexample.model.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends ReactiveCrudRepository<Users, UUID> {
}
