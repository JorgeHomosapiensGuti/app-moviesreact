/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.movie.interfaces;

import com.app.movie.entities.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;
/**
 *
 * @author Andres
 */
public interface IClientRepository extends MongoRepository<Client, String> {
    @Query(value= "{email : ?0}")
    Optional<Client> findByEmail(String email);
}

