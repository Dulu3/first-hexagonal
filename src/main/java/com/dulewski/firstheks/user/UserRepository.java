package com.dulewski.firstheks.user;


import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<UserEntity, Integer> {

}

