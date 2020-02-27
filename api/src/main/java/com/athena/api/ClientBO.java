package com.athena.api;

import java.util.List;

import com.athena.service.Amount;
import com.athena.service.Client;
import com.athena.service.Product;

public interface ClientBO {

    /**
     * Sum of product amounts. Assumes Currency as EURO.
     * @param clientId clientId
     * @return the sum amount
     */
    Amount getClientProductsSum(long clientId);

    /**
     * Compares the new products with existing products and saves changed
     * products.
     * @param clientId clientId
     * @param newProducts
     */
    void saveChangedProducts(long clientId, List<Product> newProducts);

    /**
     * Calculates client product sum and saves it to database.
     * @param client
     */
    void calculateAndSaveClientProductSum(Client client);

}