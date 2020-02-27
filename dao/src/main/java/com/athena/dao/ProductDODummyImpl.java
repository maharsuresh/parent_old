package com.athena.dao;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.athena.service.AmountImpl;
import com.athena.service.Currency;
import com.athena.service.Product;
import com.athena.service.ProductImpl;
import com.athena.service.ProductType;

public class ProductDODummyImpl implements ProductDO {

	@Override
	public List<Product> getAllProducts(long clientId) {
		List<Product> products = Arrays.asList(createProductWithAmount("5.0"),
				createProductWithAmount("6.0"));
		return products;
	}

	private Product createProductWithAmount(String amount) {
		return new ProductImpl(100, "Product 15", ProductType.BANK_GUARANTEE,
				new AmountImpl(new BigDecimal(amount), Currency.EURO));
	}

	@Override
	public List<Product> insertProduct(long clientId, Product product) {
		return null;
	}

	@Override
	public List<Product> deleteProduct(long clientId, Product product) {
		return null;
	}

	@Override
	public List<Product> updateProduct(long clientId, Product product) {
		return null;
	}

}
