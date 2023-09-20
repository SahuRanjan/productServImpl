package dev.ranjan.productservimpl.repository;

import dev.ranjan.productservimpl.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface categoryRepository extends JpaRepository<Category, UUID> {
}
