package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.SellerRegistraion;
import com.cts.service.SellerRegistraionService;

@RestController
@CrossOrigin
public class SellerRegistraionController {
	
	@Autowired
	SellerRegistraionService service;
	
	@RequestMapping("/selreg")
	List<SellerRegistraion> getAllSellerRegistraion(){
	 return service.getAllSellerRegistraion();
	}
	@RequestMapping(method=RequestMethod.POST, value="/selreg")
	void addSellerRegistraion(@RequestBody SellerRegistraion sellerregistraion) {
		service.addSellerRegistraion(sellerregistraion);
	}
	@RequestMapping("selreg/{id}")
	Optional<SellerRegistraion>getSellerRegistraionDetailsById(@PathVariable int sellerId){
		return service.getSellerRegistraionDetailsById(sellerId);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/selreg")
	void updateSellerRegistraion(@RequestBody SellerRegistraion sellerregistraion) {
		service.updateSellerRegistraion(sellerregistraion);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/selreg")
	void deleteSellerRegistraion(@RequestBody SellerRegistraion sellerregistraion) {
		service.deleteSellerRegistraion(sellerregistraion);
	}
}
