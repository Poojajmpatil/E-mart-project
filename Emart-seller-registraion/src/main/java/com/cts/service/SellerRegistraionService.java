package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.SellerRegistraion;
import com.cts.repository.SellerRegistraionRepository;

@Service
public class SellerRegistraionService {
	
	@Autowired
	SellerRegistraionRepository repo;

	public List<SellerRegistraion> getAllSellerRegistraion() {
		return (List<SellerRegistraion>)repo.findAll();
	}

	public void addSellerRegistraion(SellerRegistraion sellerregistraion) {
		repo.save(sellerregistraion);

		
	}

	public Optional<SellerRegistraion> getSellerRegistraionDetailsById(int sellerId) {
		
		 return repo.findById(sellerId);
	}

	public void updateSellerRegistraion(SellerRegistraion sellerregistraion) {
		repo.save(sellerregistraion);
	}

	public void deleteSellerRegistraion(SellerRegistraion sellerregistraion) {
		repo.save(sellerregistraion);
		
	}

}
