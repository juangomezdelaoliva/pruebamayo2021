package com.example.lab1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.lab1.model.*;
@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player,Long>{

}
