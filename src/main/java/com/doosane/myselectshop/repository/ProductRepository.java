package com.doosane.myselectshop.repository;

import com.doosane.myselectshop.entity.Product;
import com.doosane.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByUser(User user);
}
