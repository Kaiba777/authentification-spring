package com.example.authentification.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.authentification.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    public AppUser findByEmail(String email);

}
