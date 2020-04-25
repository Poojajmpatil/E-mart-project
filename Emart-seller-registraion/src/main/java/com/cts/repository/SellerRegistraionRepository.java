package com.cts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.SellerRegistraion;

public interface SellerRegistraionRepository extends JpaRepository<SellerRegistraion, Integer> {
	Optional<SellerRegistraion> findById(int id);
}
