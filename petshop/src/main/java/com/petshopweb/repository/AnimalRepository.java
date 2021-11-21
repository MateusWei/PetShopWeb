package com.petshopweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.petshopweb.models.Animal;

public interface AnimalRepository extends CrudRepository<Animal, String> {

}
