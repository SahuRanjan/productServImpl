package dev.ranjan.productservimpl.repository;

import dev.ranjan.productservimpl.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
}
