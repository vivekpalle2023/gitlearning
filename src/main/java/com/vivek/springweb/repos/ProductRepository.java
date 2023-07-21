package com.vivek.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
