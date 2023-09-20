package dev.ranjan.productservimpl.repository;

import dev.ranjan.productservimpl.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface productRepository extends JpaRepository<Product, UUID> {
}
