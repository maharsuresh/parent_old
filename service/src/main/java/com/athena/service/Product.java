package com.athena.service;
public interface Product {

	long getId();
	
    String getName();

    ProductType getType();
    
    Amount getAmount();
}
