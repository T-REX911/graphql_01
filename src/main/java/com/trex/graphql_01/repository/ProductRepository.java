package com.trex.graphql_01.repository;

import com.trex.graphql_01.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
