package com.example.r2dbcexample.repository;

import com.example.r2dbcexample.model.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;
@Repository
public interface UserRepository extends ReactiveCrudRepository<Users, UUID> {
    Mono<Users> findById(UUID uuid);
    Mono<Void> deleteById(UUID uuid);
}