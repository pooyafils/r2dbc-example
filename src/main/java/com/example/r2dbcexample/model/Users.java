package com.example.r2dbcexample.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;

import java.util.UUID;

@Data
@ToString
public class Users implements Persistable<UUID> {
    @Id
    private UUID id;
    private String name;
    private String username;

    @Transient
    private boolean newProduct;

    @Override
    @Transient
    public boolean isNew() {
        return this.newProduct || id == null;
    }

    public Users setAsNew() {
        this.newProduct = true;
        return this;
    }
}
